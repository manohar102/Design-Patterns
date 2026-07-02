package singletondesign;

/**
 *
 * @author Manohar Krishna
 */
enum EnumIndex {
    INSTANCE;

    int i;

    public void show() {
        System.out.println(i);
    }

}
