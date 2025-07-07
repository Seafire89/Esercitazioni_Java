package eserciziojframe;


import javax.swing.*;

public class PaginaOggetto extends JFrame {
    public PaginaOggetto(Persona persona) {
        setTitle("Dati Persona");
        setSize(350, 250);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JTextArea textArea = new JTextArea(persona.toString());
        textArea.setEditable(false);
        add(textArea);

        setVisible(true);
    }
}

