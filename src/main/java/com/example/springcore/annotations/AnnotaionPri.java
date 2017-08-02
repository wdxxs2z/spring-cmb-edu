package com.example.springcore.annotations;

import java.lang.annotation.Annotation;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.Arrays;

public class AnnotaionPri {
	
	//注解开发练习
	public static void main(String[] args) {
		Annotation[] annotations = RepeatAnn.class.getAnnotations();  
        System.out.println(annotations.length); 
        Arrays.stream(annotations).forEach(System.out::println);
  
        Annotation[] annotations2 = Annotations.class.getAnnotations();  
        System.out.println(annotations2.length);
        Arrays.stream(annotations2).forEach(System.out::println);
	}
	
	@Repeatable(value = Roles.class)  
    public static @interface Role {  
        String name() default "doctor";
    }  
  
    @Target(ElementType.TYPE)
    @Retention(RetentionPolicy.RUNTIME)
    public static @interface Roles {  
        Role[] value();  
    }  
      
    @Role(name = "doctor")  
    @Role(name = "who")  
    public static class RepeatAnn{  
          
    }  
      
    @Roles({@Role(name="doctor"),  
            @Role(name="who")})  
    public static class Annotations{  
          
    } 

}
