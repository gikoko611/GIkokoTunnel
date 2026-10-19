package org.checkerframework.checker.nullness.qual;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.C2656MonotonicQualifier;
import org.checkerframework.framework.qual.C2660SubtypeOf;

@C2660SubtypeOf({C2647Nullable.class})
@Documented
@Target({ElementType.TYPE_USE})
@C2656MonotonicQualifier(C2646NonNull.class)
@Retention(RetentionPolicy.RUNTIME)
/* renamed from: org.checkerframework.checker.nullness.qual.MonotonicNonNull */
public @interface C2645MonotonicNonNull {
}
