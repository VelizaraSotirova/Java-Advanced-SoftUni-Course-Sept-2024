package Lab;

import java.io.File;

public class _07_List_Files {
    public static void main(String[] args) {
        File folder = new File("D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Lab\\Files-and-Streams");

        File[] files = folder.listFiles();
        for (File file : files) {
            if (!file.isDirectory()) {
                System.out.printf("%s: [%d]\n", file.getName(), file.length());
            }
        }
    }
}
