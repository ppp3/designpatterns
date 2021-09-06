
public class ArticlesDialogBox {

	private ListBox articlesListBox=new ListBox();
	private TextBox titleTextBox= new TextBox();
	private Button saveButton = new Button ();
	
	
	ArticlesDialogBox()
	{
		articlesListBox.addEventHandler(this::articleSelected);
		articlesListBox.addEventHandler(this::titleChanged);
		
	}
	
	private void titleChanged()
	{
		var content= titleTextBox.getContent();
		var isEmpty=(content==null  || content.isEmpty()) ;
		saveButton.setEnabled(!isEmpty);
	}
	
	private void articleSelected()
	{
		titleTextBox.setContent(articlesListBox.getSelection());
		saveButton.setEnabled(true);
	}
	
	public void simulateUserInteraction()
	{
		articlesListBox.setSelection("Article 1");
		titleTextBox.setContent("");
		articlesListBox.setSelection("Article 2");
		System.out.println("TextBox: "+titleTextBox.getContent());
		System.out.println("Button: "+saveButton.isEnabled());
	}
	

}
