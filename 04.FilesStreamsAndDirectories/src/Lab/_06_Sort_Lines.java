package Lab;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Collections;
import java.util.List;

public class _06_Sort_Lines {
    public static void main(String[] args) throws IOException {

        Path path = Path.of("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\input.txt");
        List<String> lines = Files.readAllLines(path);

        Collections.sort(lines);

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
