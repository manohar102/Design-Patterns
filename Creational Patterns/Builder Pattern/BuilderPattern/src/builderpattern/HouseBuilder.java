/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpattern;

/**
 *
 * @author Manohar Krishna
 */
public class HouseBuilder {
    private int no_of_walls;
    private int no_of_doors;
    private int no_of_windows;
    private String type_of_roof;
    private boolean need_garage;
    
    public HouseBuilder buildWalls(int walls){
        this.no_of_walls = walls;
        return this;
    }
    
    public HouseBuilder buildDoors(int doors){
        this.no_of_doors = doors;
        return this;
    }
    
    public HouseBuilder buildWindows(int windows){
        this.no_of_windows = windows;
        return this;
    }
    
    public HouseBuilder buildRoof(String type){
        this.type_of_roof = type;
        return this;
    }
    
    public HouseBuilder buildGarage(boolean garage){
        this.need_garage = garage;
        return this;
    }
    public House getProperties(){
        return new House(no_of_walls,no_of_doors,no_of_windows,type_of_roof,need_garage);
    }
}
