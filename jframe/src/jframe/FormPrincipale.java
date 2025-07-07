package jframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormPrincipale extends JFrame {
    private JTextField nomeField;
    private JTextField cognomeField;

    public FormPrincipale() {
        setTitle("Form Utente");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(3, 2));

        // Componenti del form
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Cognome:"));
        cognomeField = new JTextField();
        add(cognomeField);

        JButton okButton = new JButton("OK");
        add(okButton);

        // Listener del bottone
        okButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nome = nomeField.getText();
                String cognome = cognomeField.getText();

                if (!nome.isEmpty() && !cognome.isEmpty()) {
                    Persona p = new Persona(nome, cognome);
                    new PaginaOggetto(p);
                } else {
                    JOptionPane.showMessageDialog(null, "Compila tutti i campi!");
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new FormPrincipale();
    }
}

