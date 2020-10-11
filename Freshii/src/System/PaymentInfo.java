package System;

import java.util.ArrayList;

public class PaymentInfo {

    private int pId, cId;
    private ArrayList<PaymentDetail> cards;

    public PaymentInfo(int pId, int cId, ArrayList<PaymentDetail> cards) {
        this.pId = pId;
        this.cId = cId;
        this.cards = cards;
    }

    public int getpId() {
        return pId;
    }

    public void setpId(int pId) {
        this.pId = pId;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public ArrayList<PaymentDetail> getCards() {
        return cards;
    }

    public void setCards(ArrayList<PaymentDetail> cards) {
        this.cards = cards;
    }

    public boolean addPaymentMethod(PaymentDetail card) {
        this.cards.add(card);
        return true;
    }

    public boolean removePaymentMethod(PaymentDetail card) {
        if (this.exists(card)) {
            this.cards.remove(card);
        }
        return false;
    }


    private boolean exists(PaymentDetail card) {
        return this.getCards().contains(card);
    }


}
