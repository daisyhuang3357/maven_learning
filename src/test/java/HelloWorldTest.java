import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class HelloWorldTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();

        String result = helloWorld.sayHello(helloWorld.getName());

        Assert.assertEquals( "Hello Maven", result );
    }

    private String name = "APPLE";
    @Test
    public void testSayHello(String name) {
        HelloWorld helloWorld = new HelloWorld(name);

        String result = helloWorld.sayHello(helloWorld.getName());

        Assert.assertEquals( "Hello " + name, result );
    }
}
