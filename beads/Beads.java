package beads;

import java.io.*;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\даша\\Documents\\src\\com.company\\oop\\src\\task\\task4\\output.txt");
            FileReader fr = new FileReader("C:\\Users\\даша\\Documents\\src\\com.company\\oop\\src\\task\\task4\\input.txt");
            Scanner n = new Scanner(fr);
            Integer a = n.nextInt();
            a += 1;
            n.close();
            fos.write(String.valueOf(a).getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
