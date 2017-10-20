package dk.cngroup.university;

public class ObjectTypeThree extends DetectedObjects {

    static char objectType[][] = {{' ',' ',' ',' ',' ',' ',' '},{' ',' ','X','X','x',' ',' '},
            {' ','x','X','x','X','X',' '},{' ','x','x','x','X','X',' '},
            {' ','x','x','X','X','X',' '}};


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
