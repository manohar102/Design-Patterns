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
public class MenuItem extends MenuComponent {
    String name;
    String description;
    double price;
    boolean vegetarian;
    MenuItem(String name,String description,boolean vegetarian,double price){
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegetarian = vegetarian;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public double getPrice(){
        return price;
    }
    public boolean isVegetarian(){
        return vegetarian;
    }
    public void print(){
        System.out.println(name);
        if(vegetarian){
            System.out.println("(V)");
        }
        System.out.println(", "+getPrice());
        System.out.println("       --"+getDescription());
    }
}
