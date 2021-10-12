public class Point {
    private int x, y; //4 + 4 bytes
    private PointType type; //4 byte
    private byte[] icon; // 20 KB -> Bei vielen wie zum Beispiel 1000 Punkten -> 20 MB

    public Point(int x, int y, PointType type, byte[] icon) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.icon = icon;
    }

    public void draw()
    {
        System.out.printf("%s at (%d, %d)", type,x,y);
    }
}
