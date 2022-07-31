import java.util.Scanner;
import java.util.Random;

import java.io.File;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    static Random rand = new Random();

    // I made these classes
    static Setup setup = new Setup(true);
    static FileManger fileManger = new FileManger();

    public static void main(String[] args) {
        if (needsToGoInMCLSS()) {
            setup.MCLSS();
        }
        else {
            if (fileManger.readFileLine(6, "SaveFiles/saveData.txt").equals(setup.MASTER_BETA_KEY)) {
                System.out.println("pass 1");
            }
            else {
                System.out.println("your key does not match with the MASTERKEY");
                System.exit(312);
            }
            System.out.println("pass 2");
        }
    }

    static private boolean needsToGoInMCLSS(){
        String data = fileManger.readFileLine(2, "SaveFiles/saveData.txt");
        return !data.equals("1");
    }
}