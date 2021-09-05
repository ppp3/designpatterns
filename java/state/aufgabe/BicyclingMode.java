package aufgabe;

public class BicyclingMode implements ITravelMode {
    public int getEta()
    {
        System.out.println("Calculating ETA (bicycling)");
        return 2;
    }

    public int getDirection()
    {
        System.out.println("Calculating Direction (bicycling)");
        return 2;
    }
}
