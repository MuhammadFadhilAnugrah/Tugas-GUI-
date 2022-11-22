package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormBiodata {
    private JTextField textNama;
    private JTextField textNokupon;
    private JButton buttonSave;
    private JPanel rootpanel;
    private JLabel labelHasil;

    public FormBiodata() {
        buttonSave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //mengambil data dari textnama
               String nama = textNama.getText();
               //mengambil data dari text
                String kupon = textNokupon.getText();
                //proses
                Peserta peserta = new Peserta();
                peserta .setNama(nama);
                peserta.setKupon(kupon);
                //tapil output ke layar
                labelHasil.setText(peserta.toString());
            }
        });
    }

    public JPanel getRootpanel() {
        return rootpanel;
    }
}
