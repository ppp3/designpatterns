public class ArticleDialogBox extends DialogBox{

    private ListBox articlesListBox=new ListBox(this);
    private TextBox titleTextBox=new TextBox(this);
    private Button saveButton=new Button(this);

    @Override
    public void changed(UIControl control) {
        if (control==articlesListBox)
        {
            articleSelected();
        }
        else if (control==titleTextBox)
        {
            titleChanged();
        }
    }

    public void simulateUserInteraction()
    {
        articlesListBox.setSelection("Article 1");
        titleTextBox.setContent("");
        titleTextBox.setContent("Article 2");
        System.out.println("TextBox: "+titleTextBox.getContent());
        System.out.println("TextBox: "+saveButton.isEnabled());
    }

    private void articleSelected()
    {
        titleTextBox.setContent(articlesListBox.getSelection());
        saveButton.setEnabled(true);
    }

    private void titleChanged()
    {
        String content=titleTextBox.getContent();
        boolean isEmpty=(content==null || content.isEmpty());
        saveButton.setEnabled(!isEmpty);
    }
}
