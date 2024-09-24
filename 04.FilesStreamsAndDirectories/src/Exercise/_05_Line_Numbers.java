package Exercise;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class _05_Line_Numbers {
    public static void main(String[] args) throws IOException {
        Path inputFile = Paths.get("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\inputLineNumbers.txt");
        List<String> lines = Files.readAllLines(inputFile);
        BufferedWriter br = new BufferedWriter(new FileWriter("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\output.txt"));
        AtomicInteger lineNumber = new AtomicInteger();
        lines.forEach(line -> {
            lineNumber.addAndGet(1);
            try {
                br.write(lineNumber +". " + line);
                br.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        br.close();
    }
}
