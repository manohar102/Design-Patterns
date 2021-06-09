/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletondesign;
public class Index{
    static Index obj;
    private int id;
    
    private Index(){    }
    
    public static Index getInstance(){
        if(obj==null){ 
            obj = new Index();
        }
        return obj;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    @Override
    public String toString(){
        return "[Id : " + id + ']';
    }
}
