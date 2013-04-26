/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package WordSearch;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Lewis
 */
public class WordFinderFrame extends javax.swing.JFrame {

    private JPanel wordSearch;
    private WSBoard wsBoard;
    private WordSearchMap map;
    private WordSearchController controller;
    private WordSearchSolver solver;
    
    /**
     * Creates new form WordFinderFrame
     */
    public WordFinderFrame() {
        initComponents();
        
        createWordSearchBoard();
    }
    
    private void createWordSearchBoard() {
        ArrayList<JTextField> list = new ArrayList<>();
        wordSearch = new JPanel(new FlowLayout());
        wordSearch.setSize(270, 300);
        wordSearch.setBackground(Color.BLUE);  
        
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
            wordSearch.add(list.get(i));
        }
        
        map = new WordSearchMap(list, 6);
        controller = new WordSearchController(map, 6);
        //wsBoard = new WSBoard(list);
        Pane.add(wordSearch);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Solve = new javax.swing.JButton();
        TextArea = new javax.swing.JScrollPane();
        textArea = new javax.swing.JTextArea();
        Pane = new javax.swing.JLayeredPane();
        Word = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Solve.setText("Solve");
        Solve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SolveActionPerformed(evt);
            }
        });

        textArea.setColumns(20);
        textArea.setRows(5);
        TextArea.setViewportView(textArea);

        Pane.setBackground(new java.awt.Color(0, 0, 0));
        Pane.setOpaque(true);
        Word.setBounds(80, 240, 120, 30);
        Pane.add(Word, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(265, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Pane)
                            .addComponent(TextArea, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE))
                        .addGap(30, 30, 30))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(Solve)
                        .addGap(143, 143, 143))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Pane, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextArea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Solve)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SolveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SolveActionPerformed

//        OneWordLexicon lex = new OneWordLexicon(Word.getText());
//        WordFinder finder = new WordFinder(6, lex, wsBoard);
//        finder.search();   
        controller = new WordSearchController(map, 6);
        solver = new WordSearchSolver(map, controller);
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
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(WordFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WordFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WordFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WordFinderFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WordFinderFrame().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Pane;
    private javax.swing.JButton Solve;
    private javax.swing.JScrollPane TextArea;
    private javax.swing.JTextField Word;
    private javax.swing.JTextArea textArea;
    // End of variables declaration//GEN-END:variables
}
