package miscellaneous;

//* Import the "java.io" package to perform I/O operations
import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        
        Product product = new Product(20);

        //! I/O operations are prone to exceptions, so we need to handle them
        try {
            //* To connect to a file, we need to create a "FileOutputStream" object, pass the filename as an argument
            FileOutputStream fs = new FileOutputStream("Products.ser");

            //* To write objects to the file, create an "ObjectOutputStream" object, and pass the previous object
            ObjectOutputStream os = new ObjectOutputStream(fs);

            //* You can then write objects to the last stream with the "writeObject" method
            os.writeObject(product);

            //* At the end, close the stream with the "close" method
            os.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            FileInputStream fs = new FileInputStream("Products.ser");
            ObjectInputStream os = new ObjectInputStream(fs);
            Product item = (Product) os.readObject();
            os.close();

            System.out.println("Price: " + item.price);
        } catch (Exception e) {
        }
    }
}

class Product implements Serializable {
    int price;

    public Product(int price) {
        this.price = price;
    }
}