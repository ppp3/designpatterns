import java.util.ArrayList;
import java.util.List;
import java.util.Observer;

//Oberservable
abstract public class Subject {

    public List<IObserver> observers=new ArrayList<IObserver>();

    public void addObserver(IObserver ob)
    {
        observers.add(ob);
    }

    public void removeObserver(IObserver ob)
    {
        observers.remove(ob);
    }

    public void notifyObserver()
    {
        for(var oberserver:observers)
        {
            oberserver.update();
        }
    }

}
