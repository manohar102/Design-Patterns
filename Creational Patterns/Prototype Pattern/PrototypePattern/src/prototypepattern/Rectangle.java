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
public class Rectangle extends Shape {    
    Rectangle(){
        type = "Rectangle";
    }
    
    @Override
    public void draw(){
        System.out.println("Drawing Rectangle");
    }    

    @Override
    public String toString() {
        return "Rectangle {" + "Id : "+ this.getId()+ ", Color:"+ this.getColor()+ '}';
    }
    
    
}

