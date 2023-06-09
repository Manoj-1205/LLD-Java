package Reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        Student student = new Student(12, "Manoj", "abc@gmail.com");

        Class clazz = Class.forName("Reflections.Student");
        System.out.println(clazz);

//        Method[] methods = clazz.getDeclaredMethods();
//        for(Method method : methods){
//            System.out.println(method.getName());
//        }

        Field[] fields = clazz.getDeclaredFields();
        System.out.println("Declared Fields");
        for(Field field : fields){
            System.out.println(field.getType().getSimpleName()+" "+field.getName());
        }


    }
}
