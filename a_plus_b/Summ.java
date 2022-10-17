package a_plus_b;

import java.io.*;
import java.util.*;
public class Summ {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            String[] str = n.nextLine().split(" ");
            Integer[] arr = new Integer[str.length];
            Integer s = 0;
            for(int i = 0; i < str.length; i++){
                arr[i] = Integer.valueOf(str[i]);
                s += arr[i];
            }
            n.close();
            fos.write(String.valueOf(s).getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
