/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototypepattern;
import java.util.Hashtable;

public class ShapeCache{
    
    private static Hashtable<Integer,Shape> shapeMap = new Hashtable<Integer,Shape>();
    
    public static Shape getShape(int shapeId) throws CloneNotSupportedException{
        Shape parentShape = shapeMap.get(shapeId);
        Shape clonedShape = (Shape)parentShape.clone();
        return loadShape(clonedShape);
    }
    public static Shape loadShape(Shape obj){
        obj.setId(shapeMap.size()+1);
        shapeMap.put(obj.getId(), obj);
        return obj;
    }
    public static void loadShapes(){
        Shape rec = new Rectangle();
        rec.setId(1).setColor("Red");
        
        Shape cir = new Circle();
        cir.setId(2).setColor("Blue");
        
        shapeMap.put(rec.getId(),rec);
        shapeMap.put(cir.getId(),cir);
       
    }
        
    
}
