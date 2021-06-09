package builderpattern;
public class House {
    private int no_of_walls;
    private int no_of_doors;
    private int no_of_windows;
    private String type_of_roof;
    private boolean need_garage;
    
    public House(int walls, int doors, int windows, String roofType, boolean garage){
        this.no_of_walls = walls;
        this.no_of_doors = doors;
        this.no_of_windows = windows;
        this.type_of_roof = roofType;
        this.need_garage = garage;
    }
    @Override
    public String toString(){
        return "House No.of [\n Walls = "+ no_of_walls+ "\n Doors = "+ no_of_doors 
                +"\n Windows = "+no_of_windows + "\n Roof = " + type_of_roof
                +"\n Garage = "+ need_garage +"]";
    }
}
