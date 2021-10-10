public class AnchorNode implements HtmlNode{


    @Override
    public void execute(Operation op) {
        op.apply(this);

    }
}
