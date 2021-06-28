
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class Dog implements IPet<DogData> {

    private List<DogData> _list;

    @Override
    public void listAll() {
        _list.forEach((_dog) -> {
            System.out.println(_dog.toString());
        });
    }

    @Override
    public void addPet() {
        Scanner sc = new Scanner(System.in);
        String id, petID, dogName, dogColor, describe;
        boolean dogGender;
        int price;
        
        System.out.print("Enter ID: ");
        id = sc.nextLine();
        System.out.print("Enter pet ID: ");
        petID = sc.nextLine();
        System.out.print("Enter dog name: ");
        dogName = sc.nextLine();
        System.out.print("Enter dog color: ");
        dogColor = sc.nextLine();
        System.out.print("Enter dog gender (true/false) (true = female) : ");
        dogGender = Boolean.parseBoolean(sc.nextLine());
        System.out.print("Enter price: ");
        price = Integer.parseInt(sc.nextLine());
        System.out.print("Enter describe: ");
        describe = sc.nextLine();
        
        DogData dog = new DogData(Integer.parseInt(id), Integer.parseInt(petID), dogName, dogColor, dogGender, price, describe);
        
        for (DogData d : _list) {
            if (d.getID() == dog.getID()) {
                System.out.println("Dog already existed!");
                return;
            }
        }
        if (_list.contains(dog)) {
            System.out.println("Dog already existed!");
            return;
        }
        _list.add(dog);
    }

    @Override
    public void removePet(String id) {
        for (DogData d : _list) {
            if (d.getID() == Integer.parseInt(id)) {
                _list.remove(d);
                break;
            }
        }
    }

    @Override
    public void saveFile() {
        String out_ = "";
        for (DogData d : _list) {
            out_ += d.toString() + "\n\n";
        }
        IOFile.writeString("../dog.txt", out_);
        System.out.println("Write completed!");
    }

    public Dog() {
        this._list = new ArrayList<>();
    }
}
