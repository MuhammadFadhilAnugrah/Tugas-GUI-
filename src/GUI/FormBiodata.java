package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNokupon;
    private JButton buttonSave;
    private JPanel rootpanel;
    private JLabel labelHasil;

    public void insertingDatatofile(String inputtedData){
        try {
            FileWriter fr=new FileWriter("data.txt",true);
            fr.write(inputtedData);
            fr.close();
        }catch (IOException ioe){
            System.out.println("IOExceptio: " + ioe.getMessage());
        }
    }

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            //mengambil data dari textnama
            String nama = textNama.getText();
            //mengambil data dari text
            String kupon = textNokupon.getText();
            String result1 = "Nama : " + nama;
            String result2 = "no kupon" + kupon;

            String resultgabungan = result1 +"\n" + result2+"\n\n";
            insertingDatatofile(resultgabungan);
            }
        });
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}
