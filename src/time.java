import java.text.SimpleDateFormat;
import java.util.Date;

public class time {

    void waitSec(int sec) {
        try {
            Thread.sleep(sec * 1000L);
        } catch (InterruptedException e) {
            System.out.println("Error on waitSec");
            e.printStackTrace();
        }
    }

    String getTime() {
        return new SimpleDateFormat("HH:mm:ss:SSSS").format(new Date());
    }

    String getDate() {
        return new SimpleDateFormat("MM/dd/yyyy").format(new Date());
    }

    void showTimeInConsoleSec(int sec) {
        for (int i = 0; i < sec; i++) {
            System.out.println(getTime());
            waitSec(1);
        }
    }

}
