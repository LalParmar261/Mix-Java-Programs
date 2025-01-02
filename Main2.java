package random;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface CustomAnnotation {
    String value();
}
class AnnotatedClass {
    @CustomAnnotation("@Inject, Annotation!")
    public void annotatedMethod() {}
}
public class Main2 {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = AnnotatedClass.class;
        Method method = clazz.getMethod("annotatedMethod");
        if (method.isAnnotationPresent(CustomAnnotation.class)) {
            CustomAnnotation annotation = method.getAnnotation(CustomAnnotation.class);
            System.out.println("Annotation value: " + annotation.value());
        }
    }
}