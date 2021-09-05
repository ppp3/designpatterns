package aufgabe;

public class DirectionService {

    private ITravelMode mode;


    public ITravelMode getMode() {
        return mode;
    }

    public void setMode(ITravelMode mode) {
        this.mode = mode;
    }

    public int getDirection()
    {
        return mode.getDirection();
    }

    public int getEta()
    {
        return mode.getDirection();
    }








}
