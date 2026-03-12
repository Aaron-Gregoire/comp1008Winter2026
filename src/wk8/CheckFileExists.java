package wk8;

import java.io.File;

public class CheckFileExists {
    public static void main(String[] args) {
        File file = new File("data.txt");
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found");
        }
    }
}