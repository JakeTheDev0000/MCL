import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Setup {
    static Scanner scanner = new Scanner(System.in);
    static FileManger fileManger = new FileManger();

    Boolean inBeta;

    // Temp
    public final String MASTER_BETA_KEY = "0000";


    Setup(Boolean betaMode) {
        this.inBeta = betaMode;
    }

    //Todo: Save all Data to Files

    void MCLSS() {
        String usrName;
        String betaKey = "None";

        System.out.println("Welcome to The MCL SetupStart\nYou are going to asnswer a couple a questions, it will be quick and its a one time thing");
        pressEnterToContinue();

        System.out.println("great, What is Your Name");
        usrName = scanner.nextLine();

        System.out.println("Hello " + usrName + ", nice to meet you");

        if (inBeta) {
            System.out.println("Sign in With a Beta Key");
            betaKey = scanner.nextLine();

            System.out.println("checking...");

            if (betaKey.equals(MASTER_BETA_KEY)) {
                System.out.println("beta key does match.. continuing");
            }
            else {
                System.out.println("your key does not match with the Master Beta Key..");
                System.exit(36);
            }

        }
        else {
            System.out.println("FATAL SYSTEM ERROR, BETA KEY ACTIVATION HAS BEEN DEACTIVATED");
            System.exit(43);
        }

        System.out.println("proccing info");
        List<String> InfoList = new ArrayList<>();
        InfoList.add(usrName);
        InfoList.add(betaKey);
        enterInfo(InfoList);

        System.out.println("MCLSS conplete");

    }

    private void enterInfo(List<String> InfoList) {
        File saveDataFile = new File("SaveFiles/saveData.txt");

        fileManger.editLine(2, "1", saveDataFile);
        fileManger.editLine(4, InfoList.get(0), saveDataFile);
        fileManger.editLine(6, InfoList.get(1), saveDataFile);
    }

    private void pressEnterToContinue() {
        System.out.println("[Press Enter key to continue]");
        try
        {
            scanner.nextLine();
        }
        catch(Exception e)
        {
            System.out.println("PressEnterToContinue() has failed");
            e.printStackTrace();
        }
    }
}
