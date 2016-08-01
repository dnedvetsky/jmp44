package main;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

import java.util.ArrayList;

/**
 * Created by Dmitry on 30.07.2016.
 */
public class MetaspaceError {
    static ClassLoader cl1 = new ClassLoader();
    static ClassLoader cl2 = new ClassLoader();
    static ClassLoader cl3 = new ClassLoader();
    static ClassLoader cl4 = new ClassLoader();
    static ClassLoader cl5 = new ClassLoader();
    static ClassLoader cl6 = new ClassLoader();
    static ClassLoader cl7 = new ClassLoader();
    static ClassLoader cl8 = new ClassLoader();
    static ArrayList<java.lang.ClassLoader> arrCl = new ArrayList<java.lang.ClassLoader>();


    MetaspaceError() {

        while (true) {
            try {
                cl1.loadClass("java.math.BigDecimal");
                cl2.loadClass("java.math.BigDecimal");
                cl3.loadClass("java.math.BigDecimal");
                cl4.loadClass("java.math.BigDecimal");
                cl5.loadClass("java.math.BigDecimal");
                cl6.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl7.loadClass("java.math.BigDecimal");
                cl8.loadClass("java.math.BigDecimal");
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.printf("Finalizing");
    }
}
