import aufgabe.BicyclingMode;
import aufgabe.DirectionService;

public class Main {

    public static void main(String[] args) {
        Canvas canvas=new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new BrushTool());
        canvas.mouseDown();
        canvas.mouseUp();
        canvas.setCurrentTool(new EraserTool());
        canvas.mouseDown();
        canvas.mouseUp();

        DirectionService service=new DirectionService();
        service.setMode(new BicyclingMode());
        System.out.println(service.getDirection());
        System.out.println(service.getEta());



    }

}
