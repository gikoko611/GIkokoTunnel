package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.checker.nullness.qual.RequiresNonNull.C2648List;
import org.checkerframework.framework.qual.C2658PreconditionAnnotation;

@Documented
@Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
@Repeatable(C2648List.class)
@Retention(RetentionPolicy.RUNTIME)
@C2658PreconditionAnnotation(qualifier = C2646NonNull.class)
/* renamed from: org.checkerframework.checker.nullness.qual.RequiresNonNull */
public @interface C2649RequiresNonNull {

    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Retention(RetentionPolicy.RUNTIME)
    @C2658PreconditionAnnotation(qualifier = C2646NonNull.class)
    /* renamed from: org.checkerframework.checker.nullness.qual.RequiresNonNull$List */
    public @interface C2648List {
    }

    @Documented
    @Target({ElementType.METHOD, ElementType.CONSTRUCTOR})
    @Retention(RetentionPolicy.RUNTIME)
    @C2658PreconditionAnnotation(qualifier = C2646NonNull.class)
    /* renamed from: org.checkerframework.checker.nullness.qual.RequiresNonNull$List */
    public @interface C2648List {
        C2649RequiresNonNull[] value();
    }
}
