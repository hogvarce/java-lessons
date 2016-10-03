package ru.getjavajob.mamedov.homework4;

import ru.getjavajob.mamedov.homework4.converter.ConvertionService;
import ru.getjavajob.mamedov.homework4.converter.ConvertionServiceImpl;
import ru.getjavajob.mamedov.homework4.exceptions.EmptyException;
import ru.getjavajob.mamedov.homework4.person.Person;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Ganzhenko on 23.09.2016.
 */
public class Main {

    public static final String PATHNAME = "src/main/resources/person-data.csv";

    public static void main(String[] args) {

        List<Person> persons = new ArrayList<>();

        try {
            System.out.println("Home work #4");

            File file = new File(PATHNAME);
            Scanner scanner = new Scanner(file);
            String line = null;
            ConvertionService converter = new ConvertionServiceImpl();
            while (scanner.hasNextLine()) {
                line = scanner.nextLine();
                Person person = converter.convert(line);
                System.out.println(person);
                persons.add(person);
            }
        } catch (EmptyException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("что-то произошло");
        }
    }
}
