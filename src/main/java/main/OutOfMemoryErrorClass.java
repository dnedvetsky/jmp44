package main;

/**
 * Created by Dmitry on 29.07.2016.
 */
public class OutOfMemoryErrorClass {
    private static String dbl = "     ";

    OutOfMemoryErrorClass() {
        while (true)
        {
            dbl += dbl;
        }
    }
}
