package aufgabe;

import java.util.ArrayList;
import java.util.List;

public abstract class UIControl {

	private List<EventHandler> eventHandlers =new ArrayList<EventHandler>();

	public void addEventHandler(EventHandler eventHandler)
	{
		eventHandlers.add(eventHandler);

	}

	protected void notifyEventHandlers()
	{
		for (EventHandler eventHandler : eventHandlers)
		{
			eventHandler.handle();
		}
	}
}

