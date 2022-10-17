package divider;

import java.util.*;
import java.io.*;

public class Divider{
    public static void main(String[] argv) throws IOException{
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            Integer a = n.nextInt();
            Integer b = n.nextInt();
            Integer nod = 0;
            while(a != b){
                if(a > b) a = a - b;
                else b = b - a;

            }
            n.close();
            fos.write(String.valueOf(a).getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
}}
