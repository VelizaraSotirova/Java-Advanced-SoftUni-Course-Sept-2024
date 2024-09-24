package Exercise;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Set;

public class _04_Count_Characters {
    public static void main(String[] args) {

        String inputPath = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\input.txt";
        String outputPath = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\output.txt";

        // vowels, other symbols, and punctuation marks
        int vowels = 0;
        int punctuations = 0;
        int others = 0;

        Set<Character> vowelsSet = Set.of('a', 'e', 'i', 'o', 'u');
        Set<Character> punctuationsSet = Set.of('!', ',', '.', '?');

        try (BufferedReader br = Files.newBufferedReader(Path.of(inputPath));
             PrintStream printStream = new PrintStream(Files.newOutputStream(Path.of(outputPath)))
        ) {

            String line = br.readLine();

            while (line != null) {
                line = line.replaceAll(" ", "");
                for (char symbol : line.toCharArray()) {
                    if (vowelsSet.contains(symbol)) {
                        vowels++;
                    } else if (punctuationsSet.contains(symbol)) {
                        punctuations++;
                    } else {
                        others++;
                    }
                }

                line = br.readLine();
            }

            printStream.printf("Vowels: %d\n", vowels);
            printStream.printf("Other symbols: %d\n", others);
            printStream.printf("Punctuation: %d", punctuations);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
