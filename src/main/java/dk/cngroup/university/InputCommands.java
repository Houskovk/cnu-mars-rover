package dk.cngroup.university;

import java.io.File;

public class InputCommands {

    static RoverPosition initialPosition;
    static Direction initialDirection;
    static int landscapeSize;
    static RoverPosition destination;
    static char[] roverActions;

    static File myFile = new File("InputCommands.txt");


    public void compileInput() {

        InputFileReader input = new InputFileReader();
        input.readInputFile(myFile);
        String[] inputCommands = input.getInputCommands();

        String inputDirection = inputCommands[2];
        initialDirection = Direction.valueOf(inputDirection);
        landscapeSize = Integer.parseInt(inputCommands[3]);
        initialPosition = new RoverPosition(Integer.parseInt(inputCommands[0]), Integer.parseInt(inputCommands[1]));
        destination = new RoverPosition(Integer.parseInt(inputCommands[4]),Integer.parseInt(inputCommands[5]));
        roverActions = inputCommands[6].toCharArray();

    }

    public RoverPosition getInitialPosition() {
        return initialPosition;
    }

    public char[] getRoverActions() {
        return roverActions;
    }

    public RoverPosition getDestination() {
        return destination;
    }

    public int getLandscapeSize() {
        return landscapeSize;
    }

    public Direction getInitialDirection() {
        return initialDirection;
    }
}