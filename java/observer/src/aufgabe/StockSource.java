package aufgabe;

import java.util.ArrayList;
import java.util.List;

public class StockSource extends Subject{

    List<Stock> Stocks=new ArrayList<Stock>();

    public void createStocks()
    {
        for (int i=0; i<10; i++)
        {
            Stocks.add(new Stock("isin"+Integer.toString(i), "Stock "+Integer.toString(i), 0.1+i));
        }
        notifyAllObservers();
    }

    public void deleteStock(int i)
    {
        Stocks.remove(i);
    }

    public List<Stock> getAllStocks()
    {
        return Stocks;
    }


    public List<Stock> getPopularStocks()
    {
        return Stocks.subList(0,2);
    }

}
