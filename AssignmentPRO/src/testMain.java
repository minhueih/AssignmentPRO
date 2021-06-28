/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Phong Linh
 */
public class testMain {
    
    //lam menu xong xoa 
    
    public static void main(String[] args) {
        Dog myDog = new Dog();
        PetDog myPet = new PetDog();
        
        myDog.addPet();//them
        
        myDog.saveFile();//save
        
        DogListUtility.ListByName(myDog.getList()); //10
        DogListUtility.ListByPrice(myDog.getList()); //11
        DogListUtility.FingByColor(myDog.getList(), "xam");//12
        DogListUtility.FingByPrice(myDog.getList(), 300); //13
        DogListUtility.FingByPrice(myDog.getList(), 100, 900);//13
    }
}
