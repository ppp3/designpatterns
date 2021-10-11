package aufgabe;

public class FactSegment implements Segment{

    @Override
    public void execute(Operation op) {
            op.apply(this);
        }

}
