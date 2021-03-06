package dk.cngroup.university;

public class Mars {
    private Rover rover;
    private Landscape landscape;
    private RoverPosition position;


    public Mars(Rover rover, Landscape landscape, RoverPosition position) {
        this.rover = rover;
        this.landscape = landscape;
        this.position = position;

    }

    public RoverPosition getPosition() {
        return position;
    }

    public RoverPosition moveForward(Rover rover) {
        RoverPosition forwardPosition = RoverPositionFactory.getForwardPosition(position, rover.getDirection());

        if (landscape.isFieldAccessible(forwardPosition)) {
            return forwardPosition;
        } else {
            System.out.println("Detected obstacle at coordinates: " + forwardPosition.getX() + ", " + forwardPosition.getY());
            ObjectsToFile printImage = new ObjectsToFile();
            printImage.writeFile();
            return position;
        }
    }

    public RoverPosition moveBackwards(Rover rover) {
        RoverPosition backwardsPosition = RoverPositionFactory.getBackwardsPosition(position, rover.getDirection());

        if (landscape.isFieldAccessible(backwardsPosition)) {
            return backwardsPosition;
        } else {
            System.out.println("Detected obstacle at coordinates: " + backwardsPosition.getX() + ", " + backwardsPosition.getY());
            ObjectsToFile printImage = new ObjectsToFile();
            printImage.writeFile();
            return position;
        }
    }

}
