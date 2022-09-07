import java.util.Random;
import java.util.Scanner;

public class MCL {
    static FileManger fileManger = new FileManger();
    static saveDataMgr sDM = new saveDataMgr();

    static time time = new time();
//    static Scanner scanner = new Scanner(System.in);
//    static Random rand = new Random();

    public void MessyCodeLauncherStart() {
        clearScreen();
        System.out.println("welcome " + sDM.getUsrName() + ", Today is: " + time.getDate() + ", at " + time.getTime());
        System.out.println("what would you like todo?");
        // list the options
    }

    private int clearScreen() {
        try {
            System.out.print("\033[H\033[2J");
            System.out.flush();
            return 0;
        }
        catch (Exception e) {
            return 1;
        }
    }
}
