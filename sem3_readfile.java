import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class sem3_readfile {
    public static void main(String[] args) {
        readFile();
    }

    static void readFile(){
        File file = new File("test_s3_readfile.txt");
        Scanner scanner = null;
        try {
        scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
        e.printStackTrace();
        }
        String res = "";
        while (scanner.hasNext()){
        res += scanner.nextLine() + "\n";
        }
        System.out.println(res);
        }
}
