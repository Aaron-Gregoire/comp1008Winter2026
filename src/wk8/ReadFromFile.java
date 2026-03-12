package wk8;

import java.io.BufferedReader; // Import BufferedReader for fast, efficient reading
import java.io.FileReader;     // Import FileReader to open and read a text file
import java.io.IOException;    // Import IOException to handle file errors

public class ReadFromFile {
    public static void main(String[] args) {

        try {
            // Wrap FileReader in BufferedReader for faster block reading
            BufferedReader reader = new BufferedReader(new FileReader("input.txt"));

            String line; // Variable to hold each line read from the file

            // Read one line at a time until end of file (readLine returns null at EOF)
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Print each line to the console
            }

            // Close the reader to free system resources
            reader.close();

        } catch (IOException e) {
            // Catches errors like file not found or unreadable file
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}