import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
/* renamed from: dz */
public @interface C1220dz {
    boolean nullSafe() default true;

    Class value();
}
