package 设计模式.单例模式;
// -饿汉式（线程安全，调用效率高；但是不能延时加载）
// -懒汉式（线程安全，调用效率不高，但是可以延时加载）
public class Singleton {
    //懒汉式单例模式，延迟加载
    private static Singleton instance =null;
    //私有的构造方法防止被外部实例
    private Singleton(){}

    //公有的静态调用方法创建实例对象,供外部类调用
    public static Singleton getInstance(){
        if (instance==null){
            instance=new Singleton();
        }
        System.out.println("懒汉式单例模式创建了");
        return instance;
    }


}
