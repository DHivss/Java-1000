package bus_tour;

import java.io.*;
import java.util.*;

public class BusTour {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            String[] str = n.nextLine().split(" ");
            Integer[] arr = new Integer[str.length];
            int bus_height = 437, f = 1;
            for (int i = 0; i < str.length; i++) {
                arr[i] = Integer.valueOf(str[i]);
                if (bus_height >= arr[i]) {
                    fos.write(("Crash " + String.valueOf(i+1)).getBytes());
                    f++;
                }
            }
            n.close();
            if (f == 1) {
                fos.write("No crash".getBytes());
            }
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
