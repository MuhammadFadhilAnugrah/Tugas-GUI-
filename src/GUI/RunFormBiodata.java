package GUI;

import javax.swing.*;

public class RunFormBiodata {
    public static void main(String[] args) {
        JFrame Jframe =new JFrame("title:FormBiodata");
        Jframe.setContentPane(new FormBiodata().getRootpanel());
        Jframe.setDefaultCloseOperation(Jframe.EXIT_ON_CLOSE);
        Jframe.setLocationRelativeTo(null);
        Jframe.setSize(500,400);
        Jframe.setVisible(true);
    }
}
