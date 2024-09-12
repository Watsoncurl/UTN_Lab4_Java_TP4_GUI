package views;

import javax.swing.JFrame;

public class MenuView extends JFrame {
    public MenuView() {
        this.setTitle("Menu");
        this.setSize(600, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
    }

    public void ShowMenu(boolean state)
    {
        this.setVisible(state);
    }

}