package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*
import static dk.cngroup.university.Field.*

class RoverMovementTest extends Specification {

    def static Field[][] testLandscape = [
            [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE],
            [ACCESSIBLE, ACCESSIBLE, INACCESSIBLE, INACCESSIBLE, INACCESSIBLE],
            [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE],
            [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE],
            [ACCESSIBLE, INACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE]
    ]



    @Unroll
    "should move from #direction to correct position with command sequence"(Direction direction, int x, int y){

        given:
        char[] commandSequence = ['R', 'R', 'F', 'F']
        def position = new RoverPosition(1, 1)
        def landscape = new Landscape(testLandscape)
        def roverMovement = new RoverMovement(direction, position, landscape, commandSequence)

        when:
        def newPosition = roverMovement.executeCommandSequence(commandSequence)

        then:
        x == newPosition.getX()
        y == newPosition.getY()

        where:
        direction | x | y
        NORTH | 3 | 1
        EAST | 1 | 0
        SOUTH | 0 | 1
        WEST | 1 | 1



    }


}
