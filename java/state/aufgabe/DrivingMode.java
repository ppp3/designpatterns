package aufgabe;

public class DrivingMode implements ITravelMode {

    public int getEta()
    {
        System.out.println("Calculating ETA (driving)");
        return 1;
    }

    public int getDirection()
    {
        System.out.println("Calculating Direction (driving)");
        return 1;
    }

}
