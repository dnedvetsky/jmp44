package main;

/**
 * Created by Dmitry on 30.07.2016.
 */
public class StackOverflowClass {
    private StackOverflowClass instance = new StackOverflowClass();

    public StackOverflowClass() throws Exception {
        throw new Exception();
    }
}
