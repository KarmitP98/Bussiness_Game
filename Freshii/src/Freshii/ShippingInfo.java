package Freshii;

public class ShippingInfo {

    private String sId;
    private String sLocation;

    public ShippingInfo(String sId, String sLocation) {
        this.sId = sId;
        this.sLocation = sLocation;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getsLocation() {
        return sLocation;
    }

    public void setsLocation(String sLocation) {
        this.sLocation = sLocation;
    }

    public void updateShippingInfo(ShippingInfo shippingInfo) {
        setsId(shippingInfo.sId);
        setsLocation(shippingInfo.sLocation);
    }
}
