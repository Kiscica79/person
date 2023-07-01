import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> lines = FileReader.fileReadHandler("person.txt");
        List<Person> peoples = new ArrayList<>();

        for (var line : lines) {
            String[] lineAsArray = line.split(",");
            String name = lineAsArray[0];
            int age = Integer.parseInt(lineAsArray[1]);
            Gender gender = lineAsArray[2].equals("férfi") ? Gender.MALE : Gender.FEMALE;

            // ez ugyanaz
            /*
            switch (lineAsArray[2]) {
                case "férfi" -> gender = Gender.MALE;
                case "nő" -> gender = Gender.FEMALE;
             */

            Person actual = new Person(lineAsArray[0], Integer.parseInt(lineAsArray[1]),
                    lineAsArray[2].equals("férfi") ? Gender.FEMALE : Gender.MALE);
            peoples.add(actual);

            // bele lehet tenni eleve a peopeles.add-be a fenti egészet
        }

        for (var actual : peoples) {
            System.out.println(actual);
        }
    }

    public enum Gender {
        MALE, FEMALE
    }
}
