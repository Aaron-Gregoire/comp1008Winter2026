package wk8;

import java.io.BufferedReader; // Import BufferedReader for efficient line-by-line reading
import java.io.FileReader;     // Import FileReader to open the text file
import java.io.IOException;    // Import IOException to handle file errors

public class CountLines {
    public static void main(String[] args) {

        int lineCount = 0; // Counter to track the number of lines in the file

        try {
            // Wrap FileReader in BufferedReader for faster block reading
            BufferedReader reader = new BufferedReader(new FileReader("notes.txt"));

            // Read through each line — each successful read means one line exists
            while (reader.readLine() != null) {
                lineCount++; // Increment counter for every line found
            }

            // Close the reader to free system resources
            reader.close();

            // Print the total number of lines counted
            System.out.println("Number of lines: " + lineCount);

        } catch (IOException e) {
            // Catches errors like file not found or unreadable file
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}