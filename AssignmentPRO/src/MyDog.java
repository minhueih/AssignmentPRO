
import java.util.List;
import java.util.Scanner;


public class MyDog implements IDog{

    @Override
    public void listPetDogs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addPetDog(List<PetDog> list) {
        Scanner sc = new Scanner(System.in);
        String id, petName;
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter petname: ");
        petName = sc.nextLine();
        
        list.add(new PetDog(id, petName));
    }

    @Override
    public void removePetDog(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void savePetDogs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listDogs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void addDog(List<Dog> list) {
        Scanner sc = new Scanner(System.in);
        String id, petID, dogName, dogColor, describe;
        boolean dogGender;
        double price;
        
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter pet ID: ");
        petID = sc.nextLine();
        System.out.print("Enter dog name: ");
        dogName = sc.nextLine();
        System.out.print("Enter dog color: ");
        dogColor = sc.nextLine();
        System.out.print("Enter dog gender (true/false): ");
        dogGender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter price: ");
        price = Double.parseDouble(sc.nextLine());
        System.out.print("Enter describe: ");
        describe = sc.nextLine();
        
        list.add(new Dog(id, petID, dogName, dogColor, 
                dogGender, price, describe));
    }

    @Override
    public void removeDog(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateDog(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void saveDogs() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listAscending(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listAscending(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(String color) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void search(double price) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
