package Freshii;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Tests {

    public Tests() {
    }

    public static void main(String[] args) {
    }

    @SuppressWarnings("ArraysAsListWithZeroOrOneArgument")
    @org.junit.Before
    public void setUp() {
        Manager m1 = new Manager("Steve", "steve@freshii.com", "Steve-1", "123456");
        DATA_BASE.addManager(m1);
        Manager m2 = new Manager("Rob", "rob@freshii.com", "Steve-1", "6543321");
        DATA_BASE.addManager(m2);

        Customer c1 = new Customer("Olive-1", "Olive", "olive@gmail.com", 123456);
        DATA_BASE.addCustomer(c1);
        Customer c2 = new Customer("Tammy-2", "Tammy", "tammy@gmail.com", 654321);
        DATA_BASE.addCustomer(c2);

        Item i1 = new Item(0, (float) 11.99, "medium", "Tuna Sandwich", "sea-food",
                new ArrayList<>(Arrays.asList("Fish", "Bread", "Sauce")),
                new ArrayList<>(Arrays.asList("None")),
                new ArrayList<>(Arrays.asList("Vitamin C", "Vitamin A")),
                new ArrayList<>(Arrays.asList((float) 1.0, (float) 2.0, (float) 3.0)), 1);
        DATA_BASE.addItem(i1);
        Item i2 = new Item(1, (float) 5.99, "medium", "Butter", "dairy",
                new ArrayList<>(Arrays.asList("Milk", "Yeast", "Curd")),
                new ArrayList<>(Arrays.asList("Milk")),
                new ArrayList<>(Arrays.asList("Vitamin D")),
                new ArrayList<>(Arrays.asList((float) 1.0, (float) 2.0, (float) 3.0)), 1);
        DATA_BASE.addItem(i2);
        Item i3 = new Item(2, (float) 7.99, "medium", "Burger", "fast-food",
                new ArrayList<>(Arrays.asList("Buns", "Lettuce", "Sauce", "Tomato", "Patty")),
                new ArrayList<>(Arrays.asList("None")),
                new ArrayList<>(Arrays.asList("None")),
                new ArrayList<>(Arrays.asList((float) 1.0, (float) 2.0, (float) 3.0)), 1);
        DATA_BASE.addItem(i3);
        Item i4 = new Item(3, (float) 12.99, "medium", "Salad", "vegetable",
                new ArrayList<>(Arrays.asList("Lettuce", "Tomato", "Onion", "Garlic", "Sauce", "Olives")),
                new ArrayList<>(Arrays.asList("None")),
                new ArrayList<>(Arrays.asList("Vitamin C", "Vitamin D", "Omega D3")),
                new ArrayList<>(Arrays.asList((float) 1.0, (float) 2.0, (float) 3.0)), 1);
        DATA_BASE.addItem(i4);
        Item i5 = new Item(4, (float) 6.99, "medium", "Cheese", "dairy",
                new ArrayList<>(Arrays.asList("Milk", "Yeast", "Curd", "Water")),
                new ArrayList<>(Arrays.asList("Milk")),
                new ArrayList<>(Arrays.asList("Vitamin D")),
                new ArrayList<>(Arrays.asList((float) 1.0, (float) 2.0, (float) 3.0)), 1);
        DATA_BASE.addItem(i5);
    }

    @org.junit.After
    public void tearDown() {
        DATA_BASE.clearClass();
    }

    /*
    Check whether data has been added to the DATA_BASE
     */
    @org.junit.Test
    public void Data_Added() {
        assertEquals(2, DATA_BASE.getCustomers().size(), "There are 2 customers in the system!");
        assertEquals(2, DATA_BASE.getManagers().size(), "There are 2 customers in the system!");
        assertEquals(5, DATA_BASE.getItems().size(), "There are 5 items in the system!");
        assertEquals(0, DATA_BASE.getOrders().size(), "There are 0 orders in the system!");
    }

    /**
     * Check if Customer can search for an item
     */
    @org.junit.Test
    public void searchItem() {
        try {
            // Search for item with name "Burger"
            Item item = (Item) DATA_BASE.getCustomers().get(0).searchItem("Burger").clone();
            assertEquals("fast-food", item.getCategory(), "Item is of Dairy Category!");

            item = (Item) DATA_BASE.getCustomers().get(0).searchItem("Tuna Sandwich").clone();
            assertEquals(11, (int) item.getiPrice(), "Tuna Sandwich is $ 11.99!");

            // Search for items with category "dairy"
            @SuppressWarnings("unchecked") ArrayList<Item> items = (ArrayList<Item>) DATA_BASE.getCustomers().get(0).searchItemCategory("dairy").clone();
            assertEquals(2, items.size(), "There are 2 dairy items!");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test for manager being able to edit an item
     */
    @Test
    public void editItem() {
        try {
            Manager m1 = DATA_BASE.getManagers().get(0);

            Item i1 = (Item) DATA_BASE.getItems().get(1).clone();

            i1.setiPrice((float) 20.00);
            m1.updateItem(i1, i1.getiId());

            assertEquals(20.00, DATA_BASE.getItems().get(1).getiPrice(), "Item price has not changed!");

            Customer c1 = DATA_BASE.getCustomers().get(0);

            Item i2 = (Item) c1.searchItem("Butter").clone();

            assertEquals(20.00, i2.getiPrice(), "Item Price has not changed!");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Removing Manager and Item
     */
    @Test
    public void removeItemandManager() {
        assertEquals(2, DATA_BASE.getManagers().size(), "There must be 2 managers in the Data base!");

        DATA_BASE.removeManager("Rob");
        assertEquals(1, DATA_BASE.getManagers().size(), "There must be 1 manager in the Data base!");

        Manager m1 = DATA_BASE.getManagers().get(0);

        assertFalse(m1.removeItem("Soap"), "Soap is not an item!");

        assertTrue(m1.removeItem("Cheese"), "Item name 'Cheese' must be removed!");

        assertNull(m1.searchItem("Cheese"), "Cheese has been removed!");

    }

    /**
     * Process of ordering items without any failed attempt.
     */
    @Test
    public void orderItem() {
        try {
            Customer c1 = DATA_BASE.getCustomers().get(0);
            Customer c2 = DATA_BASE.getCustomers().get(1);

            Item item1 = (Item) c1.searchItem("Cheese").clone();
            item1.setiSize("small");
            item1.setQuantity(3);
            c1.shop(item1);

            // The cart must have atleast 2 and atmost 10 items to check out
            assertNull(c1.checkOut(), "There must be atleast 2 or maximum 10 items to checkout");

            Item item2 = (Item) c1.searchItem("Burger").clone();
            item2.setiSize("large");
            item2.setQuantity(2);
            c1.shop(item2);

            assertEquals(5, c1.getShoppingCart().getTotalItems(), "There must be 5 total items in the cart!");

            assertEquals("large", c1.getShoppingCart().getCaItems().get(1).getiSize(), "Burger must be large!");

            Order o1 = c1.checkOut();

            assertEquals(2, o1.getItems().size(), "There must be 2 items in the Order!");

            c1.pay();

            assertEquals(0, c1.getShoppingCart().getTotalItems(), "The cart should be empty after order has been placed!");

            assertEquals("paid", o1.getOrderStatus(), "Order Status has not changed to Paid for!");

            assertTrue(DATA_BASE.getOrders().contains(o1), "Database does not have our new order!");

            assertEquals(0, c2.getOrders().size(), "Customer 2 must not have any orders!");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test whether manager can search for an order using order number
     */
    @Test
    public void findOrder() {
        try {
            Customer c1 = DATA_BASE.getCustomers().get(0);
            Item item1 = (Item) c1.searchItem("Cheese").clone();
            item1.setiSize("small");
            item1.setQuantity(3);
            c1.shop(item1);

            Item item2 = (Item) c1.searchItem("Burger").clone();
            item2.setiSize("large");
            item2.setQuantity(2);
            c1.shop(item2);

            Order o1 = c1.checkOut();

            c1.pay();

            Manager m1 = DATA_BASE.getManagers().get(0);

            // Check if the Manager can find the order we just placed!
            assertEquals(o1, m1.searchOrder("Olive-1-0"), "Manager must be able to find the new order!");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Test to cancel an order before it was delivered
     */
    @Test
    public void cancelOrder() {
        try {
            Customer c1 = DATA_BASE.getCustomers().get(0);
            Item item1 = (Item) c1.searchItem("Cheese").clone();
            item1.setiSize("small");
            item1.setQuantity(3);
            c1.shop(item1);

            Item item2 = (Item) c1.searchItem("Burger").clone();
            item2.setiSize("large");
            item2.setQuantity(2);
            c1.shop(item2);

            Order o1 = c1.checkOut();

            c1.pay();

            assertEquals("paid", c1.getOrders().get(0).getOrderStatus(), "Order must be paid for!");

            DATA_BASE.updateOrderStatus(o1, "signed for");

            assertFalse(c1.cancelOrder(o1.getOrderId(), c1.getcId()), "Customer should not be able to cancel order!");

            DATA_BASE.updateOrderStatus(o1, "delivering");
            assertTrue(c1.cancelOrder(o1.getOrderId(), c1.getcId()), "Customer must be able to cancel order!");

            assertFalse(c1.getOrders().contains(o1), "Customer order must be cancelled!");
            assertFalse(DATA_BASE.getOrders().contains(o1), "Order must be removed from the Data Base!");

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

}
