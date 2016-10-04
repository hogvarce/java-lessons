package ru.getjavajob.mamedov.homework8.services;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ganzhenko on 04.10.2016.
 */
public class CSVReaderImpl implements CSVReader {

    private String pathName;
    private List<String[]> output;

    public String getPathName() {
        return pathName;
    }

    public void setPathName(String pathName) {
        this.pathName = pathName;
    }

    @Override
    public List<String[]> read() {
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        output = new ArrayList<>();

        try {
            br = new BufferedReader(new FileReader(pathName));
            br.readLine();
            while ((line = br.readLine()) != null) {
                String[] item = line.split(cvsSplitBy);
                output.add(item);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return output;
    }
}
