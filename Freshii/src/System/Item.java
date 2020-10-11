package System;

public class Item {

    private int iId;
    private float iPrice;
    private String iSize, iName, category;
    private String[] iIngredients, iAllergens, iNutritions;
    private float[] iDimensions;

    public Item(int iId, float iPrice, String iSize, String iName, String category, String[] iIngredients, String[] iAllergens, String[] iNutritions, float[] iDimensions) {
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

    public String[] getiIngredients() {
        return iIngredients;
    }

    public void setiIngredients(String[] iIngredients) {
        this.iIngredients = iIngredients;
    }

    public String[] getiAllergens() {
        return iAllergens;
    }

    public void setiAllergens(String[] iAllergens) {
        this.iAllergens = iAllergens;
    }

    public String[] getiNutritions() {
        return iNutritions;
    }

    public void setiNutritions(String[] iNutritions) {
        this.iNutritions = iNutritions;
    }

    public float[] getiDimensions() {
        return iDimensions;
    }

    public void setiDimensions(float[] iDimensions) {
        this.iDimensions = iDimensions;
    }
}
