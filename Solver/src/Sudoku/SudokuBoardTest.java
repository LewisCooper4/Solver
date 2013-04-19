/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sudoku;

import Boggle.BoggleController;
import Boggle.BoggleMap;
import Controller.DataMap;
import Controller.GUIController;
import Controller.Solver;
import Controller.SolverFactory;
import edu.moravian.solver.*;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class SudokuBoardTest extends javax.swing.JFrame {

    private JPanel sudoku;
    private JPanel boggle;
    
    private Map<String, DataMap> dataMaps;
    private Map<String, GUIController> controllers;
    private Map<String, Solver> solvers;
    
    private SudokuMap sudokuMap;
    private SudokuController sudokuController;
    private BoggleMap boggleMap;
    private BoggleController boggleController;
    
    /**
     * Creates new form BoardTest
     */
    public SudokuBoardTest() {
        initComponents();
        
        dataMaps = new HashMap<>();
        controllers = new HashMap<>();
        solvers = new HashMap<>();
        
        createSolverMap();
        
        createSudoku();
        createBoggle();
        
    }
    
    private void createSolverMap() {
        solvers.put("Sudoku", new SudokuSolver(null, null));
    }
    
    private void createSudoku() {
        
        ArrayList<JTextField> list = new ArrayList<>();
        sudoku = new JPanel(new FlowLayout());
        sudoku.setSize(265, 300);
        sudoku.setBackground(Color.RED); 
        
        int[] numbers = {0, 4, 3, 7, 0, 0, 9, 0, 8,
                         0, 0, 5, 0, 3, 0, 0, 0, 0,
                         0, 1, 0, 0, 0, 0, 3, 0, 0,
                         6, 0, 0, 0, 2, 7, 0, 0, 0, 
                         4, 0, 7, 0, 0, 0, 1, 0, 3, 
                         0, 0, 0, 5, 4, 0, 0, 0, 9,
                         0, 0, 2, 0, 0, 0, 0, 3, 0, 
                         0, 0, 0, 0, 5, 0, 4, 0, 0, 
                         5, 0, 4, 0, 0, 1, 2, 6, 0,};
                
        
        for (int i = 0; i < 81; i++) {
            JTextField field =  new JTextField("" + numbers[i], 1);            
            list.add(field);            
        }
        
        for (int i = 0; i < list.size(); i++) {
            sudoku.add(list.get(i));
        }
        
        sudokuMap = new SudokuMap(list);
        dataMaps.put("Sudoku", sudokuMap);
        sudokuController = new SudokuController(sudokuMap);
        controllers.put("Sudoku", sudokuController);
        Pane.add(sudoku);
    }
    
    private void createBoggle() {
        ArrayList<JTextField> list = new ArrayList<>();
        boggle = new JPanel(new FlowLayout());
        boggle.setSize(175, 150);
        boggle.setBackground(Color.BLUE);  
        
        for (int i = 0; i < 16; i++) {
            JTextField field =  new JTextField("x", 2);
            list.add(field);
            
        }
        
        for (int i = 0; i < list.size(); i++) {
            boggle.add(list.get(i));
        }
        
        boggleMap = new BoggleMap(list);
        dataMaps.put("Boggle", boggleMap);
        boggleController = new BoggleController(boggleMap, Words);
        controllers.put("Boggle", boggleController);
        Pane.add(boggle);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Pane = new javax.swing.JLayeredPane();
        Games = new javax.swing.JComboBox();
        Solve = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Words = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pane.setBackground(new java.awt.Color(0, 0, 0));
        Pane.setOpaque(true);

        Games.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boggle", "Sudoku" }));
        Games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GamesActionPerformed(evt);
            }
        });

        Solve.setText("Solve");
        Solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolveActionPerformed(evt);
            }
        });

        Words.setColumns(20);
        Words.setRows(5);
        jScrollPane1.setViewportView(Words);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Solve)
                .addGap(283, 283, 283))
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(166, 166, 166)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                .addContainerGap(180, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Solve)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamesActionPerformed
        
        Words.setText("");
        
        String game = (String) Games.getSelectedItem();
        
        if ("Boggle".equals(game)) {
            Pane.setLayer(boggle, 0, 0);
        }
        if ("Sudoku".equals(game)) {            
            Pane.setLayer(sudoku, 0, 0);
        }
    }//GEN-LAST:event_GamesActionPerformed

    private void SolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolveActionPerformed
//            sudokuController.createBoard();
//            Solver solver = new Solver();
//            solver.solve(0, 0, sudokuController.getBoard());
//            sudokuController.setBoard(solver.getBoard());
//            boggleController.createBoard();
//            boggleController.setBoard(null);
            
            String game = (String) (Games.getSelectedItem());
            DataMap dataMap = dataMaps.get(game);
            GUIController controller = controllers.get(game);
            Solver solver = SolverFactory.getSolver(game, dataMap, controller);
            solver.solve();
            Words.append("Solved!!!!!!!!");
            
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
            java.util.logging.Logger.getLogger(BoardTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BoardTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BoardTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BoardTest.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SudokuBoardTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Games;
    private javax.swing.JLayeredPane Pane;
    private javax.swing.JButton Solve;
    private javax.swing.JTextArea Words;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}