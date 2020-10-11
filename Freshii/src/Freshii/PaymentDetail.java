package Freshii;

import java.util.Date;

public class PaymentDetail {

    private final String name;
    private final String company;
    private final String type;
    private final int number;
    private final int cvv;
    private final Date expiryDate;

    public PaymentDetail(String name, String company, String type, int number, int cvv, Date expiryDate) {
        this.name = name;
        this.company = company;
        this.type = type;
        this.number = number;
        this.cvv = cvv;
        this.expiryDate = expiryDate;
    }

    public String getName() {
        return name;
    }

    public String getCompany() {
        return company;
    }

    public String getType() {
        return type;
    }

    public int getNumber() {
        return number;
    }

    public int getCvv() {
        return cvv;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    @Override
    public String toString() {
        return "Card{" +
                "name='" + name + '\'' +
                ", company='" + company + '\'' +
                ", type='" + type + '\'' +
                ", number=" + number +
                ", expiryDate=" + expiryDate +
                '}';
    }
}
