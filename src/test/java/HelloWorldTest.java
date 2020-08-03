import org.junit.Test;

import static org.junit.Assert.*;

public class HelloWorldTest {

    @Test
    public void sayHi_should_return_Hello_World(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi();
        assertEquals("HelloWORLD",result);

    }

    @Test
    public void sayHi_should_return_Hello_Somkiat(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("somkiat");
        assertEquals("Hello Somkiat",result);

    }

    @Test
    public void sayHi_should_return_Hello_nickName(){
        HelloWorld h = new HelloWorld();
        String result = h.sayHi("nickName");
        assertEquals("Hello NickName",result);

    }

}