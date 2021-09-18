package aufgabe;

public class StockListView extends StockObserver{

    @Override
    public void update()
    {
        Stocks=source.getPopularStocks();
        showStocks();
    }

    public StockListView(StockSource source) {
        super(source);
    }

}