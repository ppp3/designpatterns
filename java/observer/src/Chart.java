public class Chart implements  IObserver {
    private DataSource dataSource;

    public Chart(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public void update() {
        System.out.println("Chart notified "+dataSource.getValue());
    }
}
