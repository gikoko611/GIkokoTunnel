package org.checkerframework.checker.nullness.qual;

import com.facebook.ads.redexgen.X.AnonymousClass0L;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.C2653DefaultFor;
import org.checkerframework.framework.qual.C2659QualifierForLiterals;
import org.checkerframework.framework.qual.C2660SubtypeOf;

@C2653DefaultFor(types = {Void.class})
@C2660SubtypeOf({})
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@C2659QualifierForLiterals({AnonymousClass0L.A0A})
/* renamed from: org.checkerframework.checker.nullness.qual.Nullable */
public @interface C2647Nullable {
}
