import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileReader {

    private static final List<String> people = new ArrayList<>();

    public static List<String> justAList(String person) {
        for (String actualPerson : people) {
            people.add(person);
        }
        return justAList(person);
    }

    public static List<String> fileReadHandler(String file) {
        try {
            Scanner scanner = new Scanner(new File("person.txt"));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return fileReadHandler(file);
    }


}
