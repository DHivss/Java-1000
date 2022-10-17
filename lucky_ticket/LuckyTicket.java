package lucky_ticket;

import java.io.*;
import java.util.*;

public class LuckyTicket {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            String str = n.nextLine();
            int[] arr = new int[6];
            n.close();
            for (int i = 0; i < 6; i++){
                arr[i] = Integer.valueOf(str.charAt(i));
            }
            fos.write((arr[0]+arr[1]+arr[2] == arr[3]+arr[4]+arr[5]) ?
                    "YES".getBytes(): "NO".getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
    }
}
