package wk8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountLines {
    public static void main(String[] args) {
        int lineCount = 0;
        try {
            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));
            while (reader.readLine() != null) {
                lineCount++;
            }
            reader.close();
            System.out.println("Number of lines: " + lineCount);
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
