
public class PetDog {
    private String ID;
    private String petName;

    public PetDog() {
    }

    public PetDog(String ID, String petName) {
        this.ID = ID;
        this.petName = petName;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    @Override
    public String toString() {
            return ID + ", " + petName;
    }
    
    
}
