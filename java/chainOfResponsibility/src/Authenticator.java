public class Authenticator extends Handler {


    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean dohandle(HttpRequest request) {
        var isValid=(request.getUsername()=="admin")&&
                (request.getPassword()=="1234");
        System.out.println("Authentication");
        return !isValid;
    }
}
