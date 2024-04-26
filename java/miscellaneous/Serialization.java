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

//* Use the "Serializable" interface in order to serialize objects
//! You don't need to implement any methods, it's just a marker interface
class Product implements Serializable {

    // * When serializing objects, the fields are serialized, but the methods are not
    String name;
    int price;

    //* If some fields aren't or can't be serialized, use the "transient" keyword
    // transient Sample sample;

    public Product(String name, int price) {
        this.name = name;
        this.price = price;
    }
}