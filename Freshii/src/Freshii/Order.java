package Freshii;

import java.util.ArrayList;

public class Order implements Cloneable {
    private String customerId, orderId, shippingLocation, orderStatus;
    private ArrayList<Item> items = new ArrayList<>();
    private ArrayList<Integer> quantities = new ArrayList<>();
    private float amount;


    public Order() {
    }

    public Order(String customerId) {
        this.customerId = customerId;
    }

    public Order(String customerId, ArrayList<Item> items, ArrayList<Integer> quantities, float amount) {
        this.customerId = customerId;
        this.items = items;
        this.quantities = quantities;
        this.amount = amount;
    }

    public Order(String customerId, String orderId, String orderStatus, ArrayList<Item> items, ArrayList<Integer> quantities) {
        this.customerId = customerId;
        this.orderId = orderId;
        this.orderStatus = orderStatus;
        this.items = items;
        this.quantities = quantities;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getShippingLocation() {
        return shippingLocation;
    }

    public void setShippingLocation(String shippingLocation) {
        this.shippingLocation = shippingLocation;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(ArrayList<Integer> quantities) {
        this.quantities = quantities;
    }

    public float getAmount() {
        float amt = 0;
        for (int i = 0; i < items.size(); i++) {
            amt += items.get(i).getiPrice() * quantities.get(i);
        }
        return amt;
    }

    public Order getOrder() {
        this.amount = getAmount();
        return this;
    }

    @Override
    public String toString() {
        return "Order{" +
                "customerId='" + customerId + '\'' +
                ", orderId='" + orderId + '\'' +
                ", shippingLocation='" + shippingLocation + '\'' +
                ", orderStatus='" + orderStatus + '\'' +
                ", items=" + items +
                ", quantities=" + quantities +
                ", amount=" + amount +
                '}';
    }
}
