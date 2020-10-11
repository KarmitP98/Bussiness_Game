package Freshii;

import java.util.ArrayList;
import java.util.Arrays;

public class Item implements Cloneable {

    private int iId;
    private float iPrice;
    private String iSize, iName, category;
    private ArrayList<String> iIngredients = new ArrayList<>(), iAllergens = new ArrayList<>(), iNutritions = new ArrayList<>();
    private float[] iDimensions;

    public Item(int iId, float iPrice, String iSize, String iName, String category, ArrayList<String> iIngredients, ArrayList<String> iAllergens, ArrayList<String> iNutritions, float[] iDimensions) {
        this.iId = iId;
        this.iPrice = iPrice;
        this.iSize = iSize;
        this.iName = iName;
        this.category = category;
        this.iIngredients = iIngredients;
        this.iAllergens = iAllergens;
        this.iNutritions = iNutritions;
        this.iDimensions = iDimensions;
    }

    public Item() {
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
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

    public float[] getiDimensions() {
        return iDimensions;
    }

    public void setiDimensions(float[] iDimensions) {
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
                ", iDimensions=" + Arrays.toString(iDimensions) +
                '}';
    }
}
