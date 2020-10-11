package System;

import java.util.ArrayList;
import java.util.Date;

public class ShoppingCart {

    private int caId;
    private ArrayList<Item> caItems;
    private ArrayList<Integer> caQuantity;

    public ShoppingCart(int caId, ArrayList<Item> caItems, ArrayList<Integer> caQuantity) {
        this.caId = caId;
        this.caItems = caItems;
        this.caQuantity = caQuantity;
    }

    public int getCaId() {
        return caId;
    }

    public void setCaId(int caId) {
        this.caId = caId;
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

    public boolean updateQuantity(int q, Item item) {
        if (this.exists(item)) {
            int index = this.caItems.indexOf(item);
            this.caQuantity.set(index, q);
        }
        return false;
    }

    public String viewCartDetails() {
        String result = "This Cart is Empty!";

        if (this.caItems.size() > 0) {
            result = "";
            for (int i = 0; i < caItems.size(); i++) {
                result = result.concat(i + ". " + caItems.get(i).getiName() + " - " + caQuantity.get(i) + "\n");
            }
        }
        return result;
    }

    public Order checkOut() {
        return new Order(1, 1, new Date(), new Date(), "unpaid", new OrderDetails(1, caItems, caQuantity));
    }

    private boolean exists(Item item) {
        return this.caItems.contains(item);
    }

}
