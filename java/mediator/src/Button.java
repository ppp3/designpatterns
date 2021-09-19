public class Button extends UIControl{
    public Button(DialogBox owner) {
        super(owner);

    }

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        owner.changed(this);
    }

    private boolean isEnabled;
}
