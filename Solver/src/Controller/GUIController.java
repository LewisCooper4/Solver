/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Lewis
 */
public interface GUIController<K> {
    
    public void createBoard();
    public void setBoard(K[][] board);
    public K[][] getBoard();
    
}
