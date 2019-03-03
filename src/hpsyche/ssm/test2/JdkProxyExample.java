package hpsyche.ssm.test2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Hpsyche
 */
public class JdkProxyExample implements InvocationHandler {
    private Object target=null;

    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("进入代理逻辑方法");
        System.out.println("调度前");
        Object obj=method.invoke(target,args);
        System.out.println("调度后");
        return obj;
    }
}
