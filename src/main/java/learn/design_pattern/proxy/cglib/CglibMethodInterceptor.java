package learn.design_pattern.proxy.cglib;


import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibMethodInterceptor implements MethodInterceptor {

    public Object intercept(Object object, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("cglib log start...");
        Object result = methodProxy.invokeSuper(object, args);
        System.out.println("cglib log end...");
        return result;
    }
}
