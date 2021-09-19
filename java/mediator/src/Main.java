import aufgabe.SignUpDialogBox;

public class Main {

    public static void main(String[] args) {
        ArticleDialogBox dialog=new ArticleDialogBox();
        dialog.simulateUserInteraction();
        System.out.println("Aufgabe: ");
        SignUpDialogBox s=new SignUpDialogBox();
        s.simulate();

    }
}
