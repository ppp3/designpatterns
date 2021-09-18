import aufgabe.StatusBar;
import aufgabe.StockListView;
import aufgabe.StockSource;

public class Main {

    public static void main(String[] args) {
        /*
        DataSource dataSource=new DataSource();
        SpreadSheet sheet1=new SpreadSheet(dataSource);
        SpreadSheet sheet2=new SpreadSheet(dataSource);
        Chart chart=new Chart(dataSource);

        dataSource.addObserver(sheet1);
        dataSource.addObserver(sheet2);
        dataSource.addObserver(chart);

        dataSource.setValue(34);
        */
        //Aufgabe
        StockSource s=new StockSource();

        StatusBar bar=new StatusBar(s);
        if (s==null)
        {
            System.out.println("Ist null!!");
        }
        StockListView view=new StockListView(s);

        s.registerObserver(bar);
        s.registerObserver(view);

        s.createStocks();

    }
}
