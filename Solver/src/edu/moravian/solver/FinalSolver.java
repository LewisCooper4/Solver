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
import Sudoku.SudokuController;
import Sudoku.SudokuMap;
import WordSearch.WordSearchController;
import WordSearch.WordSearchMap;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JFormattedTextField;
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
        
        //createBoggle();
        
    }
    
    private void createBoggle() {
        ArrayList<JTextField> list = new ArrayList<>();
          
        
        board = new JPanel(new GridLayout(4, 4));
        board.setSize(310, 310);
        board.setBackground(Color.BLUE);
        
        for (int i = 0; i < 16; i++) {
            JTextField field = new JTextField("x");
            list.add(field);
            board.add(field);
            
        }
        
//        board = new JPanel(new FlowLayout());
//        board.setSize(175, 150);
//        board.setBackground(Color.BLUE);
        
//        for (int i = 0; i < 16; i++) {
//            JTextField field =  new JTextField("x", 2);
//            list.add(field);
//            
//        }
//        
//        for (int i = 0; i < list.size(); i++) {
//            board.add(list.get(i));
//        }
        
        dataMap = new BoggleMap(list);
        controller = new BoggleController(dataMap, textArea);
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
        board.setSize(320, 320);
        board.setBackground(Color.RED);
        
        for (int i = 0; i < 81; i++) {

            NumberFormat format = NumberFormat.getInstance();
            format.setMaximumIntegerDigits(1);

            JTextField field = new JFormattedTextField(format);
            field.setText("" + numbers[i]);
            list.add(field);
            board.add(field);
            
        }
        
//       board = new JPanel(new FlowLayout());
//       board.setSize(265, 300);
//       board.setBackground(Color.RED); 
        
//       for (int i = 0; i < 81; i++) {
//            JTextField field =  new JTextField("" + numbers[i], 1);            
//            list.add(field);            
//        }
//        
//        for (int i = 0; i < list.size(); i++) {
//            board.add(list.get(i));
//        }//        for (int i = 0; i < 81; i++) {
//            JTextField field =  new JTextField("" + numbers[i], 1);            
//            list.add(field);            
//        }
//        
//        for (int i = 0; i < list.size(); i++) {
//            board.add(list.get(i));
//        }
        
        dataMap = new SudokuMap(list);
        controller = new SudokuController(dataMap);
        BoardPanel.add(board);
        BoardPanel.setLayer(board, 0, 0);
        
    }
    private void createWordSearch(int size, String word) {
    
        ArrayList<JTextField> list = new ArrayList<>();
        board = new JPanel(new FlowLayout());
        board.setSize(270, 300);
        board.setBackground(Color.BLUE);  
        
        char[] letters = {'h','x','x','x','x','x',
                          'x','e','x','x','x','x',
                          'x','x','l','x','x','x',
                          'x','x','x','l','x','x',
                          'x','x','x','x','o','x',
                          'x','x','x','x','x','x'};
        
        for (int i = 0; i < 36; i++) {
            JTextField field =  new JTextField("" + letters[i], 2);
            list.add(field);
            
        }
        
        for (int i = 0; i < list.size(); i++) {
            board.add(list.get(i));
        }
        
        dataMap = new WordSearchMap(list, 6);
        controller = new WordSearchController(dataMap, size, word);
        //wsBoard = new WSBoard(list);
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

        Games.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boggle", "Sudoku", "Word Search" }));
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
            .addGap(0, 320, Short.MAX_VALUE)
        );
        blankLayout.setVerticalGroup(
            blankLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 320, Short.MAX_VALUE)
        );

        blank.setBounds(0, 0, 320, 320);
        BoardPanel.add(blank, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 318, Short.MAX_VALUE)
                    .addComponent(BoardPanel))
                .addGap(87, 87, 87))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Solve)
                .addGap(242, 242, 242))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(BoardPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Solve))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamesActionPerformed

        BoardPanel.setLayer(blank, 0, 0);
        String game = (String) Games.getSelectedItem();
        
        if ("Boggle".equals(game)) {
            createBoggle();
        }
        else if ("Sudoku".equals(game)) {
            createSudoku();
        }
        else if ("Word Search".equals(game)) {
            //DIALOG BOX
            int size = 6;
            createWordSearch(size, "hello");
        }

    }//GEN-LAST:event_GamesActionPerformed

    private void SolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolveActionPerformed
        
        String game = (String) (Games.getSelectedItem());
        Solver solver = SolverFactory.getSolver(game, dataMap, controller);
        solver.solve();
        textArea.append("Solved!!!!!!!!");
        
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FinalSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalSolver.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalSolver().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane BoardPanel;
    private javax.swing.JComboBox Games;
    private javax.swing.JButton Solve;
    private javax.swing.JScrollPane TextArea;
    private javax.swing.JPanel blank;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
