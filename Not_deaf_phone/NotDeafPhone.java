package Not_deaf_phone;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.*;
public class NotDeafPhone {
    public static void main(String[] args) throws IOException {
        try {
            FileOutputStream fos = new FileOutputStream("output.txt");
            FileReader fr = new FileReader("input.txt");
            Scanner n = new Scanner(fr);
            String str = "";
            str = n.nextLine();
            n.close();
            fos.write(str.getBytes());
            fos.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
