
package bridgepattern;

/**
 *
 * @author Manohar Krishna
 */
public class OldRemote implements Remote {

    @Override
    public String on() {
        return "ON with Old remote";
    }

    @Override
    public String off() {
        return "OFF with Old remote";
    }

}
