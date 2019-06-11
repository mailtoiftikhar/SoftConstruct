/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comppattern;

import java.util.Arrays;

/**
 *
 * @author IftikharKhan
 */
public class Leaf extends Component{
    
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        System.out.println("Cannot add to a leaf");
    }

    @Override
    public void remove(Component c) {
        System.out.println("Cannot remove from a leaf");
    }

    /**
     *
     * @param depth
     */
    @Override
    public void display(int depth) {
        char[] repeat = new char[depth];
        Arrays.fill(repeat, '-');
        System.out.println(new String(repeat) + name);
    }
}
