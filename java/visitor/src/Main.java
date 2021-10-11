import aufgabe.AddReverbOperation;
import aufgabe.NormalizeOperation;
import aufgabe.ReduceNoiseOperation;
import aufgabe.WavFile;
import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        var document=new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighLightOperation());
        document.execute(new PlainTextOperation());

        var  wav= WavFile.read("tfdwsfsdf");
        wav.applyFilter(new NormalizeOperation());
        wav.applyFilter(new ReduceNoiseOperation());
        wav.applyFilter(new AddReverbOperation());

    }
}
