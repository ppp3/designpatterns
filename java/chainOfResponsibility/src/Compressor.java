public class Compressor extends Handler{


    public Compressor(Handler next) {
        super(next);
    }

    @Override
    public boolean dohandle(HttpRequest request) {
        compress(request);
        return false;
    }


    public void compress(HttpRequest request)
    {
        System.out.println("Compress");
    }
}
