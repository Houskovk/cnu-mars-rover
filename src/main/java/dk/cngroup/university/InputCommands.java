package dk.cngroup.university;

import static dk.cngroup.university.Direction.*;

public class InputCommands {

    static RoverPosition initialPosition = new RoverPosition(0,1);
    static Direction initialDirection = NORTH;
    static int landscapeSize = 5;
    static RoverPosition destination = new RoverPosition(3,4);
    static char[] roverActions = {'R', 'R', 'F', 'R', 'F', 'L', 'F', 'F',
            'L', 'F', 'F', 'R', 'F', 'L', 'F', 'F', 'L', 'F'};

}
