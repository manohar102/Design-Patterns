
package bridgepattern;

/**
 *
 * @author Manohar Krishna
 */
public class NewRemote implements Remote {

    @Override
    public String on() {
        return "ON with New remote";
    }

    @Override
    public String off() {
        return "OFF with New remote";
    }
}
