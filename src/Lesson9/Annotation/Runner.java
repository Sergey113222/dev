package Lesson9.Annotation;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Runner {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        if (MyService.class.isAnnotationPresent(Version.class)) {
            MyService myService = new MyService(9.0, "sss2");

            Method thisClassInfo = MyService.class.getDeclaredMethod("thisClassInfo");
            thisClassInfo.setAccessible(true);
            thisClassInfo.invoke(myService);
        } else {
            System.out.println("MyService не помечен @Version");
        }
    }
}
