package Exercise;

import java.io.File;

public class _08_Get_Folder_Size {
    public static void main(String[] args) {

        String path = "D:\\SoftUni\\Java\\04.FilesStreamsAndDirectories\\src\\Exercise\\Exercises Resources";

        File directory = new File(path);

        int totalSize = 0;
        if (directory.isDirectory()) {
            File[] files = directory.listFiles();

            for (File file : files) {
                if (!file.isDirectory()) {
                    totalSize += file.length();
                }
            }
        }

        System.out.println("Folder size: " + totalSize);
    }
}
