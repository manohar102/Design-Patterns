
package compositepattern;

/**
 *
 * @author Manohar Krishna
 */
public class Waitress {
    MenuComponent allMenus;

    public Waitress(MenuComponent menuComponent) {
        this.allMenus = menuComponent;
    }

    public void printMenu() {
        allMenus.print();
    }
}
