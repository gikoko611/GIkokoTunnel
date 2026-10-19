package org.checkerframework.checker.nullness.qual;

import com.facebook.ads.redexgen.X.AnonymousClass0E;
import com.facebook.ads.redexgen.X.AnonymousClass0F;
import com.facebook.ads.redexgen.X.AnonymousClass0L;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import org.checkerframework.framework.qual.C2653DefaultFor;
import org.checkerframework.framework.qual.C2654DefaultQualifierInHierarchy;
import org.checkerframework.framework.qual.C2659QualifierForLiterals;
import org.checkerframework.framework.qual.C2660SubtypeOf;
import org.checkerframework.framework.qual.C2661UpperBoundFor;

@C2653DefaultFor({AnonymousClass0E.A04})
@C2661UpperBoundFor(typeKinds = {AnonymousClass0F.A0I, AnonymousClass0F.A0C, AnonymousClass0F.A04, AnonymousClass0F.A06, AnonymousClass0F.A08, AnonymousClass0F.A0B, AnonymousClass0F.A0E, AnonymousClass0F.A0J, AnonymousClass0F.A05})
@C2660SubtypeOf({C2645MonotonicNonNull.class})
@Documented
@Target({ElementType.TYPE_USE, ElementType.TYPE_PARAMETER})
@C2654DefaultQualifierInHierarchy
@Retention(RetentionPolicy.RUNTIME)
@C2659QualifierForLiterals({AnonymousClass0L.A0C})
/* renamed from: org.checkerframework.checker.nullness.qual.NonNull */
public @interface C2646NonNull {
}
