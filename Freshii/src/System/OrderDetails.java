package System;

import java.util.ArrayList;

public class OrderDetails {

    private int oId;
    private ArrayList<Item> items;
    private ArrayList<Integer> iquantity;
    private float amount = 0;

    public OrderDetails(int oId, ArrayList<Item> items, ArrayList<Integer> iquantity) {
        this.oId = oId;
        this.items = items;
        this.iquantity = iquantity;
    }

    public int getoId() {
        return oId;
    }

    public void setoId(int oId) {
        this.oId = oId;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public ArrayList<Integer> getIquantity() {
        return iquantity;
    }

    public void setIquantity(ArrayList<Integer> iquantity) {
        this.iquantity = iquantity;
    }

    public float calcPrice() {
        this.amount = 0;
        for (int i = 0; i < this.items.size(); i++) {
            this.amount += this.items.get(i).getiPrice() * this.iquantity.get(i);
        }
        return this.amount;
    }
}

