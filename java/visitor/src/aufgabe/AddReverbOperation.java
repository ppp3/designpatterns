package aufgabe;

public class AddReverbOperation implements Operation {

    @Override
    public void apply(FactSegment seg) {
        System.out.println("Add reverb in fact segment");
    }

    @Override
    public void apply(FormatSegment seg) {
        System.out.println("Add reverb in format segment");
    }
}
