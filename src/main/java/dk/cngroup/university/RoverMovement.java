package dk.cngroup.university;

public class RoverMovement {

    char[] commandSequence;
    char command;
    Direction direction;
    Rover rover = new Rover(direction);

    public RoverMovement(Direction direction, char[] commandSequence) {
        this.direction = direction;
        this.commandSequence = commandSequence;
    }


    public Rover executeCommandSequence(char commandSequence[]) {

        for(int i = 0; i < commandSequence.length; i++) {
            command = commandSequence[i];
            executeCommand(commandSequence);
        }
        return rover;

    }



    private void executeCommand(char commandSequence[]) {
        this.commandSequence = commandSequence;

        switch(command) {
            case 'R':
                direction = direction.getRightOf();
                rover = new Rover(direction);
                break;
            case 'L':
                direction = direction.getLeftOf();
                rover = new Rover(direction);
                break;
            default:
                System.out.println("Unknown command!");
                break;
        }

    }
}
