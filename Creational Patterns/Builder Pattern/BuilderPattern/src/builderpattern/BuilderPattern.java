package builderpattern;
public class BuilderPattern {
    public static void main(String[] args) {
//        House n = new House(4,1,2,"small",true);
//        System.out.println(n);
          HouseBuilder hb = new HouseBuilder();
          hb.buildWalls(4).buildDoors(1).buildRoof("Small");
          System.out.println(hb.getProperties());
          
          HouseBuilder hb1 = new HouseBuilder();
          hb1.buildWalls(4).buildDoors(1);
          System.out.println(hb1.getProperties());
    }
}
