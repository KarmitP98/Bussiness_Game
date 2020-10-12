/**
 *
 */
package Freshii;

/**
 * @author Karmit
 */
public class Manager {

    private String mName;
    private String mEmail;
    private String mId;
    private String mPassword;

    public Manager(String mName, String mEmail, String mId, String mPassword) {
        this.mName = mName;
        this.mEmail = mEmail;
        this.mId = mId;
        this.mPassword = mPassword;
    }

    /**
     *
     */
    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    public String getPassword() {
        return mPassword;
    }

    public void setPassword(String password) {
        this.mPassword = password;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmEmail() {
        return mEmail;
    }

    public void setmEmail(String mEmail) {
        this.mEmail = mEmail;
    }

    public Order searchOrder(String search) {
        return DATA_BASE.searchOrder(search);
    }

    public void updateItem(Item newItem, int iId) {
        DATA_BASE.updateItem(newItem, iId);
    }

    public Item searchItem(String iName) {
        Item temp = DATA_BASE.searchItem(iName);
        return temp;
    }

    public boolean changeOrderStatus(Order order, String status) {
        if (DATA_BASE.getOrders().contains(order)) {
            for (Order order1 : DATA_BASE.getOrders()) {
                if (order1.equals(order)) {
                    order1.setOrderStatus(status);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean removeItem(String name) {
        return DATA_BASE.removeItem(name);
    }

    @Override
    public String toString() {
        return "Manager{" +
                "mName='" + mName + '\'' +
                ", mEmail='" + mEmail + '\'' +
                ", mId=" + mId +
                ", password='" + mPassword + '\'' +
                '}';
    }
}
