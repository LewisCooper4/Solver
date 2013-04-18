/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Lewis
 */
public interface DataMap<K> {
    
    public K getData(int i, int j);
    public void setData(int i, int j, K data);
    
}
