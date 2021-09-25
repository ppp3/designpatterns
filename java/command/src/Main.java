import fx.BlackAndWhiteCommand;
import fx.BlackAndWhiteCommand;
import fx.Button;
import fx.CompositeCommand;
import fx.ResizeCommand;
import fx.editor.BoldCommand;
import fx.editor.History;
import fx.editor.HtmlDocument;
import fx.editor.UndoCommand;

import javax.swing.text.html.HTMLDocument;

public class Main {

    public static void main(String[] args) {
        var service=new CustomerService();
        var command =new AddCustomerCommand(service);
        var button=new Button(command);
        button.click();

        ////Composite
        var composite=new CompositeCommand();
        composite.add(new ResizeCommand());
        composite.add(new BlackAndWhiteCommand());
        composite.execute();

        //
        var history=new History();
        var document=new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand=new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        var undoCommand=new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());


    }
}
