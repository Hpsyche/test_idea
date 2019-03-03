package hpsyche.ssm.test;

import java.lang.reflect.Method;

/**
 * @author Hpsyche
 */
public class ReflectTest {
    public Object reflect(){
        ReflectServiceImpl object=null;
        try {
            object= (ReflectServiceImpl) Class.forName("hpsyche.ssm.test.ReflectServiceImpl").newInstance();
            Method method=object.getClass().getMethod("sayHello", String.class);
            method.invoke(object,"张三");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return object;
    }

    public static void main(String[] args) {
        ReflectTest test=new ReflectTest();
        test.reflect();
    }

}
