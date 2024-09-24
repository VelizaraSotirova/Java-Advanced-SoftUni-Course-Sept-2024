package Lab;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class _02_Write_To_File {
    public static void main(String[] args) throws IOException {
        //Reading from file
        String pathToRead = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\input.txt";
        FileInputStream fileInput = new FileInputStream(pathToRead);

        //Writing to a file
        String pathToWrite = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\02.WriteToFileOutput.txt";
        FileOutputStream fileOutput = new FileOutputStream(pathToWrite);

        //Skip the following symbols: ",", ".", "!", "?"
        int oneByte = fileInput.read();
        while (oneByte >= 0) {
            char currentChar = (char) oneByte;
            if (currentChar != ',' && currentChar != '.' && currentChar != '!' && currentChar != '?') {
                fileOutput.write(oneByte);
            }
            oneByte = fileInput.read();
        }
    }
}
