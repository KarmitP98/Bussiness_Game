package Freshii;

import java.util.ArrayList;

public class Customer {

    private String cId;
    private String cName;
    private String cEmail;
    private ArrayList<Order> orders = new ArrayList<>();
    private ShoppingCart shoppingCart = new ShoppingCart();
    private PaymentInfo paymentInfo = new PaymentInfo();

    private Order temp = new Order();

    public Customer() {
    }

    public Customer(String cId, String cName, String cEmail) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;

        this.shoppingCart = new ShoppingCart(cId + "-1", cId);

    }

    public PaymentInfo getPaymentInfo() {
        return paymentInfo;
    }

    public void setPaymentInfo(PaymentInfo paymentInfo) {
        this.paymentInfo = paymentInfo;
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

    public void addPaymentMethod(PaymentDetail card) {
        paymentInfo.addPaymentMethod(card);
    }

    public void removePaymentMethod(PaymentDetail card) {
        paymentInfo.removePaymentMethod(card);
    }

    public Item searchItem(String iName) {
        return DATA_BASE.searchItem(iName);
    }

    public boolean shop(Item item, int q) {
        this.shoppingCart.addItem(item, q);
        return true;
    }

    public Order checkOut() {
        this.temp = this.shoppingCart.checkOut();
        this.temp.setOrderId(this.cId + "-" + this.orders.size());
        this.temp.setOrderStatus("unpaid");
        this.shoppingCart.clearCart();
        return temp;
    }

    public void selectShipping(ShippingInfo shippingInfo) {
        this.temp.setShippingLocation(shippingInfo.getsLocation());
    }

    public void selectPaymentMethod(PaymentDetail paymentDetail) {

    }

    public void pay() {
        this.temp.setOrderStatus("paid");
        DATA_BASE.addOrder(this.temp);
        this.temp = new Order();
    }

    @Override
    public String toString() {
        return "Customer{" +
                "cId='" + cId + '\'' +
                ", cName='" + cName + '\'' +
                ", cEmail='" + cEmail + '\'' +
                ", orders=" + orders +
                ", shoppingCart=" + shoppingCart +
                ", paymentInfo=" + paymentInfo +
                '}';
    }
}
