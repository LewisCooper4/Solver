/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian.solver;

import Boggle.BoggleController;
import Boggle.BoggleMap;
import Controller.DataMap;
import Controller.GUIController;
import Controller.Solver;
import Controller.SolverFactory;
import Scrabble.ScrabbleController;
import Scrabble.ScrabbleMap;
import Sudoku.SudokuController;
import Sudoku.SudokuMap;
import WordSearch.WordSearchController;
import WordSearch.WordSearchMap;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class FinalSolver extends javax.swing.JFrame {
    
    private JPanel board;
    private GUIController controller;
    private DataMap dataMap;

    /**
     * Creates new form FinalSolver
     */
    public FinalSolver() {
        initComponents();
    }
    
    private void createBoggle() {
        
        ArrayList<JTextField> list = new ArrayList<>();          
        
        board = new JPanel(new GridLayout(4, 4));
        board.setSize(BoardPanel.getWidth(), BoardPanel.getHeight());
        board.setBackground(Color.BLUE);
        
        for (int i = 0; i < 16; i++) {
            JTextField field = new JTextField("x");
            Font font1 = new Font("SansSerif", Font.BOLD, 32);
            field.setFont(font1);
            field.setHorizontalAlignment(JTextField.CENTER);
            list.add(field);
            board.add(field);
            
        }
        
        Instructions.setText("Boggle Instructions");
        
        dataMap = new BoggleMap(list);
        controller = new BoggleController(dataMap, textArea);
        BoardPanel.add(board);
        BoardPanel.setLayer(board, 0, 0);
    }
    private void createScrabble(int size) {

        ArrayList<JTextField> list = new ArrayList<>();

        board = new JPanel(new FlowLayout());
        board.setSize(BoardPanel.getWidth(), BoardPanel.getHeight());
        board.setBackground(Color.BLUE);

        char[] letters = {'e', 's', 't', 's', 'a', 'f', 'g', 'h', 'o', 'e', 't', 'p', 'a'};

        for (int i = 0; i < size; i++) {
            JTextField field = new JTextField("" + letters[i], 3);
            Font font1 = new Font("SansSerif", Font.BOLD, 24);
            field.setFont(font1);
            field.setHorizontalAlignment(JTextField.CENTER);
            list.add(field);
            board.add(field);

        }
        
        Instructions.setText("Scrabble Instructions");

        dataMap = new ScrabbleMap(list);
        controller = new ScrabbleController(dataMap, size, textArea);

        BoardPanel.add(board);
        BoardPanel.setLayer(board, 0, 0);
    }
    private void createSudoku() {
        
        ArrayList<JTextField> list = new ArrayList<>();
        
        int[] numbers = {0, 4, 3, 7, 0, 0, 9, 0, 8,
                         0, 0, 5, 0, 3, 0, 0, 0, 0,
                         0, 1, 0, 0, 0, 0, 3, 0, 0,
                         6, 0, 0, 0, 2, 7, 0, 0, 0, 
                         4, 0, 7, 0, 0, 0, 1, 0, 3, 
                         0, 0, 0, 5, 4, 0, 0, 0, 9,
                         0, 0, 2, 0, 0, 0, 0, 3, 0, 
                         0, 0, 0, 0, 5, 0, 4, 0, 0, 
                         5, 0, 4, 0, 0, 1, 2, 6, 0,};
    
        
        board = new JPanel(new GridLayout(9, 9));
        board.setSize(BoardPanel.getWidth(), BoardPanel.getHeight());
        board.setBackground(new Color(176, 255, 197));
        
        for (int i = 0; i < 81; i++) {

            NumberFormat format = NumberFormat.getInstance();
            format.setMaximumIntegerDigits(1);

            JTextField field = new JFormattedTextField(format);
            field.setText("" + numbers[i]);
            Font font1 = new Font("SansSerif", Font.BOLD, 16);
            field.setFont(font1);
            field.setHorizontalAlignment(JTextField.CENTER);
            list.add(field);
            board.add(field);
            
        }
        
        Instructions.setText("Sudoku Instructions");
        
        dataMap = new SudokuMap(list);
        controller = new SudokuController(dataMap);
        BoardPanel.add(board);
        BoardPanel.setLayer(board, 0, 0);
        
    }
    private void createWordSearch(int size) {
    
        ArrayList<JTextField> list = new ArrayList<>();
        //board = new JPanel(new FlowLayout());
        board = new JPanel(new GridLayout(size, size));
        board.setSize(BoardPanel.getWidth(), BoardPanel.getHeight());
        board.setBackground(Color.BLUE);  
        
//        char[] letters = {'h','x','x','x','x','x',
//                          'x','e','x','x','x','x',
//                          'x','x','l','x','x','x',
//                          'x','x','x','l','x','x',
//                          'x','x','x','x','o','x',
//                          'x','x','x','x','x','x'};
        
        for (int i = 0; i < size*size; i++) {
            JTextField field =  new JTextField("x", 2);
            Font font1 = new Font("SansSerif", Font.PLAIN, 26 - size);
            field.setFont(font1);
            field.setHorizontalAlignment(JTextField.CENTER);
            list.add(field);            
        }
        
        for (int i = 0; i < list.size(); i++) {
            board.add(list.get(i));
        }
        
        Instructions.setText("Word Search Instructions");
        
        dataMap = new WordSearchMap(list, size);
        controller = new WordSearchController(dataMap, size);
        BoardPanel.add(board);
        BoardPanel.setLayer(board, 0, 0);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextArea = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        Solve = new javax.swing.JButton();
        Games = new javax.swing.JComboBox();
        BoardPanel = new javax.swing.JLayeredPane();
        blank = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Instructions = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textArea.setColumns(20);
        textArea.setRows(5);
        TextArea.setViewportView(textArea);

        Solve.setText("Solve");
        Solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolveActionPerformed(evt);
            }
        });

        Games.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boggle", "Scrabble", "Sudoku", "Word Search" }));
        Games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GamesActionPerformed(evt);
            }
        });

        BoardPanel.setBackground(new java.awt.Color(0, 0, 0));

        blank.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout blankLayout = new javax.swing.GroupLayout(blank);
        blank.setLayout(blankLayout);
        blankLayout.setHorizontalGroup(
            blankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        blankLayout.setVerticalGroup(
            blankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 410, Short.MAX_VALUE)
        );

        blank.setBounds(0, 0, 400, 410);
        BoardPanel.add(blank, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Instructions.setEditable(false);
        Instructions.setColumns(20);
        Instructions.setRows(5);
        jScrollPane1.setViewportView(Instructions);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 395, Short.MAX_VALUE)
                    .addComponent(BoardPanel))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Solve)
                .addGap(166, 166, 166))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(BoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(Solve)
                .addGap(0, 27, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamesActionPerformed

        BoardPanel.setLayer(blank, 0, 0);
        String game = (String) Games.getSelectedItem();
        
        if ("Boggle".equals(game)) {
            createBoggle();
        }
        
        else if ("Scrabble".equals(game)) {
            String word = (String)JOptionPane.showInputDialog(null, "Please enter the amount of letters you have",
                    "Scrabble", JOptionPane.PLAIN_MESSAGE, null, null, "");
            int size = Integer.parseInt(word);
            createScrabble(size);
        }
        
        else if ("Sudoku".equals(game)) {
            createSudoku();
        }
        
        else if ("Word Search".equals(game)) {
            
            Object[] possibilities = {"6X6", "7X7", "8X8", "9X9", "10X10", "11X11", 
                                      "12X12", "13X13", "14X14","15X15", "16X16"};
            String s = (String)JOptionPane.showInputDialog(this, "Please select the size of the board",
                    "Word Search", JOptionPane.PLAIN_MESSAGE,null, possibilities, "6X6");            
            int end = s.indexOf("X");
            int size = Integer.parseInt(s.substring(0, end));
            createWordSearch(size);
        }

    }//GEN-LAST:event_GamesActionPerformed

    private void SolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolveActionPerformed
        
        textArea.setText("");
        String game = (String) (Games.getSelectedItem());
        Solver solver = SolverFactory.getSolver(game, controller);
        solver.solve();
        
    }//GEN-LAST:event_SolveActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FinalSolver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BoardPanel;
    private javax.swing.JComboBox Games;
    private javax.swing.JTextArea Instructions;
    private javax.swing.JButton Solve;
    private javax.swing.JScrollPane TextArea;
    private javax.swing.JPanel blank;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
