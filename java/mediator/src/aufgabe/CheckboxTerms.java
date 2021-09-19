package aufgabe;

public class CheckboxTerms extends UIControl{
    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        isChecked = checked;
        notifyEventHandlers();
    }

    public void clear()
    {
        isChecked=false;
    }

    private boolean isChecked;


}
