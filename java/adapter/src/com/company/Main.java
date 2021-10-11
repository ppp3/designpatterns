package com.company;

import com.company.avaFilters.CaramalFilter;
import com.company.avaFilters.Caramel;

public class Main {

    public static void main(String[] args) {
	// write your code here
        var imageView = new ImageView(new Image());
        imageView.apply(new CaramalFilter(new Caramel()));
    }
}
