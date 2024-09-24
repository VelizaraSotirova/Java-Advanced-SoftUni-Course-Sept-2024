package Exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class _06_Count_Word {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner inputFile = new Scanner(new FileInputStream("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\words.txt"));
        Map<String, Integer> words = new HashMap<>();
        while (inputFile.hasNext()){
            words.put(inputFile.next(), 0);
        }
        Scanner reader = new Scanner(new FileInputStream("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\text.txt"));
        while (reader.hasNext()){
            String currentWord = reader.next();
            if (words.containsKey(currentWord)){
                words.put(currentWord, words.get(currentWord) + 1);
            }
        }
        PrintWriter writer = new PrintWriter("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\output.txt");
        words.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(element -> {
            //of - 6
            //which - 2
            //The - 1
            System.out.printf("%s - %d%n", element.getKey(), element.getValue());
        });
        writer.println(5);
        writer.close();
    }
}
