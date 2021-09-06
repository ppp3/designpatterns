import java.util.ArrayList;
import java.util.List;

public abstract class UIControl{

	private List<EventHandler> eventHandler= new ArrayList<>();
	
	
	public void addEventHandler(EventHandler obs)
	{
		eventHandler.add(obs);
	}
	
	protected void notifyEventHandlers()
	{
		for (var observer:eventHandler)
		{
			observer.handle();
		}
	}
	

}

