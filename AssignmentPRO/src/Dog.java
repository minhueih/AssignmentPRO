
public class Dog {
    private String ID;
    private String petID;
    private String dogName;
    private String dogColor;
    private boolean dogGender;
    private double price;
    private String describe;

    public Dog() {
    }

    public Dog(String ID, String petID, String dogName, String dogColor, boolean dogGender, double price, String describe) {
        this.ID = ID;
        this.petID = petID;
        this.dogName = dogName;
        this.dogColor = dogColor;
        this.dogGender = dogGender;
        this.price = price;
        this.describe = describe;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPetID() {
        return petID;
    }

    public void setPetID(String petID) {
        this.petID = petID;
    }

    public String getDogName() {
        return dogName;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public String getDogColor() {
        return dogColor;
    }

    public void setDogColor(String dogColor) {
        this.dogColor = dogColor;
    }

    public boolean isDogGender() {
        return dogGender;
    }

    public void setDogGender(boolean dogGender) {
        this.dogGender = dogGender;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    @Override
    public String toString() {
        return ID + "\t" + petID + "\t" + dogName + "\t" + dogColor + "\t" + 
                (dogGender?"male":"female") + "\t" + price + "\t" + describe;
    }
    
}
