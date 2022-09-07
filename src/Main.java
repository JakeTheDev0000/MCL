import java.util.Scanner;
import java.util.Random;



public class Main {
//    static Scanner scanner = new Scanner(System.in);
//    static Random rand = new Random();

    // I made these classes
    static Setup setup = new Setup(true);
    static FileManger fileManger = new FileManger();
//    static time time = new time();
    static MCL mcl = new MCL();

    public static void main(String[] args) {
//        test();

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
            // ready to continue to mcl
            mcl.MessyCodeLauncherStart();
        }
    }

    static private boolean needsToGoInMCLSS(){
        String data = fileManger.readFileLine(2, "SaveFiles/saveData.txt");
        return !data.equals("1");
    }

//    static private void test(){
//
//        // execute any cmd command
//        // System.out.println(executeCommand("cmd /c dir"));
//
//
//        System.exit(0);
//    }
}