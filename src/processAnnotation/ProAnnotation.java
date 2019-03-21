package processAnnotation;


import java.lang.annotation.*;

@Documented
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface ProAnnotation {
    Class[] value();
}
