package dk.cngroup.university

import spock.lang.Specification
import spock.lang.Unroll

class StartSimulationTest extends Specification {

    @Unroll
    "simulation should start"() {
        when:
        StartSimulation.main()

        then:
        noExceptionThrown()
    }

}


