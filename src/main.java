/**
 * Created by ultron on 2/4/17.
 */
public class main {
    public static void main(String[] args) {

        Serializer serializerObject = new Serializer();
        serializerObject.serialize();

        DeSerializer deSerializerObject = new DeSerializer();
        deSerializerObject.deSerialize();
    }
}
