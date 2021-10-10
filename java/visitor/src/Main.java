import org.w3c.dom.Node;

public class Main {

    public static void main(String[] args) {
        var document=new HtmlDocument();
        document.add(new HeadingNode());
        document.add(new AnchorNode());
        document.execute(new HighLightOperation());
        document.execute(new PlainTextOperation());

    }
}
