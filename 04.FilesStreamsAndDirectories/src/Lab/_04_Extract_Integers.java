package Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class _04_Extract_Integers {
    public static void main(String[] args) throws FileNotFoundException {

        String path = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(path);
        Scanner scanner = new Scanner(fileInputStream);

        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println(scanner.nextInt());
            }
            scanner.next();
        }
    }
}
