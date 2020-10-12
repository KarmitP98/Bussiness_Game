package Freshii;

import java.util.ArrayList;

public class Customer {

    private String cId;
    private String cName;
    private String cEmail;
    private int phone;
    private ArrayList<Order> orders = new ArrayList<>();
    private ShoppingCart shoppingCart = new ShoppingCart();

    private Order temp = new Order();

    public Customer() {
    }

    public Customer(String cId, String cName, String cEmail, int phone) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
        this.phone = phone;

        this.shoppingCart = new ShoppingCart(cId + "-1", cId);

    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getcEmail() {
        return cEmail;
    }

    public void setcEmail(String cEmail) {
        this.cEmail = cEmail;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public void setOrders(ArrayList<Order> orders) {
        this.orders = orders;
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public void setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public Item searchItem(String iName) {
        return DATA_BASE.searchItem(iName);
    }

    public boolean shop(Item item) {
        this.shoppingCart.addItem(item);
        return true;
    }

    public Order checkOut() {
        this.temp = this.shoppingCart.checkOut();
        if (this.temp != null) {
            this.temp.setOrderId(this.cId + "-" + this.orders.size());
            this.temp.setOrderStatus("unpaid");
            this.temp.setShippingLocation("Ontario");
        }

        return temp;
    }

    public void selectShipping(ShippingInfo shippingInfo) {
        if (shoppingCart.getTotalItems() == 0)
            this.temp.setShippingLocation(shippingInfo.getsLocation());
    }

    public void pay() {
        this.temp.setOrderStatus("paid");
        DATA_BASE.addOrder(this.temp);
        this.orders.add(this.temp);
        this.shoppingCart.clearCart();
        this.temp = new Order();
    }

    public ArrayList<Item> searchItemCategory(String category) {
        return DATA_BASE.searchByCategory(category);
    }

    public String checkOrderStatus(String orderId, String cId) {
        String status = "No Order Found!";

        for (Order order : orders) {
            if (order.getOrderId().equals(orderId) && order.getCustomerId().equals(cId)) {
                status = order.getOrderStatus();
            }
        }
        return status;
    }

    public boolean cancelOrder(String orderId, String cId) {
        for (Order order : orders) {
            if (order.getOrderId().equals(orderId) && order.getCustomerId().equals(cId) && !order.getOrderStatus().equals("signed for")) {
                orders.remove(order);
                return DATA_BASE.removeOrder(order);
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cEmail='" + cEmail + '\'' +
                ", orders=" + orders +
                ", shoppingCart=" + shoppingCart +
//                ", paymentInfo=" + paymentInfo +
                '}';
    }
}
