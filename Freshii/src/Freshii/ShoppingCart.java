package Freshii;

import java.util.ArrayList;

public class ShoppingCart {

    private String caId;
    private ArrayList<Item> caItems = new ArrayList<>();
    private String customerId;
    private float amount = 0;


    public ShoppingCart() {
    }

    public ShoppingCart(String caId, String customerId) {
        this.caId = caId;
        this.customerId = customerId;
    }

    public ShoppingCart(String caId, ArrayList<Item> caItems, String customerId) {
        this.caId = caId;
        this.caItems = caItems;
        this.customerId = customerId;
    }

    public String getCaId() {
        return caId;
    }

    public ArrayList<Item> getCaItems() {
        return caItems;
    }

    public void setCaItems(ArrayList<Item> caItems) {
        this.caItems = caItems;
    }


    public String getCustomerId() {
        return customerId;
    }

    public boolean updateQuantity(int q, Item item) {
        if (this.exists(item)) {
            caItems.get(caItems.indexOf(item)).setQuantity(q);
            return true;
        }
        return false;
    }

    public String viewCartDetails() {
        String result = "This Cart is Empty!";
        float total = 0;

        if (this.caItems.size() > 0) {
            result = "";
            for (int i = 0; i < caItems.size(); i++) {
                result = result.concat(i + ". " + caItems.get(i).getiName() + " - " + caItems.get(i).getQuantity() + "\n");
                total += caItems.get(i).getiPrice() * caItems.get(i).getQuantity();
            }
        }
        return result.concat("\nTotal: $ " + total);
    }

    public Order checkOut() {
        if (caItems.size() < 2 || caItems.size() > 10)
            return null;
        return new Order(this.customerId, (ArrayList<Item>) this.caItems.clone(), this.amount);
    }

    private boolean exists(Item item) {
        return this.caItems.contains(item);
    }

    private void setTotalAmount() {
        this.amount = 0;
        for (int i = 0; i < caItems.size(); i++) {
            amount += caItems.get(i).getiPrice() * caItems.get(i).getQuantity();
        }
    }

    public float getAmount() {
        return amount;
    }

    public void addItem(Item item) {
        this.caItems.add(item);
        this.setTotalAmount();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "caId='" + caId + '\'' +
                ", caItems=" + caItems +
                ", customerId='" + customerId + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void clearCart() {
        this.caItems.clear();
        this.setTotalAmount();
    }

    public int getTotalItems() {

        int sum = 0;
        for (Item item : this.caItems) {
            sum += item.getQuantity();
        }

        return sum;
    }
}
