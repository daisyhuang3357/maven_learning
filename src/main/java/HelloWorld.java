/**
 * Created by Administrator on 2017/4/22 0022.
 */
public class HelloWorld {
    private String name = "Maven";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HelloWorld() {

    }

    public HelloWorld(String name) {
        this.name = name;
    }
    //sayHello to somebody
    public String sayHello(String name)
    {
        return "Hello " + name;
    }

    public static void main(String[] args)
    {
        System.out.print( new HelloWorld().sayHello(new HelloWorld().name) );
    }
}
