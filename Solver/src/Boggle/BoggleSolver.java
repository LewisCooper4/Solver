/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Boggle;

import Controller.DataMap;
import Controller.GUIController;
import Controller.Solver;

/**
 *
 * @author Lewis
 */
public class BoggleSolver implements Solver {

    private DataMap map;
    private GUIController controller;

    public BoggleSolver(DataMap map, GUIController controller) {
        this.map = map;
        this.controller = controller;
    }
    
    @Override
    public void solve() {
        controller.createBoard();
        controller.setBoard(null);
    }

    @Override
    public void hint() {}

    
}
