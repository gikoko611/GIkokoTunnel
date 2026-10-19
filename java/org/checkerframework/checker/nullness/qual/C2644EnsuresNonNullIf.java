package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.nullness.qual.EnsuresNonNullIf.C2643List;
import org.checkerframework.framework.qual.C2652ConditionalPostconditionAnnotation;
import org.checkerframework.framework.qual.C2655InheritedAnnotation;

@Repeatable(C2643List.class)
@C2652ConditionalPostconditionAnnotation(qualifier = C2646NonNull.class)
@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@C2655InheritedAnnotation
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: org.checkerframework.checker.nullness.qual.EnsuresNonNullIf */
public @interface C2644EnsuresNonNullIf {

    @C2652ConditionalPostconditionAnnotation(qualifier = C2646NonNull.class)
    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @C2655InheritedAnnotation
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.checkerframework.checker.nullness.qual.EnsuresNonNullIf$List */
    public @interface C2643List {
    }

    @C2652ConditionalPostconditionAnnotation(qualifier = C2646NonNull.class)
    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @C2655InheritedAnnotation
    @Retention(RetentionPolicy.RUNTIME)
    /* renamed from: org.checkerframework.checker.nullness.qual.EnsuresNonNullIf$List */
    public @interface C2643List {
        C2644EnsuresNonNullIf[] value();
    }
}
