package userinteraction;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        int wordCounter = 0;

        try {
            File f = new File("src/userinteraction/vancouver.txt");
            Scanner in = new Scanner(f);
            while (in.hasNextLine()) {
                String line = in.nextLine();
                String[] words = line.split(" ");
                wordCounter += words.length;
            }
            System.out.println("The file contains " + wordCounter + " words.");
        } catch (FileNotFoundException e) {
            System.out.println("File not found! Check the file path.");
        }
    }
}
