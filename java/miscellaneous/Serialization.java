package miscellaneous;

//* Import the "java.io" package to perform I/O operations
import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        
        Product product = new Product("Laptop", 1000);

        //! I/O operations are prone to exceptions, so we need to handle them

        //* How to serialize objects
        try {
            //* To connect to a file, we need to create a "FileOutputStream" object, pass the filename as an argument
            //* It will create a file with the given name if it doesn't exist
            FileOutputStream fs = new FileOutputStream("Products.ser");

            //* To write objects to the file, create an "ObjectOutputStream" object, and pass the previous object
            ObjectOutputStream os = new ObjectOutputStream(fs);

            //* You can then write objects to the last stream with the "writeObject" method
            os.writeObject(product);

            //* At the end, close the stream with the "close" method
            os.close();
            
        } catch (Exception e) {
        }

        //* How to deserialize objects
        try {
            //* To connect to a file, create a "FileInputStream" object, and pass the filename as an argument
            FileInputStream fs = new FileInputStream("Products.ser");

            //* To read objects from the file, create an "ObjectInputStream" object, and pass the previous object
            ObjectInputStream os = new ObjectInputStream(fs);
            
            //* You can then read objects from the last stream with the "readObject" method
            //! The method always return an "Object", so you must cast it later if you want to use it
            // Object object = os.readObject();
            // Product item = (Product) object;
            // * Or you can just cast it directly when reading the object
            Product laptop = (Product) os.readObject();

            //* You can then use the object as you would normally
            System.out.println("Price: " + laptop.price);

            //! But if you try to read more objects than the file has, you'll get a runtime error
            // Product _laptop = (Product) os.readObject();
            
            //* You can use "close" again to close the stream
            os.close();

        } catch (Exception e) {
            System.out.println("No more objects to read");
        }
    }
}

//* Use the "Serializable" interface in order to be able to serialize objects
//! You don't need to implement any methods, it's just a marker interface
//* If a superclass of a class is serializable, the subclass is also serializable

//* The constructor of a serializable class is not called when deserialized
//! But if a superclass isn't serializable, its constructor will be called
//! And once that constructor is called, all the superclass constructors will be called
class Product implements Serializable {

    //* When serializing objects, the entire object is serialized, including its fields,
    //* and the fields of the fields (if they're serializable), and so on
    //! If a single field isn't serializable in the entire object, the serialization will fail
    String name;
    int price;

    //! Static fields aren't serialized, as they belong to the class, not the object
    static int count = 0;

    //* If some fields aren't or can't be serialized, use the "transient" keyword
    //! When deserialized, the fields will be initialized with their default values (null, 0, etc.)
    // transient Sample sample;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}