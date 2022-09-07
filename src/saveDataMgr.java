import java.io.File;
//import java.util.Random;
//import java.util.Scanner;

public class saveDataMgr {
    static FileManger fileManger = new FileManger();
//    static time time = new time();
//    static Scanner scanner = new Scanner(System.in);
//    static Random rand = new Random();

    File saveDataFile = new File("SaveFiles/saveData.txt");

    public String getHasGoneInMCLSS() {
        return fileManger.readFileLine(2, saveDataFile);
    }
    public String getUsrName() {
        return fileManger.readFileLine(4, saveDataFile);
    }
    public String getBetaKey() {
        return fileManger.readFileLine(6, saveDataFile);
    }

    public void changeHasGoneInMCLSS(String newContent) {
        fileManger.editLine(2, newContent, saveDataFile);
    }
    public void changeUsrName(String newContent) {
        fileManger.editLine(4, newContent, saveDataFile);
    }
    public void changeBetaKey(String newContent) {
        fileManger.editLine(6, newContent, saveDataFile);
    }
}
