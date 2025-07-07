package eserciziojframe;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FormPrincipale extends JFrame {
    private JTextField nomeField;
    private JTextField cognomeField;

    // Campi specifici
    private JTextField campo1;
    private JTextField campo2;
    private JLabel label1;
    private JLabel label2;

    private JComboBox<String> tipoBox;

    public FormPrincipale() {
        setTitle("Form Persona");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(6, 2));

        // Tipo persona
        add(new JLabel("Tipo:"));
        tipoBox = new JComboBox<>(new String[]{"Studente", "Professore"});
        add(tipoBox);

        // Nome e cognome
        add(new JLabel("Nome:"));
        nomeField = new JTextField();
        add(nomeField);

        add(new JLabel("Cognome:"));
        cognomeField = new JTextField();
        add(cognomeField);

        // Etichette e campi dinamici
        label1 = new JLabel("Anno di nascita:");
        campo1 = new JTextField();
        label2 = new JLabel("Matricola:");
        campo2 = new JTextField();
        add(label1);
        add(campo1);
        add(label2);
        add(campo2);

        JButton okButton = new JButton("OK");
        add(okButton);

        tipoBox.addActionListener(e -> aggiornaCampi());

        okButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String cognome = cognomeField.getText();
            String tipo = (String) tipoBox.getSelectedItem();
            Persona persona = null;

            if (tipo.equals("Studente")) {
                try {
                    int anno = Integer.parseInt(campo1.getText());
                    String matricola = campo2.getText();
                    persona = new Studente(nome, cognome, anno, matricola);
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(this, "Anno di nascita non valido");
                    return;
                }
            } else {
                String dipartimento = campo1.getText();
                String cf = campo2.getText();
                persona = new Professore(nome, cognome, dipartimento, cf);
            }

            new PaginaOggetto(persona);
        });

        setVisible(true);
    }

    private void aggiornaCampi() {
        String tipo = (String) tipoBox.getSelectedItem();
        if (tipo.equals("Studente")) {
            label1.setText("Anno di nascita:");
            label2.setText("Matricola:");
        } else {
            label1.setText("Dipartimento:");
            label2.setText("Codice fiscale:");
        }
        campo1.setText("");
        campo2.setText("");
    }

    public static void main(String[] args) {
        new FormPrincipale();
    }
}

