package ru.getjavajob.mamedov.homework4.converter;

import ru.getjavajob.mamedov.homework4.exceptions.EmptyException;
import ru.getjavajob.mamedov.homework4.person.Person;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Ganzhenko on 23.09.2016.
 */
public class ConvertionServiceImpl implements ConvertionService {
    @Override
    public Person convert(String source) {
        if (source == null || source.equals("")) {
            throw new EmptyException();
        }
        String[] split = source.split(" ");
        Person person = new Person();
        person.setPerosnId(Integer.parseInt(split[0]));
        person.setPersonPhone(split[1]);
        person.setPersonName(split[2]);
        person.setPersonFamily(split[3]);
        person.setPersonFatherName(split[4]);
        person.setBirthdate(toDate(split[5]));
        return person;
    }

    private Date toDate(String str) {
        Date date = null;
        DateFormat format = new SimpleDateFormat("dd.mm.yyyy", Locale.ENGLISH);
        try {
            date = format.parse(str);
        } catch (ParseException e) {
            str = str.replaceAll("-", ".");
            return toDate(str);
        }
        return date;
    }
}
