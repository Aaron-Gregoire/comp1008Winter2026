package wk8;

import java.io.BufferedReader; // Import BufferedReader to read source file efficiently
import java.io.FileReader;     // Import FileReader to open the source text file
import java.io.FileWriter;     // Import FileWriter to write to the destination file
import java.io.IOException;    // Import IOException to handle file errors

public class CopyFile {
    public static void main(String[] args) {

        try {
            // Open source.txt for reading using BufferedReader for efficiency
            BufferedReader reader = new BufferedReader(new FileReader("source.txt"));

            // Open destination.txt for writing (creates the file if it doesn't exist)
            FileWriter writer = new FileWriter("destination.txt");

            String line; // Variable to hold each line read from source file

            // Read each line from source and immediately write it to destination
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n"); // Write line + newline to preserve formatting
            }

            // Close both reader and writer to free system resources
            reader.close();
            writer.close();

            System.out.println("File copied successfully to destination.txt");

        } catch (IOException e) {
            // Catches errors like source file not found or write permission denied
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}