public class SpreadSheet implements  IObserver{
    @Override
    public void update(int i) {
        System.out.println("SpreadSheet notified: "+i);
    }
}
