public class ListBox extends  UIControl{

    public String getSelection() {
        return selection;
    }

    public void setSelection(String selection) {
        this.selection = selection;
        notifyEventHandlers();
    }

    private String selection;

}
