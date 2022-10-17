package beads;

import java.io.*;
import java.util.Scanner;

public class Beads {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
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
