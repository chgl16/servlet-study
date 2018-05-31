package top.chgl16.servlet;

import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyServlet1 {

    /*
    @BeforeClass
    public static void beforeClass() {
        MyServlet1 t1 = new MyServlet1();
        System.out.println("ok");
    }
    */

    @Test
    public void testinit() {
        new MyServlet1();
    }
}
