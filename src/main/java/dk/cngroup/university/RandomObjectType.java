package dk.cngroup.university;

import java.util.Random;

public class RandomObjectType {

    public static String randomType() {

        DetectedObjects types[] = new DetectedObjects[3];
        types[0] = new ObjectTypeOne();
        types[1] = new ObjectTypeTwo();
        types[2] = new ObjectTypeThree();
        Random random = new Random();

        return types[random.nextInt(3)].printPicture();

    }

}
