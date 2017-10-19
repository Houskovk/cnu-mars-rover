package dk.cngroup.university;

public class Simulation {

    public void simulationInterface(){

        RandomFieldGenerator generator = new RandomFieldGenerator();
        Landscape landscape = new Landscape(generator, InputCommands.landscapeSize);

        RoverMovement movement = new RoverMovement(InputCommands.initialDirection, InputCommands.initialPosition,
                                    landscape, InputCommands.roverActions);
        movement.executeCommandSequence(InputCommands.roverActions);

        System.out.println("Reached coordinates: " + movement.position.getX() + ", " + movement.position.getY());

        if(InputCommands.destination.getX() == movement.position.getX()
                && InputCommands.destination.getY() == movement.position.getY()){
            System.out.println("TRUE");
        }else{
            System.out.println("FALSE");
        }


    }

}
