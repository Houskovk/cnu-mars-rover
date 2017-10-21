package dk.cngroup.university;

import java.io.*;

public class LandscapeMapToFile {

    public void writeMapFile(String mapImage) {
        File file = new File("LandscapeMaps.txt");

        try {
            FileWriter output = new FileWriter(file, true);
            output.write("New map image:\n" + mapImage + "\n\n");
            output.close();

        } catch (IOException e) {
            System.out.println("ERROR: " + e);
        }

        System.out.println("Landscape map saved to file: " + file + "\n");

    }
}