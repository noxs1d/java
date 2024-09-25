package com.rpam.rd.autotasks;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CatchEmAll {

    //You may set another exception in this field;
    static Exception exception = new FileNotFoundException();

    public static void riskyMethod() throws Exception {
        throw exception;

    }

    public static void main(String[] args) throws Exception {
        try {
            riskyMethod(); // Call to the risky method
        } catch (FileNotFoundException e) {
            throw new IllegalArgumentException("Resource is missing", e);
        } catch (IOException e) {
            throw new IllegalArgumentException("Resource error", e);
        } catch (ArithmeticException | NumberFormatException e) {
            System.err.println(e.getMessage());
        } catch (Exception e) {
            // Any other exceptions should not be caught, so rethrow it
            throw e;
        }    }

}
