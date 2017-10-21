package dk.cngroup.university;

public class Simulation {

    public void simulationInterface(){

        InputCommands input = new InputCommands();
        input.compileInput();

        RandomFieldGenerator generator = new RandomFieldGenerator();
        Landscape landscape = new Landscape(generator, input.getLandscapeSize());

        String map = landscape.toString();
        LandscapeMapToFile mapMaker = new LandscapeMapToFile();
        mapMaker.writeMapFile(map);

        RoverMovement movement = new RoverMovement(input.getInitialDirection(), input.getInitialPosition(),
                                    landscape, InputCommands.roverActions);
        movement.executeCommandSequence(InputCommands.roverActions);

        if(InputCommands.destination.getX() == movement.position.getX()
                && InputCommands.destination.getY() == movement.position.getY()){
            System.out.println("\nTRUE");
        }else{
            System.out.println("\nFALSE");
        }

        System.out.println("Reached coordinates: " + movement.position.getX() + ", " + movement.position.getY());



    }

}
