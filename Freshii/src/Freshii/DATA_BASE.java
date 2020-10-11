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

    public static boolean removeManager(Manager manager) {
        if (managers.contains(manager)) {
            managers.remove(manager);
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

    public static boolean updateItem(Item newItem, int iId) {
        for (Item item : items) {
            if (item.getiId() == iId) {
                item = newItem;
                return true;
            }
        }
        return false;
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

    public static void addItem(Item i1) {
        items.add(i1);
    }

    public static String string() {
        return "DATA_BASE :: {\n" +
                getManagers().toString() + "\n" +
                getCustomers().toString() + "\n" +
                getItems().toString() + "\n" +
                getOrders().toString() + "\n" +
                "}";
    }
}
