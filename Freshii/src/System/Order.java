package System;

import java.util.Date;

public class Order {

    private int cId, sId;
    private Date dateCreated, dateShipped;
    private String oStatus;
    private OrderDetails oDetails;

    public Order(int cId, int sId, Date dateCreated, Date dateShipped, String oStatus, OrderDetails oDetails) {
        this.cId = cId;
        this.sId = sId;
        this.dateCreated = dateCreated;
        this.dateShipped = dateShipped;
        this.oStatus = oStatus;
        this.oDetails = oDetails;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
        this.cId = cId;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
        this.sId = sId;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getDateShipped() {
        return dateShipped;
    }

    public void setDateShipped(Date dateShipped) {
        this.dateShipped = dateShipped;
    }

    public String getoStatus() {
        return oStatus;
    }

    public void setoStatus(String oStatus) {
        this.oStatus = oStatus;
    }

    public OrderDetails getoDetails() {
        return oDetails;
    }

    public void setoDetails(OrderDetails oDetails) {
        this.oDetails = oDetails;
    }

    public Order placeOrder() {
        return this;
    }
}

