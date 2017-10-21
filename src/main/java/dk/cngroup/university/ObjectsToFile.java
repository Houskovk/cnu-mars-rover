package dk.cngroup.university;

import java.io.*;

public class ObjectsToFile {

    public void writeFile() {
        File file = new File("DetectedObjectImages.txt");
        String stone = RandomObjectType.randomType();

        try{
            FileWriter output = new FileWriter(file, true);
            output.write("New image:\n" + stone + "\n\n\n");
            output.close();

        }catch(IOException e) {
            System.out.println("ERROR: " + e);
        }

        System.out.println("Image of encountered object saved to file: " + file);


    }

}
