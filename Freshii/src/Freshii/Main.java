package Freshii;

import java.util.Date;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        // write your code here
        Manager m1 = new Manager("Steve", "123456", "Man1", "man@man.com");
        DATA_BASE.addManager(m1);
//        System.out.println(m1);

        Customer c1 = new Customer("Olive-1", "Olive", "olive@gmail.com");
        DATA_BASE.addCustomer(c1);
//        System.out.println(c1);

        PaymentInfo pi = new PaymentInfo("1", c1.getcId());
        pi.addPaymentMethod(new PaymentDetail("Card 1", "C1", "Master", 1234567890, 111, new Date()));

        c1.setPaymentInfo(pi);
//        System.out.println(c1);

        ShippingInfo si = new ShippingInfo(c1.getcId() + "-1", "Ontario");


        Item i1 = new Item(0, (float) 11.99, "medium", "Tuna", "sea-food", null, null, null, null);
        DATA_BASE.addItem(i1);
        Item i2 = new Item(1, (float) 5.99, "medium", "Milk", "dairy", null, null, null, null);
        DATA_BASE.addItem(i2);
        Item i3 = new Item(2, (float) 7.99, "medium", "Burger", "fast-food", null, null, null, null);
        DATA_BASE.addItem(i3);
        Item i4 = new Item(3, (float) 12.99, "medium", "Onion", "vegetable", null, null, null, null);
        DATA_BASE.addItem(i4);

        Item selected = (Item) c1.searchItem("Tuna").clone();
        selected.setiSize("large");
        c1.shop(selected, 2);
        System.out.println(c1.getShoppingCart());
        Order newOrder = c1.checkOut();
        System.out.println(newOrder);
        c1.selectShipping(si);
        c1.selectPaymentMethod(pi.getCards().get(0));
        c1.pay();
        Order foundOrder = m1.searchOrder("Olive-1-0");
        System.out.println(m1.changeOrderStatus(foundOrder, "delivering"));

        System.out.println(m1.searchOrder("Olive-1-0"));

        System.out.println(DATA_BASE.string());

    }


}
