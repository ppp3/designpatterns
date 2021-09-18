package aufgabe;

public class StatusBar extends StockObserver{

        @Override
        public void update()
        {
            Stocks=source.getAllStocks();
            showStocks();
        }

        public StatusBar(StockSource source) {
            super(source);
        }

}

