package aufgabe;

import java.util.ArrayList;
import java.util.List;



public abstract class StockObserver {

    protected StockSource source;
    protected List<Stock> Stocks;

    public abstract void update();

    public void showStocks()
    {
        for (Stock stock : Stocks)
        {
            System.out.println("ISIN "+stock.getIsin()+" Title "+stock.getTitle()+" Value "+stock.getValue());
        }
        System.out.println(" ");
    }

    StockObserver(StockSource s)
    {
        source=s;
    }

}
