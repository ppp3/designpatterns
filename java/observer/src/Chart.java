public class Chart implements  IObserver {
    @Override
    public void update(int i) {
        System.out.println("Chart notified "+i);
    }
}
