import java.util.ArrayList;
import java.util.List;

public class PointService {
    public List<Point> getPoints()
    {
        List<Point> points=new ArrayList<>();
        points.add(new Point(1,2,PointType.CAFE,null));
        return points;
    }
}


