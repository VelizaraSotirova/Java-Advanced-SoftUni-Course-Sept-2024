package Exercise;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class _03_All_Capitals {
    public static void main(String[] args) {

        String inputPath = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\input.txt";
        String outputPath = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\output.txt";

        try (
                BufferedReader reader = Files.newBufferedReader(Path.of(inputPath));
                BufferedWriter writer = Files.newBufferedWriter(Path.of(outputPath))
        ) {
            String line = reader.readLine();
            while (line != null) {
                writer.write(line.toUpperCase());
                writer.newLine();
                line = reader.readLine();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
