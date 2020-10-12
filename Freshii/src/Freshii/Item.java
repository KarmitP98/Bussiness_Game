package Freshii;

import java.util.ArrayList;

public class Item implements Cloneable {

    private int iId, quantity = 1;
    private float iPrice;
    private String iSize, iName, category;
    private ArrayList<String> iIngredients = new ArrayList<>(), iAllergens = new ArrayList<>(), iNutritions = new ArrayList<>();
    private ArrayList<Float> iDimensions;

    public Item(int iId, float iPrice, String iSize, String iName, String category, ArrayList<String> iIngredients, ArrayList<String> iAllergens, ArrayList<String> iNutritions, ArrayList<Float> iDimensions, int quantity) {
        this.iId = iId;
        this.iPrice = iPrice;
        this.iSize = iSize;
        this.iName = iName;
        this.category = category;
        this.iIngredients = iIngredients;
        this.iAllergens = iAllergens;
        this.iNutritions = iNutritions;
        this.iDimensions = iDimensions;
        this.quantity = quantity;
    }

    public Item() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getiId() {
        return iId;
    }

    public void setiId(int iId) {
        this.iId = iId;
    }

    public float getiPrice() {
        return iPrice;
    }

    public void setiPrice(float iPrice) {
        this.iPrice = iPrice;
    }

    public String getiSize() {
        return iSize;
    }

    public void setiSize(String iSize) {
        this.iSize = iSize;
    }

    public String getiName() {
        return iName;
    }

    public void setiName(String iName) {
        this.iName = iName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public ArrayList<String> getiIngredients() {
        return iIngredients;
    }

    public void setiIngredients(ArrayList<String> iIngredients) {
        this.iIngredients = iIngredients;
    }

    public ArrayList<String> getiAllergens() {
        return iAllergens;
    }

    public void setiAllergens(ArrayList<String> iAllergens) {
        this.iAllergens = iAllergens;
    }

    public ArrayList<String> getiNutritions() {
        return iNutritions;
    }

    public void setiNutritions(ArrayList<String> iNutritions) {
        this.iNutritions = iNutritions;
    }

    public ArrayList<Float> getiDimensions() {
        return iDimensions;
    }

    public void setiDimensions(ArrayList<Float> iDimensions) {
        this.iDimensions = iDimensions;
    }

    @Override
    public String toString() {
        return "Item{" +
                "iId=" + iId +
                ", iPrice=" + iPrice +
                ", iSize='" + iSize + '\'' +
                ", iName='" + iName + '\'' +
                ", category='" + category + '\'' +
                ", iIngredients=" + iIngredients +
                ", iAllergens=" + iAllergens +
                ", iNutritions=" + iNutritions +
                ", iDimensions=" + iDimensions +
                '}';
    }
}
