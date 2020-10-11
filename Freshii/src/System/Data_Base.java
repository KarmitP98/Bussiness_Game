package System;

import java.util.ArrayList;

public class Data_Base {

    private ArrayList<Customer> customers;
    private ArrayList<Manager> managers;
    private ArrayList<Item> items;
    private ArrayList<Order> orders;

    public Data_Base() {
    }

    public Data_Base(ArrayList<Customer> customers, ArrayList<Manager> managers, ArrayList<Item> items, ArrayList<Order> orders) {
        this.customers = customers;
        this.managers = managers;
        this.items = items;
        this.orders = orders;
    }

    public ArrayList<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(ArrayList<Customer> customers) {
        this.customers = customers;
    }

    public void addCustomer(Customer customer) {
        customer.setcId(this.customers.size());
        this.customers.add(customer);
    }

    public void removeCustomer(Customer customer) {
        this.customers.remove(customer);
    }

    public ArrayList<Manager> getManagers() {
        return managers;
    }

    public void setManagers(ArrayList<Manager> managers) {
        this.managers = managers;
    }

    public void addManager(Manager manager) {
        manager.setmId(this.managers.size());
        this.managers.add(manager);
    }

    public void removeManager(Manager manager) {
        this.managers.remove(manager);
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public void updateItem(Item item) {
        this.items.set(item.getiId(), item);
    }


    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public Order retrieveOrder(int oId) {
        return this.orders.get(oId);
    }

    public void addOrder() {

    }

}
