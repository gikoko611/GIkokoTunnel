package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.nullness.qual.EnsuresNonNull.C2641List;
import org.checkerframework.framework.qual.C2655InheritedAnnotation;
import org.checkerframework.framework.qual.C2657PostconditionAnnotation;

@Repeatable(C2641List.class)
@C2657PostconditionAnnotation(qualifier = C2646NonNull.class)
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@C2655InheritedAnnotation
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: org.checkerframework.checker.nullness.qual.EnsuresNonNull */
public @interface C2642EnsuresNonNull {

    @C2657PostconditionAnnotation(qualifier = C2646NonNull.class)
    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @C2655InheritedAnnotation
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.checkerframework.checker.nullness.qual.EnsuresNonNull$List */
    public @interface C2641List {
    }

    @C2657PostconditionAnnotation(qualifier = C2646NonNull.class)
    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @C2655InheritedAnnotation
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.checkerframework.checker.nullness.qual.EnsuresNonNull$List */
    public @interface C2641List {
        C2642EnsuresNonNull[] value();
    }
}
