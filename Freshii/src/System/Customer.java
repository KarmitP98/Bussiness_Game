package System;

public class Customer {

    private int cId;
    private String cName;
    private String cEmail;

    public Customer(int cId, String cName, String cEmail) {
        this.cId = cId;
        this.cName = cName;
        this.cEmail = cEmail;
    }

    public int getcId() {
        return cId;
    }

    public void setcId(int cId) {
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
}
