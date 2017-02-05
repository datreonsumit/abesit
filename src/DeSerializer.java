import java.io.FileInputStream;
import java.io.ObjectInputStream;
//import java.io.ObjectOutputStream;

/**
 * Created by ultron on 1/26/17.
 */
public class DeSerializer {
    private String filePath = "/home/ultron/file.ser";
    private User userObject = null;

    public void deSerialize(){
        try{
            FileInputStream file=new FileInputStream(filePath);
            ObjectInputStream in = new ObjectInputStream(file);

            userObject = (User)in.readObject();

            in.close();
            file.close();

            System.out.println("Object has been deserialized ");
            System.out.println("Name = " + userObject.getName());
            System.out.println("Age = " +userObject.getAge());
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
