public abstract class Handler {
    public Handler(Handler next) {
        this.next = next;
    }

    public boolean isHandlerNull()
    {
        if (next==null)
        {
            return true;
        }
        return false;
    }

    private Handler next;

    public void handle(HttpRequest request)
    {
       if ( dohandle(request)) {

           return;
       }

       if (next!=null) {
           next.handle(request);
       }

    }

    public abstract boolean dohandle(HttpRequest request);

}
