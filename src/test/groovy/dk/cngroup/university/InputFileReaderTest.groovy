package dk.cngroup.university

import spock.lang.Specification

class InputFileReaderTest extends Specification {

    def "should read file correctly"(){

        given:
        File myFile = new File("InputCommands.txt")
        def result = new InputFileReader()
        result.readInputFile(myFile)

        when:
        def testInput = result.getInputCommands()
        def readInput = testInput.toString()

        then:
        readInput == "[0, 1, NORTH, 5, 3, 4, RRFRFLFFLFFRFLFFLF]"


    }



}
