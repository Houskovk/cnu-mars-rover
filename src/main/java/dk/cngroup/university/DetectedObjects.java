package dk.cngroup.university;

public class DetectedObjects {

    static char objectType[][];

    public String printPicture() {

        StringBuilder sb = new StringBuilder();
        String objectImage;

        for (char[] row : objectType) {
            for (char field : row) {
                sb.append(field);
            }
            sb.append("\n");
        }
        objectImage = sb.toString();

        return objectImage;

    }

}
