package Freshii;

import java.util.ArrayList;

public class PaymentInfo {

    private String pId, cId;
    private ArrayList<PaymentDetail> cards = new ArrayList<>();

    public PaymentInfo(String pId, String cId) {
        this.pId = pId;
        this.cId = cId;
    }

    public PaymentInfo(String pId, String cId, ArrayList<PaymentDetail> cards) {
        this.pId = pId;
        this.cId = cId;
        this.cards = cards;
    }

    public PaymentInfo() {
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
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

    @Override
    public String toString() {
        return "PaymentInfo{" +
                "pId='" + pId + '\'' +
                ", cId='" + cId + '\'' +
                ", cards=" + cards +
                '}';
    }
}
