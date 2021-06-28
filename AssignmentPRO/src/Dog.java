
import java.util.ArrayList;
import java.util.List;

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
    public void addPet(DogData dog) {
        for (DogData d : _list) {
            if (d.getID() == dog.getID()) {
                System.out.println("Dog already existed!");
                return;
            }
        }
        if (dog == null || _list.contains(dog)) {
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Dog() {
        this._list = new ArrayList<>();
    }
}
