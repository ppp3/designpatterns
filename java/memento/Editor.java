import java.util.*;

public class Editor
{
    private Stack<String> history;

    Editor()
    {
        history=new Stack<String>();
    }

    public String getContent() {
            return content;
        }

        public void setContent(String content) {
            this.content = content;
            history.push(content);
        }


        public EditorState createState()
        {
            return new EditorState(content);
        }

        public void restore(EditorState state)
        {
            content=state.getContent();
        }

        private String content;


}

