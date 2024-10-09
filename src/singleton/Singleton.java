package singleton;

//Thread Safe High Performance Singleton
public class Singleton {
//  instance may be updated in memory by compiler while referencing a partially constructed object
//  another thread can access and use the partially created object leading to anomaly
//  volatile ensures the instance is successfully created before being accessed again
    private static volatile Singleton instance;
    private final String data;

//  private constructor
    private Singleton(String data){
        this.data = data;
    }

    public Singleton getInstance(String data){
//      caching instance to avoid multiple memory reads of volatile member
        Singleton cache = instance; /* instance read from memory */
//      check if instance exists, limiting need of synchronization
        if(cache == null){
//          one thread obtains lock to ensure synchronized access to Object creation
            synchronized (Singleton.class /* gets and locks class as object of type Singleton */) {
                cache = instance; /* instance read from memory */
//              check if any other thread created the instance after first check
                if(cache == null)
                    instance = cache = new Singleton(data);
            }
        }
        return cache; /* avoided another memory read here */
    }

    public String getData(){
        return this.data;
    }
}
