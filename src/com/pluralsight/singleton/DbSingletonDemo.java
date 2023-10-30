package com.pluralsight.singleton;

public class DbSingletonDemo {
    public static void main(String[] args) {
        //can't use constructor because it is private
        DbSingleton instance = DbSingleton.getInstance();

        System.out.println(instance);

        DbSingleton anotherInstance = DbSingleton.getInstance();
        // should print same address as above
        System.out.println(anotherInstance);
    }

}
