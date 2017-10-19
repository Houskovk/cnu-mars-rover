package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Direction.*

class RoverMovementTest extends Specification {


    @Unroll
    def "should turn from #oldDirection to #newDirection with command sequence"(Direction oldDirection, Direction newDirection) {

        given:
        char[] commandSequence = ['R', 'R', 'R', 'L']
        def roverMovement = new RoverMovement(oldDirection, commandSequence)

        when:
        def rover = roverMovement.executeCommandSequence(commandSequence)

        then:
        newDirection == rover.getDirection()

        where:
        oldDirection | newDirection
        NORTH        | SOUTH
        WEST         | EAST
        SOUTH        | NORTH
        EAST         | WEST

    }

}
