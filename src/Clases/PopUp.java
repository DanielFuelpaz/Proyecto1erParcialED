package Clases;

import javax.swing.JOptionPane;

public class PopUp {

    public int preguntar(String s, String t) {
        return JOptionPane.showOptionDialog(null, s,
                t,
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                new Object[]{"Sí", "No"},
                "Sí");
    }

    public String ingreso(String s, String t) {
        return JOptionPane.showInputDialog(null, s, t);
    }

    public void mostrar(String s) {
        JOptionPane.showMessageDialog(null, s);
    }

    public void mostrar(Exception e) {
        JOptionPane.showMessageDialog(null, e);
    }

    public void error(String s) {
        JOptionPane.showMessageDialog(null, s, "ERROR", JOptionPane.ERROR_MESSAGE);
    }

}
