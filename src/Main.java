import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Random;

import java.io.File;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();
    static Setup setup = new Setup(true);

    public static void main(String[] args) {
        if (needsToGoInMCLSS()) {
            setup.MCLSS();
        }
        else {
            System.out.println("pass");
        }
    }

    static private boolean needsToGoInMCLSS(){
        String data = "";
        try {
            File hasGoneThruMCLSS = new File("SaveFiles/HasGoneThrughMCLSS.txt");
            Scanner myReader = new Scanner(hasGoneThruMCLSS);
            data = myReader.nextLine();

            myReader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("File not Found\n\n");
            e.printStackTrace();
        }

        return !data.equals("1");
    }
}