/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MinnminX
 */
public class DogData {
    private int ID;
    private int PetID;
    private String DogName;
    private String DogColor;
    private boolean DogGender; //true-cai false-duc
    private int Price;
    private String Desc;

    @Override
    public String toString() {
        return ID + "; " + PetID + "; " + DogName + "; " + DogColor + "; " + DogGender + "; " + Price + "; " + Desc;
    }
    public DogData() {}
    
    public DogData(int ID, int PetID, String DogName, String DogColor, boolean DogGender, int Price, String Desc) {
        this.ID = ID;
        this.PetID = PetID;
        this.DogName = DogName;
        this.DogColor = DogColor;
        this.DogGender = DogGender;
        this.Price = Price;
        this.Desc = Desc;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPetID() {
        return PetID;
    }

    public void setPetID(int PetID) {
        this.PetID = PetID;
    }

    public String getDogName() {
        return DogName;
    }

    public void setDogName(String DogName) {
        this.DogName = DogName;
    }

    public String getDogColor() {
        return DogColor;
    }

    public void setDogColor(String DogColor) {
        this.DogColor = DogColor;
    }

    public String getDogGender() {
        return DogGender ? "cái" : "đực";
    }

    public void setDogGender(boolean isFemale) {
        this.DogGender = isFemale;
    }

    public int getPrice() {
        return Price;
    }

    public void setPrice(int Price) {
        this.Price = Price;
    }

    public String getDesc() {
        return Desc;
    }

    public void setDesc(String Desc) {
        this.Desc = Desc;
    }
    
    
}
