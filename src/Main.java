import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        PasswordMain form = new PasswordMain();
        form.setContentPane(form.MainPanel);
        form.setTitle("Generating System");
        form.setSize(600,180);
        form.setResizable(false);
        form.setVisible(true);
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}