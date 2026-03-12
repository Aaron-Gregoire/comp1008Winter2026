package wk8;

import java.io.FileWriter;   // Import FileWriter to write characters to a file
import java.io.IOException;  // Import IOException to handle file errors

public class WriteToFile {
    public static void main(String[] args) {

        try {
            // Create a FileWriter object that opens/creates "output.txt"
            FileWriter writer = new FileWriter("output.txt");

            // Write the string into the file
            writer.write("Hello, Java File Handling!");

            // Close the writer to free system resources and save the file
            writer.close();

            System.out.println("Successfully wrote to output.txt");

        } catch (IOException e) {
            // Catches any error that occurs during file writing (e.g. permission denied)
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}