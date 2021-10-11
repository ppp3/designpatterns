package aufgabe;

public class NormalizeOperation implements Operation{

    @Override
    public void apply(FactSegment seg) {
        System.out.println("Normalize noise in fact segment");
    }

    @Override
    public void apply(FormatSegment seg) {
        System.out.println("Normalize noise in format segment");
    }
}
