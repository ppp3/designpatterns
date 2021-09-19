package aufgabe;

public class UsernameTextBox extends UIControl{

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
        notifyEventHandlers();
    }

    public void clear()
    {
        username="";
    }
    private String username;


}
