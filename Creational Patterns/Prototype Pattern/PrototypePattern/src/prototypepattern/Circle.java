/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;

/**
 *
 * @author Manohar Krishna
 */
public class Circle extends Shape{
    
    @Override
    public void draw(){
        System.out.println("Drawing Circle");
    }
    @Override
    public String toString() {
        return "Circle {" + "Id : "+ this.getId()+ ", Color:"+ this.getColor()+ '}';
    }
}
