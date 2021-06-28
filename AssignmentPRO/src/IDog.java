
import java.util.List;


public interface IDog {
    public void listPetDogs();
    public void addPetDog(List<PetDog> list);
    public void removePetDog(String id);
    public void savePetDogs();
    public void listDogs();
    public void addDog(List<Dog> list);
    public void removeDog(String id);
    public void updateDog(String id);
    public void saveDogs();
    public void listAscending(String name);
    public void listAscending(double price);
    public void search(String color);
    public void search(double price);
}
