
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
public class PetDog implements IPet<PetDogData> {
    
    private List<PetDogData> _list;
    
    @Override
    public void listAll() {
        _list.forEach((_dog) -> {
            System.out.println(_dog.toString());
        });
    }

    @Override
    public void addPet(PetDogData petdog) {
        for (PetDogData d : _list) {
            if (d.getID() == petdog.getID()) {
                System.out.println("Dog already existed!");
                return;
            }
        }
        if (petdog == null || _list.contains(petdog)) {
            System.out.println("Dog already existed!");
            return;
        }
        _list.add(petdog);
    }

    @Override
    public void removePet(String id) {
        for (PetDogData d : _list) {
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

    public PetDog() {
        this._list = new ArrayList<>();
    }
    
}
