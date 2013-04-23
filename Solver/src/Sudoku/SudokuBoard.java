package Sudoku;

import java.awt.GridLayout;
import java.text.NumberFormat;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JPanel;

    public class  SudokuBoard {

    static JPanel panel;
    static JFormattedTextField field;

    public static JPanel createSudoku() {
        panel = new JPanel(new GridLayout(9, 9));

        for (int i = 0; i < 81; i++) {

            NumberFormat format = NumberFormat.getInstance();
            format.setMaximumIntegerDigits(1);

            field = new JFormattedTextField(format);
            panel.add(field);
        }
        return panel;
    }
}
