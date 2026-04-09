package wk12;
import java.io.*;
import java.util.Scanner;

public class assignment3 {
    //Write a Java program that splits one text file into two separate files: the first half of the lines and the second half.
    public String fileName;
    public String firstOutput;
    public String secondOutput;

    public static void main(String[] args){

 }
    static void askFileName(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a file name");
        String fileName = sc.next();
        File file = new File(fileName);
        if (file.exists()) {
            System.out.println("File exists");
        } else {
            System.out.println("File not found");
        }
        return fileName
    }

    static void nameOutputFirst(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name for first output");
        String firstOutput = sc.next();
    }

    static void nameOutputSecond(){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter name for second output");
        String secondOutput = sc.next();
    }

    static void fileReader(){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));

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




/*Your program must:

Ask the user to enter the name of the file to split.
Ask the user for:
The name of the output file for the first half.
The name of the output file for the second half.
Read all lines from the input file and store them in a list.
Calculate the halfway point:


If the input file has an odd number of lines, the first half should receive the extra line.



Write:

Lines 1 to middle-point into the first output file.
Lines middle-point to the end of the list into the second file.


At the end, display:

The total number of lines in the original file.
How many lines went into the first half.
How many lines went into the second half.
The names of the two output files created.


Requirements:

Handle the case where the input file is empty.
If the file does not exist, show a clear error message.
Preserve the exact text of each line.
Do not modify the original file. */

