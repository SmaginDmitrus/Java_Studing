import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Objects;

public class DeserializeAnimals{
 class Animal implements Serializable {
    private final String name;

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Animal) {
            return Objects.equals(name, ((Animal) obj).name);
        }
        return false;
    }
        public static Animal[] deserializeAnimalArray(byte[] data) throws IllegalArgumentException, IOException {
        try (ByteArrayInputStream bis = new ByteArrayInputStream(data)) {
            ObjectInputStream ois = new ObjectInputStream(bis);
            int size = ois.readInt();
            Animal[] animals = new Animal[size];
            for(int i =0;i<size;i++){
                animals[i]=(Animal)ois.readObject();

            }
            return animals;
        } catch (IOException e) {
            throw new IllegalArgumentException("Problems with reading of data");
        }catch(ClassNotFoundException ex){
            throw new IllegalArgumentException("Can't find the class of Object");
        }
    }
}
public static void main(String[] args) {
    
}   
}