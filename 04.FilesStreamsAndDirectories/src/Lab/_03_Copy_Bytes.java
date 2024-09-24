package Lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class _03_Copy_Bytes {
    public static void main(String[] args) throws IOException {
        //Reading from file
        String pathToRead = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\input.txt";
        FileInputStream in = new FileInputStream(pathToRead);

        //Writing to a file
        String pathToWrite = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\03.CopyBytesOutput.txt";
        FileOutputStream out = new FileOutputStream(pathToWrite);

        int oneByte = in.read();
        while (oneByte >= 0) {
            if (oneByte == 32 || oneByte == 10) {
                out.write(oneByte);
            } else {
                String digits = String.valueOf(oneByte);
                for (int i = 0; i < digits.length(); i++) {
                    out.write(digits.charAt(i));
                }
            }
            oneByte = in.read();
        }
    }
}
