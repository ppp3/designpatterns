package aufgabe;

public class ReduceNoiseOperation implements Operation{
    @Override
    public void apply(FactSegment seg) {
        System.out.println("Reduce noise in fact segment");
    }

    @Override
    public void apply(FormatSegment seg) {
        System.out.println("Reduce noise in format segment");
    }
}
