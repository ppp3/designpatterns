package com.company;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private List<Object> objects =new ArrayList<Object>();

    public void add(Object shape)
    {
        objects.add(shape);
    }

    public void render()
    {
        //Composite Pattern kommt hier zur Anwendung
        for (var object: objects)
        {
            if (object instanceof Shape)
                ((Shape) object).render();
            else
                ((Group)object).render();
        }
    }
}
