package Freshii;

import java.util.ArrayList;

public class DATA_BASE {

    private static ArrayList<Customer> customers = new ArrayList<>();
    private static ArrayList<Manager> managers = new ArrayList<>();
    private static ArrayList<Item> items = new ArrayList<>();
    private static ArrayList<Order> orders = new ArrayList<>();

    public DATA_BASE() {
    }

    public DATA_BASE(ArrayList<Customer> customers, ArrayList<Manager> managers, ArrayList<Item> items, ArrayList<Order> orders) {
        DATA_BASE.customers = customers;
        DATA_BASE.managers = managers;
        DATA_BASE.items = items;
        DATA_BASE.orders = orders;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void setCustomers(ArrayList<Customer> customers) {
        DATA_BASE.customers = customers;
    }

    public static ArrayList<Manager> getManagers() {
        return managers;
    }

    public static void setManagers(ArrayList<Manager> managers) {
        DATA_BASE.managers = managers;
    }

    public static ArrayList<Item> getItems() {
        return items;
    }

    public static void setItems(ArrayList<Item> items) {
        DATA_BASE.items = items;
    }

    public static ArrayList<Order> getOrders() {
        return orders;
    }

    public static void setOrders(ArrayList<Order> orders) {
        DATA_BASE.orders = orders;
    }

    public static boolean addManager(Manager manager) {
        if (!managers.contains(manager)) {
            managers.add(manager);
            return true;
        }
        return false;
    }

    public static boolean removeManager(String name) {

        for (Manager manager : managers) {
            if (manager.getmName().equalsIgnoreCase(name)) {
                managers.remove(manager);
                return true;
            }
        }
        return false;
    }

    public static boolean removeOrder(Order order) {
        if (orders.contains(order)) {
            orders.remove(order);
            return true;
        }
        return false;
    }

    public static boolean addCustomer(Customer customer) {
        if (!customers.contains(customer)) {
            customers.add(customer);
            return true;
        }
        return false;
    }

    public static void addOrder(Order order) {
        orders.add(order);
    }

    public static Item searchItem(String itemName) {
        for (Item item : items) {
            if (item.getiName().equalsIgnoreCase(itemName))
                return item;
        }
        return null;
    }

    public static void updateItem(Item newItem, int iId) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getiId() == iId) {
                items.set(i, newItem);
            }
        }
    }

    public static Order searchOrder(String oId) {
        for (Order order : orders) {
            if (order.getOrderId().equalsIgnoreCase(oId))
                return order;
        }
        return null;
    }

    public static Order updateOrderStatus(Order order, String newStatus) {
        if (orders.contains(order)) {
            for (Order order1 : orders) {
                if (order1.equals(order)) {
                    order1.setOrderStatus(newStatus);
                    return order1;
                }
            }
        }
        return null;
    }

    public static boolean addItem(Item i1) {
        for (Item item : items) {
            if (item.getiId() == i1.getiId()) {
                updateItem(i1, item.getiId());
                return false;
            }
        }
        items.add(i1);
        return true;
    }

    public static boolean removeItem(String name) {
        for (Item item : items) {
            if (item.getiName().equalsIgnoreCase(name)) {
                items.remove(item);
                return true;
            }
        }
        return false;
    }

    public static String string() {
        return "DATA_BASE :: {\n" +
                getManagers().toString() + "\n" +
                getCustomers().toString() + "\n" +
                getItems().toString() + "\n" +
                getOrders().toString() + "\n" +
                "}";
    }

    public static ArrayList<Item> searchByCategory(String category) {
        ArrayList<Item> result = new ArrayList<>();

        for (Item item : items) {
            if (item.getCategory().equals(category)) {
                result.add(item);
            }
        }

        return result;
    }

    public static void clearClass() {
        customers.clear();
        managers.clear();
        orders.clear();
        items.clear();
    }
}
