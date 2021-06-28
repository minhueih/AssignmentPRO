
import java.util.ArrayList;
import java.util.List;


public class IODog {
    public static void main(String[] args) {
        List<Dog> dog=new ArrayList<>();
        List<PetDog> petdog=new ArrayList<>();
        MyDog d = new MyDog();
        
        String fileD ="src/dog.txt";
        d.addDog(dog);
        //ghi vao file
        IOFile.write(fileD, dog);
        
        String filePD ="src/petdog.txt";
        d.addPetDog(petdog);
        //ghi vao file
        IOFile.write(filePD, petdog);
        
    }
}
