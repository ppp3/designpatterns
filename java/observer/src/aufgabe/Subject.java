package aufgabe;

import java.util.ArrayList;
import java.util.List;

abstract public class Subject{
    private List<StockObserver> observers=new ArrayList<>();

    public void registerObserver(StockObserver observer)
    {
        observers.add(observer);
    }

    public void deleteObserver(StockObserver observer)
    {
        observers.remove(observer);
    }

    public void notifyAllObservers()
    {
        for (StockObserver observer: observers)
        {
            observer.update();
        }
    }

}
