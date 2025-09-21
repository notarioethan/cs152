import java.io.File;                  // Import the File class
import java.io.FileNotFoundException; // Import this class to handle errors
import java.util.ArrayList;
import java.util.Scanner;             // Import the Scanner class to read text files
import java.util.*;

public class LinesOfFile {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        if (args.length != 3){
            if (args.length < 3) System.err.println("Error: Arguments missing");
            if (args.length > 3) System.err.println("Error: Too many arguments");
            System.exit(1);
        }
        File myFile = new File(args[0]); //first arg for file name
        int n = Integer.parseInt(args[2]); //third arg for number of lines n
        String whichLines = args[1]; // second arg for first, middle, or last
        if (n < 1){
            System.out.println("No lines to output");
            return;
        }
        if (!(whichLines.equals("first") || whichLines.equals("middle") | whichLines.equals("last"))){
            System.err.println("Error: Invalid argument for first, middle, or last n lines");
            System.exit(1);
        }

        ArrayList<String> allLines = new ArrayList<String>();

        try (Scanner in = new Scanner(myFile)){
            while (in.hasNextLine()){
                String line = in.nextLine();
                //to stack/queue/whatever
                allLines.add(line);
            }
        } catch (FileNotFoundException e){
            System.err.println("Error: File not found");
            e.printStackTrace();
        }

        if (whichLines.equals("last")) lastNLines(n, allLines);
        if (whichLines.equals("first")) firstNLines(n, allLines);
        if (whichLines.equals("middle")) middleNLines(n, allLines);
    }

    public static void lastNLines(int n, ArrayList<String> allLines){
        
        //n = Math.min(n, allLines.size());
        int i = Math.max(0, allLines.size() - n);
        n = Math.min(n, allLines.size());
        System.out.println("LAST " + n + " LINES:");
        while (i < allLines.size()){
            System.out.println(allLines.get(i));
            i++;
        }
    }
    
    public static void firstNLines(int n, ArrayList<String> allLines){
        
        //n = Math.min(n, allLines.size());
        int i = 0;
        n = Math.min(n, allLines.size());
        System.out.println("FIRST " + n + " LINES:");
        while (i < n){
            System.out.println(allLines.get(i));
            i++;
        }
    }

    public static void middleNLines(int n, ArrayList<String> allLines){
        int diff = Math.max(0, allLines.size() - n);
        //n = Math.min(n, allLines.size());
        int i = 0;
        int j = diff/2;
        n = Math.min(n, allLines.size());
        System.out.println("MIDDLE " + n + " LINES:");
        while (i < n){
            System.out.println(allLines.get(i + j));
            i++;
        }
    }
}
