package more_less;

import java.io.*;
import java.util.*;

public class MoreLess {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\даша\\Documents\\src\\com.company\\oop\\src\\task\\task4\\output.txt");
            FileReader fr = new FileReader("C:\\Users\\даша\\Documents\\src\\com.company\\oop\\src\\task\\task4\\input.txt");
            Scanner n = new Scanner(fr);
            Integer a = n.nextInt();
            n.nextLine();
            Integer b = n.nextInt();
            n.close();
            if (a > b)
                fos.write(">".getBytes());
            if (a < b)
                fos.write("<".getBytes());
            if (a == b)
                fos.write("=".getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
