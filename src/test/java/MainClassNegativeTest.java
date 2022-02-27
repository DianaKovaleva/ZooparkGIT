import org.testng.annotations.Test;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import static org.testng.Assert.*;
public class MainClassNegativeTest extends BeforeGroupsTest{


        @Test(groups = "negative")
        public void CheckConsoleResult() throws FileNotFoundException {
            ArrayList<String> consoleInput1 = FileHelper.readFromFile("ConsoleInput1.txt");
            if (consoleInput1.get(0).equals("1") || consoleInput1.get(0).equals("2") || consoleInput1.get(0).equals("3")
                || consoleInput1.get(0).equals("0")) {
                System.out.println("Было введено допустимое значение");
            } else {
                ArrayList<String> consoleOutput1 = FileHelper.readFromFile("ConsoleOutput1.txt");
                ArrayList<String> expectedOutput1 = new ArrayList<>();
                expectedOutput1.add("Введено некорректное число");
                assertEquals(consoleOutput1, expectedOutput1);
                System.out.println("Негативная проверка прошла успешно");
            }
        }
}




