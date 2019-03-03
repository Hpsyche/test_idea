package hpsyche.ssm.test2;

/**
 * @author Hpsyche
 */
public class testJdkProxy {
    public void testJdkProxy(){
        JdkProxyExample jdk=new JdkProxyExample();
        HelloWorld proxy= (HelloWorld) jdk.bind(new HelloWorldImpl());
        proxy.sayHello();
    }

    public static void main(String[] args) {
        testJdkProxy test=new testJdkProxy();
        test.testJdkProxy();
    }
}
