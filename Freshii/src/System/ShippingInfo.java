package System;

public class ShippingInfo {

    private int sId;
    private String sLocation;

    public ShippingInfo(int sId, String sLocation) {
        this.sId = sId;
        this.sLocation = sLocation;
    }

    public int getsId() {
        return sId;
    }

    public void setsId(int sId) {
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
