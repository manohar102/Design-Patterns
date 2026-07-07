
package compositepattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Manohar Krishna
 */
public class Menu extends MenuComponent {
    ArrayList menuComponents = new ArrayList();
    String name;
    String description;
    
    public Menu(String name,String description){
        this.name= name;
        this.descriptio

    public void add(MenuComp onent menuComponent ){
        menuCompo nents.add(menuComponent);
    }
    p

        menuComponents.remove(menuComponent); 
    }
    p

       return (MenuComponent)menuComponents.get(i); 
    }
    p

        return name; 
         
    p

        return description; 
    }
    p

        System.out.println("\n"+ge tName());
        System.out.println(", "+getDescription());
     

        Iterator iterat or = menuComponents.iterator();
        while(iterator.hasNext( ) ){
            MenuComponent menuC o mponent = (MenuComponent) iterator.next();
            menuComponent.print();
        }
    }      
}

