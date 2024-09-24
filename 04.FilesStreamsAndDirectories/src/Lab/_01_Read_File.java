package Lab;

import java.io.FileInputStream;
import java.io.IOException;

public class _01_Read_File {
    public static void main(String[] args) throws IOException {
        String path = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\input.txt";
        FileInputStream fileStream = new FileInputStream(path);

        int oneByte = fileStream.read();
        while (oneByte >= 0) {
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fileStream.read();
        }
    }

}
