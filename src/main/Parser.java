package main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by parke_000 on 2016-07-13.
 */
public class Parser {
    private List<String> input;
    private ArrayList<String> data;
    public Parser(File file) {
        data = new ArrayList<String>();
        try {
            input = Files.readAllLines(Paths.get(file.toURI()));
        }catch (Exception e){
            e.printStackTrace();
        }

        for (int i = 0; i < input.size(); i++) {
            String s = input.get(i);
            if(s.contains("<Link ")){
                data.add(s);
            }
        }
    }

    public ArrayList<String> getData() {
        return (ArrayList<String>)data.clone();
    }
}
