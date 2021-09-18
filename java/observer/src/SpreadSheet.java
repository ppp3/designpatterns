public class SpreadSheet implements  IObserver{
    @Override
    public void update() {
        System.out.println("SpreadSheet notified: "+dataSource.getValue());
    }

    private DataSource dataSource;

    public SpreadSheet(DataSource dataSource) {
        this.dataSource = dataSource;
    }
}
