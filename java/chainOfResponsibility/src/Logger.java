public class Logger extends Handler{


    public Logger(Handler next) {
        super(next);
    }

    @Override
    public boolean dohandle(HttpRequest request) {
        System.out.println("Log");
        return false;
    }

}
