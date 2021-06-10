/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compositepattern;
public class CompositePattern {
    public static void main(String[] args) {
        // TODO code application logic here
        MenuComponent panCakeHouseMenu = new Menu("PANCAKE HOUSE MENU","Breakfast");
        MenuComponent dinnerMenu = new Menu("DINNER MENU","Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU","Dinner");        
        MenuComponent dessertMenu = new Menu("DESSERT MENU","Dessert of course!");
        
        MenuComponent allMenus = new Menu("ALL MENUS","All Menus Combined");
        
        allMenus.add(panCakeHouseMenu);
        allMenus.add(dinnerMenu);
        allMenus.add(cafeMenu);
        
        // add all items here
        panCakeHouseMenu.add(new MenuItem("K&B’s Pancake Breakfast", "Pancakes with scrambled eggs, and toast",true,2.99));
        panCakeHouseMenu.add(new MenuItem("Regular Pancake Breakfast", " Regular Pancake Breakfast",false,2.99));
        
        dinnerMenu.add(new MenuItem("Pasta","Spaghetti with Marinara Sauce, and a slice of sourdough bread" ,true, 3.89));
        dinnerMenu.add(dessertMenu);
        dinnerMenu.add(new MenuItem("Apple Pie","“Apple pie with a flakey crust, topped with vanilla icecream" ,true, 1.59));
        
        cafeMenu.add(new MenuItem("Regular Pancake Breakfast","Veggie burger on a whole wheat bun, lettuce, tomato, and fries",true,3.99));
        cafeMenu.add(new MenuItem("Soup of the day","A cup of the soup of the day, with a side salad",false,3.69));
        Waitress waitress = new Waitress(allMenus);
        waitress.printMenu();
    }
    
}
