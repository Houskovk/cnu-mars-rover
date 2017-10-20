package dk.cngroup.university

import spock.lang.Specification

class DetectedObjectsTest extends Specification {


    void "should print object type one to string"() {
        given:

        ObjectTypeOne stone = new ObjectTypeOne()


        when:
        String result = stone.printPicture();

        then:
        result == """           
  xxXXXXX  
 xxXXXxxXx 
 xXXXxxxXX 
  XXXxXxx  
"""
    }

}
