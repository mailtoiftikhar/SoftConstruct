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
abstract public class Component {
    protected String name;
    // Constructor    
    public Component(String name){
        this.name = name;
    }

    public abstract void add(Component c);
    public abstract void remove(Component c);
    public abstract void display(int depth);
}
