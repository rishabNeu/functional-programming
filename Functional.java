@FunctionalInterface
public interface Functional {
    public void m1();
    
    static  void v2(){
        System.out.println("hello from v2");
    }

    default void v3(){
        System.out.println("hello from v3");
    }
}
