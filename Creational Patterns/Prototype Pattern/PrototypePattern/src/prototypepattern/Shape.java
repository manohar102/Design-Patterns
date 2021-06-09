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
public abstract class Shape implements Cloneable {
    
    private int id;
    protected String type;
    private String color;
    
    abstract void draw();
    
    public int getId(){
        return id;
    }
    public String getType(){
        return type;
    }
    public String getColor(){
        return color;
    }
    
    public Shape setId(int id){
        this.id = id;
        return this;
    }
    public Shape setType(String type){
        this.type = type;
        return this;
    }
    public Shape setColor(String color){
        this.color = color;
        return this;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException{
        return super.clone();
    }
       
}
