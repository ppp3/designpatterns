package aufgabe;

import java.util.Set;

public class SetTextCommand implements  VideoCommand{
    private VideoEditor editor;
    private String text;

    public SetTextCommand(VideoEditor editor, String text)
    {
        this.editor=editor;
        this.text=text;
    }

    @Override
    public void execute() {
        editor.setText(text);
    }
}
