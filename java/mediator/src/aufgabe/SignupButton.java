package aufgabe;

public class SignupButton extends UIControl{

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
    }

    public void clear()
    {
        isEnabled=false;
    }

    private boolean isEnabled;
}
