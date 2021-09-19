public class Button extends UIControl{

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        notifyEventHandlers();
    }

    private boolean isEnabled;
}
