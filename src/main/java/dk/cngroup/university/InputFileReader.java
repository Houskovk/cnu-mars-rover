package dk.cngroup.university;

import java.io.*;
import java.util.ArrayList;

public class InputFileReader {

   File myFile = new File("InputCommands.txt");
    private String inputCommands[] = new String[0];

    public void readInputFile(File myFile){
        this.myFile = myFile;

        try {

            BufferedReader reader = new BufferedReader(new FileReader(myFile));

            String line;
            ArrayList<String> list = new ArrayList<String>();
            while ((line = reader.readLine()) != null) {
                if(line.length() > 0) {
                    list.add(line);
                }
            }
            inputCommands = list.toArray(new String[0]);
            reader.close();

        }catch(Exception e) {
            System.out.println("Error");
        }

    }

    public String[] getInputCommands() {
        return inputCommands;
    }


}
