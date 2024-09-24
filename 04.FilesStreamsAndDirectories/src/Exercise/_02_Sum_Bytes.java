package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _02_Sum_Bytes {
    public static void main(String[] args) {
        String path = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\input.txt";

        long sum = 0;

        try (BufferedReader bufferedReader = Files.newBufferedReader(Path.of(path))) {
//            int read = bufferedReader.read();
//            while (read != -1) {
//
//                System.out.print((char)read);
//                read = bufferedReader.read();
//            }

            String line = bufferedReader.readLine();
            while (line != null) {

                for (char c : line.toCharArray()) {
                    System.out.print(c);
                    sum += c;
                }
                line = bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // System.out.println(sum);
    }
}
