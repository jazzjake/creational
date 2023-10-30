package com.pluralsight.singleton;

public class DbSingleton {
    // this eagerly loads the instance
    //private static DbSingleton instance = new DbSingleton();
    // to lazily load set to null
    //private static DbSingleton instance = null;
    // use volatile to make it thread safe
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        //make sure nobody uses reflection
        if(instance!=null){
            throw new RuntimeException("Use getInstance() to create");
        }
    }

    //customary for singletons to have getInstance method
    // could synchronize whole method but that is a performance hit
    public static DbSingleton getInstance() {
        if(instance==null) {
            synchronized (DbSingleton.class) {  // do this to make it thread safe
                if(instance==null){
                    // doing this to lazily load
                    instance = new DbSingleton();
                }
            }
         }
        return instance;
    }
}
