/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comppattern;

/**
 *
 * @author IftikharKhan
 */
public class CompPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Composite root = new Composite("root");
            root.add(new Leaf("Leaf A"));
            root.add(new Leaf("Leaf B"));
        Composite comp = new Composite("Composite X");
            comp.add(new Leaf("Leaf XA"));
            comp.add(new Leaf("Leaf XB"));
        root.add(comp);
            root.add(new Leaf("Leaf C"));
        // Add and remove a leaf 
            Leaf leaf = new Leaf("Leaf D");
            root.add(leaf);
            root.remove(leaf);
        // Recursively display tree 
        root.display(1);
        // This change is in the version2
        root.display(2);
        // This is another version
        root.display(3);
    }
    
}
