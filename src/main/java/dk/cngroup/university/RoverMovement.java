package dk.cngroup.university;

public class RoverMovement {

    char[] commandSequence;
    char command;
    Direction direction;
    Rover rover = new Rover(direction);
    RoverPosition position;
    Landscape landscape;
    Mars mars = new Mars(rover, landscape, position);

    public RoverMovement(Direction direction, RoverPosition position, Landscape landscape, char[] commandSequence) {
        this.direction = direction;
        this.position = position;
        this.landscape = landscape;
        this.commandSequence = commandSequence;
    }


    public RoverPosition executeCommandSequence(char commandSequence[]) {

        for(int i = 0; i < commandSequence.length; i++) {
            command = commandSequence[i];
            executeCommand(commandSequence);
        }
        return position;

    }



    private void executeCommand(char commandSequence[]) {
        this.commandSequence = commandSequence;

        switch(command) {
            case 'R':
                rover = rover.turnRight(direction);
                direction = rover.getDirection();
                mars = new Mars(rover, landscape, position);
                break;
            case 'L':
                rover = rover.turnLeft(direction);
                direction = rover.getDirection();
                mars = new Mars(rover, landscape, position);
                break;
            case 'F':
                position = mars.moveForward(rover);
                mars = new Mars(rover, landscape, position);
                break;
            case 'B':
                position = mars.moveBackwards(rover);
                mars = new Mars(rover, landscape, position);
                break;
            default:
                System.out.println("Unknown command!");
                break;
        }

    }
}
