public class TextBox extends UIControl{

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
        notifyEventHandlers();
    }

    private String content;

}
