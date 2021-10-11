package com.company.avaFilters;

import com.company.Filter;
import com.company.Image;

public class CaramalFilter  implements Filter {

    private Caramel caramel;

    public CaramalFilter(Caramel caramel)
    {
        this.caramel=caramel;
    }

    @Override
    public void apply(Image image) {
        caramel.init();
        caramel.render(image);
        System.out.println("Caramel auf Image angewendet");
    }
}
