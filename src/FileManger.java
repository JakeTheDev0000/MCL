import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import  java.io.IOException;

public class FileManger {
    static Scanner scanner = new Scanner(System.in);

    FileManger() {

    }
    // File Version
    public void clearFile(File myFile) {
        try {
            FileWriter writer = new FileWriter(myFile);
            writer.flush();
        }
        catch (IOException e) {
            System.out.println("Error on readFile\nfile: "+myFile.getName());
            System.out.println("\n\n");
            e.printStackTrace();
        }
    }

    // String Version
    public void clearFile(String myFile) {
        try {
            FileWriter writer = new FileWriter(myFile);
            writer.flush();
        }
        catch (IOException e) {
            System.out.println("Error on readFile\nfile: "+myFile);
            System.out.println("\n\n");
            e.printStackTrace();
        }
    }

    // File Version
    public List<String> readFile(File fileLocation) {
        List<String> fileLineList = new ArrayList<>();

        try {
            Scanner myReader = new Scanner(fileLocation);
            while (myReader.hasNextLine()) {
                fileLineList.add(myReader.nextLine());
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error on readFile\nfile: "+fileLocation.getName());
            System.out.println("\n\n");
            e.printStackTrace();
        }

        return fileLineList;
    }

    // String Version
    public List<String> readFile(String fileLocation) {
        File fileNeededToBeRead = new File(fileLocation);
        List<String> fileLineList = new ArrayList<>();

        try {
            Scanner myReader = new Scanner(fileNeededToBeRead);
            while (myReader.hasNextLine()) {
                fileLineList.add(myReader.nextLine());
            }

        }
        catch (FileNotFoundException e) {
            System.out.println("Error on readFile\nfile: "+fileNeededToBeRead.getName());
            System.out.println("\n\n");
            e.printStackTrace();
        }

        return fileLineList;
    }

    // File Version
    public String readFileLine(int line, File fileLocation) {
        List<String> lineList = readFile(fileLocation);
        line--;

        return lineList.get(line);
    }

    // String Version
    public String readFileLine(int line, String fileLocation) {
        List<String> lineList = readFile(fileLocation);
        line--;

        return lineList.get(line);
    }

    // prints a line off a List
    public void printFileList(List<String> fileLineList) {
        for (String line : fileLineList) {
            System.out.println(line);
        }
    }

    // File Version
    public void writeFile(File myFile, String whatToWrite) {
        try {
            FileWriter writer = new FileWriter(myFile);

            writer.write(whatToWrite);
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Something went wrong with writeFile\nFile: " + myFile.getName());
            System.out.println("\n\n\n");
            e.printStackTrace();
        }
    }

    // String Version
    public void writeFile(String myFile, String whatToWrite) {
        try {
            FileWriter writer = new FileWriter(myFile);

            writer.write(whatToWrite);
            writer.close();
        }
        catch (IOException e) {
            System.out.println("Something went wrong with writeFile\nFile: " + myFile);
            System.out.println("\n\n\n");
            e.printStackTrace();
        }
    }

    // File version
    public void appendFile(File myFile, String NewLine) {
        try {
            FileWriter writerAppend = new FileWriter(myFile, true);
            writerAppend.write(NewLine);
            writerAppend.close();

        }
        catch (IOException e) {
            System.out.println("Something went wrong with writeFile\nFile: " + myFile.getName());
            System.out.println("\n\n\n");
            e.printStackTrace();
        }
    }

    // String Version
    public void appendFile(String myFile, String NewLine) {
        try {
            FileWriter writerAppend = new FileWriter(myFile, true);
            writerAppend.write(NewLine);
            writerAppend.close();

        }
        catch (IOException e) {
            System.out.println("Something went wrong with writeFile\nFile: " + myFile);
            System.out.println("\n\n\n");
            e.printStackTrace();
        }
    }

    // File Version
    public void editLine(int lineNumber, String newLine, File myFile) {
        List<String> lineList = readFile(myFile);
        lineNumber--;

        try {
            lineList.set(lineNumber, newLine);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("This line your trying to reach is outOfBounds");
            System.out.println("your trying to reach line: " + lineNumber);
            System.out.println("there is only " + lineList.size() + " Lines in the File " + myFile.getName());
        }

        clearFile(myFile);
        for (String line : lineList) {
            appendFile(myFile, line + "\n");

        }
    }

    // String Version
    public void editLine(int lineNumber, String newLine, String myFile) {
        List<String> lineList = readFile(myFile);
        lineNumber--;

        try {
            lineList.set(lineNumber, newLine);
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("This line your trying to reach is outOfBounds");
            System.out.println("your trying to reach line: " + lineNumber);
            System.out.println("there is only " + lineList.size() + " Lines in the File " + myFile);
        }

        clearFile(myFile);
        for (String line : lineList) {
            appendFile(myFile, line + "\n");

        }
    }

}
