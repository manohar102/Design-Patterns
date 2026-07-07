package facadepattern;

public class FacadePattern {
    public static void main(String[] args) {
        // Instantiate components
        Amplifier amp = new Amplifier("Top-tier Amplifier");
        DvdPlayer dvd = new DvdPlayer("4K UHD Blu-Ray Player");
        Projector projector = new Projector("4K Laser Projector");
        Screen screen = new Screen("120-inch Motorized Screen");
        TheaterLights lights = new TheaterLights("Smart LED Theater Lights");

        // Instantiate Facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, dvd, projector, screen, lights);

        // Run the movie
        homeTheater.watchMovie("Inception");
        
        System.out.println();
        
        // Shut down the movie
        homeTheater.endMovie();
    }
}
