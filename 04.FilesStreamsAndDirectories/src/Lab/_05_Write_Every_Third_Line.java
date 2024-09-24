package Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.Scanner;

public class _05_Write_Every_Third_Line {
    public static void main(String[] args) throws FileNotFoundException {

        String pathRead = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\input.txt";
        String pathWrite = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\05.WriteEveryThirdLineOutput.txt";

        FileInputStream inputStream = new FileInputStream(pathRead);
        FileOutputStream outputStream = new FileOutputStream(pathWrite);

        Scanner reader = new Scanner(inputStream);
        PrintWriter writer = new PrintWriter(outputStream);

        int count = 1;
        String line = reader.nextLine();
        while (reader.hasNextLine()) {
            if (count % 3 == 0) {
                writer.println(line);
            }
            count++;
            line = reader.nextLine();
        }

        writer.close();
        reader.close();

    }
}
