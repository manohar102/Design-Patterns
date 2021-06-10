/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;

/**
 *
 * @author Manohar Krishna
 */
public class Waitress {
    MenuComponent allMenus;
    
    public Waitress(MenuComponent menuComponent){
        this.allMenus = menuComponent;
    }
    
    public void printMenu(){
        allMenus.print();
    }
}
