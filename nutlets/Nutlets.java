package nutlets;

import java.io.*;
import java.util.*;

public class Nutlets {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            String[] str = n.nextLine().split(" ");
            int[] arr = new int[3];
            for (int i = 0; i < arr.length; i++){
                arr[i] = Integer.valueOf(str[i]);
            }
            n.close();
            if ((arr[0]*arr[1]) >= arr[2]) {
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
