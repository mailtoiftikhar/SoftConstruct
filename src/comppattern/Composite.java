/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comppattern;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author IftikharKhan
 */
public class Composite extends Component {
    
    private final ArrayList<Component> children = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void add(Component c) {
        children.add(c);
    }
    @Override
    public void remove(Component c) {
        children.remove(c);
    }

    @Override
    public void display(int depth) {
        char[] repeat = new char[depth];
        Arrays.fill(repeat, '-');
        System.out.println(new String(repeat) + name);

        for(Component c : children){
            c.display(depth+2);
        }
}

    
}
