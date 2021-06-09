package singletondesign;
public class SingletonDesign {  
    public static void main(String[] args) {
        Index obj = Index.getInstance();
        obj.setId(101);
        System.out.println(obj);
        Index obj2 = Index.getInstance();
        System.out.println(obj2);
        
        Thread t1 = new Thread(new Runnable(){
            public void run(){
                SynchronizedIndex si = SynchronizedIndex.getInstance();
                si.setId(102);
                System.out.println(si);
            }
        });
        Thread t2= new Thread(new Runnable(){
            public void run(){
                SynchronizedIndex si = SynchronizedIndex.getInstance();
                System.out.println(si);
            }
        });
        t1.start();
        t2.start();
        
        EnumIndex ei = EnumIndex.INSTANCE;
        ei.i = 200;
        System.out.println(ei.i);
        
        EnumIndex ei2 = EnumIndex.INSTANCE;
        System.out.println(ei.i);
        
    }
}
