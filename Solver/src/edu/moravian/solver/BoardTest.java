/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.moravian.solver;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class BoardTest extends javax.swing.JFrame {

    private JPanel sudoku;
    private JPanel boggle;
    
    /**
     * Creates new form BoardTest
     */
    public BoardTest() {
        initComponents();
        
        createSudoku();
        //createBoggle();
    }
    
    private void createSudoku() {
        
        ArrayList<JTextField> list = new ArrayList<>();
        sudoku = new JPanel(new FlowLayout());
        sudoku.setSize(265, 300);
        sudoku.setBackground(Color.RED);  
        
        for (int i = 0; i < 81; i++) {
            JTextField field =  new JTextField("0", 1);
            
            list.add(field);
            
        }
        
        for (int i = 0; i < list.size(); i++) {
            sudoku.add(list.get(i));
        }
        
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Pane.setBackground(new java.awt.Color(0, 0, 0));
        Pane.setOpaque(true);

        Games.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Boggle", "Sudoku" }));
        Games.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GamesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                .addComponent(Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(Games, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(102, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void GamesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GamesActionPerformed
        
        String game = (String) Games.getSelectedItem();
        
//        if ("Boggle".equals(game)) {
//            Pane.setLayer(boggle, 0, 0);
//        }
        if ("Sudoku".equals(game)) {
            Pane.setLayer(sudoku, 0, 0);
        }
    }//GEN-LAST:event_GamesActionPerformed

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
                new BoardTest().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox Games;
    private javax.swing.JLayeredPane Pane;
    // End of variables declaration//GEN-END:variables
}
