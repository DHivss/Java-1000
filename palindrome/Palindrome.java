package palindrome;

import java.io.*;
import java.util.*;

public class Palindrome {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            String str = n.nextLine();
            String revstr = new StringBuilder(str).reverse().toString();
            n.close();
            if (str.equals(revstr)) {
                fos.write("YES".getBytes());
            } else {
                fos.write("NO".getBytes());
            }
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
