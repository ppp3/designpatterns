package aufgabe;

public class PasswordTextBox extends UIControl{

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyEventHandlers();
    }

    public void clear()
    {
        password="";
    }

    private String password;
}
