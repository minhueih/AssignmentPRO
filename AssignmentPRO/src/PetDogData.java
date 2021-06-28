/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author MinnminX
 */
public class PetDogData {
    public int ID;
    public String PetName;

    @Override
    public String toString() {
        return ID + "; " + PetName;
    }

    public PetDogData(int ID, String PetName) {
        this.ID = ID;
        this.PetName = PetName;
    }
    public PetDogData() {}

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getPetName() {
        return PetName;
    }

    public void setPetName(String PetName) {
        this.PetName = PetName;
    }
}
