package wk8;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyFile {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader("source.txt"));
            FileWriter writer = new FileWriter("destination.txt");
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line + "\n");
            }
            reader.close();
            writer.close();
            System.out.println("File copied successfully to destination.txt");
        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}