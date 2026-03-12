package wk8;

import java.io.File; // Import File class to work with file/directory info

public class CheckFileExists {
    public static void main(String[] args) {

        // Create a File object representing "data.txt" in the current directory
        // Note: this does NOT create the actual file, just a reference to its path
        File file = new File("data.txt");

        // Use exists() method to check if the file is present on disk
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found");
        }
    }
}