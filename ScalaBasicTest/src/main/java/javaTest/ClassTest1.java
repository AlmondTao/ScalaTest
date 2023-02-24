package javaTest;

import com.tqy.Parent;
import com.tqy.typechange.Person$;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest1 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        //不可直接创建内部类
//        new Parent.child();
//        new Parent();
        Parent parent = new Parent();
        Parent.child child = parent.new child();

        Person person = new Person();

        Class personClass = Class.forName(Person.class.getName());
        Method sayHelloMethod = personClass.getDeclaredMethod("sayHello",String.class);
        sayHelloMethod.setAccessible(true);
        Object reflect = sayHelloMethod.invoke(person, "reflect");

        System.out.println(reflect);

    }
}
