package dk.cngroup.university;

public class ObjectTypeTwo extends DetectedObjects {

    private static char objectType[][] = {{' ',' ',' ',' ',' ',' ',' '},{' ',' ','x','x','X','X','X','X','X','X','x','x',' ',' '},
            {' ','x','x','x','X','X','X','X','X','X','x','x','X',' '},
            {' ',' ','X','X','X','X','x','x','x','x','X','X',' ',' '}};

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
