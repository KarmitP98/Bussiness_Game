package Freshii;

import java.util.ArrayList;

public class ShoppingCart {

    private String caId;
    private ArrayList<Item> caItems = new ArrayList<>();
    private ArrayList<Integer> caQuantity = new ArrayList<>();
    private String customerId;
    private float amount = 0;


    public ShoppingCart() {
    }

    public ShoppingCart(String caId, String customerId) {
        this.caId = caId;
        this.customerId = customerId;
    }

    public ShoppingCart(String caId, ArrayList<Item> caItems, ArrayList<Integer> caQuantity, String customerId) {
        this.caId = caId;
        this.caItems = caItems;
        this.caQuantity = caQuantity;
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

    public ArrayList<Integer> getCaQuantity() {
        return caQuantity;
    }

    public void setCaQuantity(ArrayList<Integer> caQuantity) {
        this.caQuantity = caQuantity;
    }

    public String getCustomerId() {
        return customerId;
    }

    public boolean updateQuantity(int q, Item item) {
        if (this.exists(item)) {
            int index = this.caItems.indexOf(item);
            this.caQuantity.set(index, q);
        }
        return false;
    }

    public String viewCartDetails() {
        String result = "This Cart is Empty!";
        float total = 0;

        if (this.caItems.size() > 0) {
            result = "";
            for (int i = 0; i < caItems.size(); i++) {
                result = result.concat(i + ". " + caItems.get(i).getiName() + " - " + caQuantity.get(i) + "\n");
                total += caItems.get(i).getiPrice() * caQuantity.get(i);
            }
        }
        return result.concat("\nTotal: $ " + total);
    }

    public Order checkOut() {
        return new Order(this.customerId, (ArrayList<Item>) this.caItems.clone(), (ArrayList<Integer>) this.caQuantity.clone(), this.amount);
    }

    private boolean exists(Item item) {
        return this.caItems.contains(item);
    }

    private void setTotalAmount() {
        this.amount = 0;
        for (int i = 0; i < caItems.size(); i++) {
            amount += caItems.get(i).getiPrice() * caQuantity.get(i);
        }
    }

    public float getAmount() {
        return amount;
    }

    public void addItem(Item item, int q) {
        this.caItems.add(item);
        this.caQuantity.add(q);
        this.setTotalAmount();
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "caId='" + caId + '\'' +
                ", caItems=" + caItems +
                ", caQuantity=" + caQuantity +
                ", customerId='" + customerId + '\'' +
                ", amount=" + amount +
                '}';
    }

    public void clearCart() {
        this.caQuantity.clear();
        this.caItems.clear();
        this.setTotalAmount();
    }
}
