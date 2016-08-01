package main;

import com.sun.org.apache.bcel.internal.util.ClassLoader;

/**
 * Created by Dmitry on 30.07.2016.
 */
public class MetaspaceError {
    static ClassLoader cl1 = new ClassLoader();

    MetaspaceError() {

        while (true) {
            try {
                cl1.loadClass("java.math.BigDecimal");
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
