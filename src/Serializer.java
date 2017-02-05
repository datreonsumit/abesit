import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Created by ultron on 1/26/17.
 */
public class Serializer {
    private String filePath = "/home/ultron/file.ser";
    private User sampleUser = new User("My Hello",3);

    public void serialize(){
        try{
            FileOutputStream file = new FileOutputStream(filePath);
            ObjectOutputStream out = new ObjectOutputStream(file);

            out.writeObject(sampleUser);

            out.close();
            file.close();

            System.out.println("Object has been serialized");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}
