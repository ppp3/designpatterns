package aufgabe;

public class SignUpDialogBox {


    private UsernameTextBox username= new UsernameTextBox();
    private PasswordTextBox password= new PasswordTextBox();
    private CheckboxTerms terms=new CheckboxTerms();
    private SignupButton button=new SignupButton();


    public SignUpDialogBox() {
        username.addEventHandler(this::allDataEntered);
        password.addEventHandler(this::allDataEntered);
        terms.addEventHandler(this::allDataEntered);
    }

    private void allDataEntered()
    {
        if ((password.getPassword()!="") &&(terms.isChecked()) &&(username.getUsername()!="") )
        {
            button.setEnabled(true);
        }
        else
        {
            button.setEnabled(false);
        }
    }

    public void clear()
    {
        username.clear();
        password.clear();
        button.clear();
        terms.clear();
    }

    public void statusCheck()
    {
        System.out.println("Username: "+username.getUsername());
        System.out.println("Password: "+password.getPassword());
        System.out.println("Terms: "+terms.isChecked());
        System.out.println("Button: "+button.isEnabled());


    }
    public void simulate()
    {
        username.setUsername("dsfsdfs");
        statusCheck();
        password.setPassword("dsfsdfd");
        statusCheck();
        terms.setChecked(true);
        statusCheck();

    }


}
