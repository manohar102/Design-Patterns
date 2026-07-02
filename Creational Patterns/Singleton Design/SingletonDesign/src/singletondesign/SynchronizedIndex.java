package singletondesign;

/**
 *
 * @author Manohar Krishna
 */
public class SynchronizedIndex {
    static SynchronizedIndex obj;
    private int id;

    private SynchronizedIndex() {
        System.out.println("SynchronizedIndex Instance Created...!");
    }

    public static SynchronizedIndex getInstance() {
        // Adding synchronized in the method will delay the execution 100 times than
        // usual
        // So, we use double locking with Static synchronized block

        if (obj == null) {
            synchronized (SynchronizedIndex.class) {
                if (obj == null)
                    obj = new SynchronizedIndex();
            }
        }
        return obj;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "[Id : " + id + ']';
    }
}
