package aufgabe;

public class FormatSegment implements Segment{

    @Override
    public void execute(Operation op) {
        op.apply(this);
    }
}
