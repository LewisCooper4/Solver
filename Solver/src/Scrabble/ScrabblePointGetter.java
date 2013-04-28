/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Scrabble;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author Lewis
 */
public class ScrabblePointGetter {
    
    private static final String letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static int[] points;
    private static Properties properties;
    private static FileInputStream stream;
    
    public static void createPointSystem(String fileName) {
        
        properties = new Properties();
        
        try {
            stream = new FileInputStream(fileName);
            properties.load(stream);
        } 
        catch (IOException ex) {
            System.out.println("Could not read from the file");
        }
        
        points = new int[26];
        
        for (int i = 0; i < 26; i++) {
            points[i] = Integer.parseInt(properties.getProperty("" + letters.charAt(i)));
        }
    
    }
    
    public static int points(String word) {
        
        int sum = 0;
        word = word.toUpperCase();
        
        for (int i = 0; i < word.length(); i++) {
            String let = word.substring(i, i+1);
            int index = letters.indexOf(let);
            sum += points[index];
        }
        
        return sum;
    }
    
}
