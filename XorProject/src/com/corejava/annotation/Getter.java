package com.corejava.annotation;
import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})

public @interface Getter {

	//String value() default "Get a function";

}
