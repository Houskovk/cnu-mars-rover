package dk.cngroup.university;

public class Simulation {

    public void simulationInterface() {


        InputCommands input = new InputCommands();
        input.compileInput();

        RandomFieldGenerator generator = new RandomFieldGenerator();
        Landscape landscape = new Landscape(generator, input.getLandscapeSize());

        String map = landscape.toString();
        LandscapeMapToFile mapMaker = new LandscapeMapToFile();
        mapMaker.writeMapFile(map);



        if (landscape.isFieldAccessible(input.getInitialPosition()) && landscape.isFieldAccessible(input.getDestination())) {

            RoverMovement movement = new RoverMovement(input.getInitialDirection(), input.getInitialPosition(),
                    landscape, input.getRoverActions());
            movement.executeCommandSequence(input.getRoverActions());

            boolean simulationResult = (InputCommands.destination.getX() == movement.position.getX()
                    && InputCommands.destination.getY() == movement.position.getY());
            System.out.println("\n" + simulationResult);

            System.out.println("Reached coordinates: " + movement.position.getX() + ", " + movement.position.getY());


        } else {
            System.out.println("Initial position or destination not accessible. Aborting simulation.");
        }
    }

}
