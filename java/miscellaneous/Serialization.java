package miscellaneous;

import java.io.*;

public class Serialization {
    public static void main(String[] args) {
        Product product = new Product();
        product.price = 20;

        try {
            FileOutputStream fOutputStream = new FileOutputStream("MyProduct.ser");
            ObjectOutputStream oOutputStream = new ObjectOutputStream(fOutputStream);
            oOutputStream.writeObject(product);
            oOutputStream.close();

            FileInputStream fInputStream = new FileInputStream("MyProduct.ser");
            ObjectInputStream oInputStream = new ObjectInputStream(fInputStream);
            Product item = (Product) oInputStream.readObject();
            oInputStream.close();

            System.out.println("Price: " + item.price);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Product implements Serializable {
    int price;
}