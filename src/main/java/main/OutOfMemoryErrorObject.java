package main;

/**
 * Created by Dmitry on 30.07.2016.
 */
public class OutOfMemoryErrorObject {
    static public OutOfMemoryErrorClass field1;
    static public OutOfMemoryErrorClass field2;
    static public OutOfMemoryErrorClass field3;
    static public OutOfMemoryErrorClass field4;
    static public OutOfMemoryErrorClass field5;
    static public OutOfMemoryErrorClass field6;
    static public OutOfMemoryErrorClass field7;
    static public OutOfMemoryErrorClass field8;
    static public OutOfMemoryErrorClass field9;

    @Override
    protected void finalize() throws Throwable {
        System.out.print("Finalized");
    }
}
