import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHelper {

    public static void writeToFile(String filePath, String data) throws IOException {
        FileWriter file = new FileWriter(filePath);
        file.write(data);
        file.close();
    }

    public static ArrayList<String> readFromFile(String path) throws FileNotFoundException {
        ArrayList<String> list = new ArrayList<>();
        File file = new File(path);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNext()) {
            list.add(scanner.nextLine());
        }
        return list;
    }
}
