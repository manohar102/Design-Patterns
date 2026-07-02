
package bridgepattern;

/**
 *
 * @author Manohar Krishna
 */
public class RealMe extends TV {
    Remote remote;

    RealMe(Remote remote) {
        super(remote);
        this.remote = remote;
    }

    @Override
    void on() {
        System.out.println("RealMe TV ON: " + remote.on());
    }

    @Override
    void off() {
        System.out.println("RealMe TV OFF :" + remote.off());
    }
}
