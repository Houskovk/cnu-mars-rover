package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

import static dk.cngroup.university.Field.*

class SimulationTest extends Specification {

    @Unroll
    "should reach destination when all fields accessible"(){

        given:
        RandomFieldGenerator generator = Mock(RandomFieldGenerator)
        generator.getRandomField() >>> [ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE, ACCESSIBLE]
        Landscape landscape = new Landscape(generator, 5)

        InputCommands input = new InputCommands()
        input.compileInput()

        char[] roverActions = InputCommands.roverActions
        RoverPosition destination = InputCommands.destination

        RoverMovement simulation = new RoverMovement(InputCommands.initialDirection, InputCommands.initialPosition, landscape, roverActions)

        when:
        RoverPosition result = simulation.executeCommandSequence(roverActions)

        then:
        result.getX() == destination.getX()
        result.getY() == destination.getY()

    }


}
