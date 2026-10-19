package com.google.android.libraries.ads.mobile.sdk.internal.nativead;

import ads_mobile_sdk.cc1;
import ads_mobile_sdk.hg0;
import ads_mobile_sdk.it1;
import ads_mobile_sdk.iw1;
import ads_mobile_sdk.qr0;
import ads_mobile_sdk.qw1;
import ads_mobile_sdk.zt1;
import androidx.annotation.Keep;
import com.google.android.libraries.ads.mobile.sdk.internal.webview.PerAdNativeJavscriptEngineJsContext;
import java.util.Optional;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
public class InternalNativeAd extends cc1 {
    public final it1 a;
    public final zt1 e;
    @NotNull
    @Keep
    private final Optional<PerAdNativeJavscriptEngineJsContext> jsEngineContext;
    public final iw1 l;
    @Nullable
    @Keep
    private PerAdNativeJavscriptEngineJsContext localJsEngineContext;
    public final qw1 q;
    public final qr0 r;
    public final hg0 s;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.<init>(Ug, java.lang.String, ads_mobile_sdk.a2, ads_mobile_sdk.xv, ads_mobile_sdk.kh3, java.util.Optional, ads_mobile_sdk.z2, ads_mobile_sdk.ph0, ads_mobile_sdk.it1, ads_mobile_sdk.zt1, ads_mobile_sdk.iw1, ads_mobile_sdk.qw1, ads_mobile_sdk.we1, java.util.Optional, ads_mobile_sdk.se2, ads_mobile_sdk.jz2, Qu, ads_mobile_sdk.ah3, ads_mobile_sdk.ve2, ads_mobile_sdk.qr0, S9, ads_mobile_sdk.hg0):void, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.<init>(Ug, java.lang.String, ads_mobile_sdk.a2, ads_mobile_sdk.xv, ads_mobile_sdk.kh3, java.util.Optional, ads_mobile_sdk.z2, ads_mobile_sdk.ph0, ads_mobile_sdk.it1, ads_mobile_sdk.zt1, ads_mobile_sdk.iw1, ads_mobile_sdk.qw1, ads_mobile_sdk.we1, java.util.Optional, ads_mobile_sdk.se2, ads_mobile_sdk.jz2, Qu, ads_mobile_sdk.ah3, ads_mobile_sdk.ve2, ads_mobile_sdk.qr0, S9, ads_mobile_sdk.hg0):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.<init>(Ug, java.lang.String, ads_mobile_sdk.a2, ads_mobile_sdk.xv, ads_mobile_sdk.kh3, java.util.Optional, ads_mobile_sdk.z2, ads_mobile_sdk.ph0, ads_mobile_sdk.it1, ads_mobile_sdk.zt1, ads_mobile_sdk.iw1, ads_mobile_sdk.qw1, ads_mobile_sdk.we1, java.util.Optional, ads_mobile_sdk.se2, ads_mobile_sdk.jz2, Qu, ads_mobile_sdk.ah3, ads_mobile_sdk.ve2, ads_mobile_sdk.qr0, S9, ads_mobile_sdk.hg0):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public InternalNativeAd(defpackage.Ug r1, java.lang.String r2, ads_mobile_sdk.a2 r3, ads_mobile_sdk.xv r4, ads_mobile_sdk.kh3 r5, java.util.Optional r6, ads_mobile_sdk.z2 r7, ads_mobile_sdk.ph0 r8, ads_mobile_sdk.it1 r9, ads_mobile_sdk.zt1 r10, ads_mobile_sdk.iw1 r11, ads_mobile_sdk.qw1 r12, ads_mobile_sdk.we1 r13, java.util.Optional r14, ads_mobile_sdk.se2 r15, ads_mobile_sdk.jz2 r16, C0544Qu r17, ads_mobile_sdk.ah3 r18, ads_mobile_sdk.ve2 r19, ads_mobile_sdk.qr0 r20, defpackage.S9 r21, ads_mobile_sdk.hg0 r22) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.<init>(Ug, java.lang.String, ads_mobile_sdk.a2, ads_mobile_sdk.xv, ads_mobile_sdk.kh3, java.util.Optional, ads_mobile_sdk.z2, ads_mobile_sdk.ph0, ads_mobile_sdk.it1, ads_mobile_sdk.zt1, ads_mobile_sdk.iw1, ads_mobile_sdk.qw1, ads_mobile_sdk.we1, java.util.Optional, ads_mobile_sdk.se2, ads_mobile_sdk.jz2, Qu, ads_mobile_sdk.ah3, ads_mobile_sdk.ve2, ads_mobile_sdk.qr0, S9, ads_mobile_sdk.hg0):void, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.<init>(Ug, java.lang.String, ads_mobile_sdk.a2, ads_mobile_sdk.xv, ads_mobile_sdk.kh3, java.util.Optional, ads_mobile_sdk.z2, ads_mobile_sdk.ph0, ads_mobile_sdk.it1, ads_mobile_sdk.zt1, ads_mobile_sdk.iw1, ads_mobile_sdk.qw1, ads_mobile_sdk.we1, java.util.Optional, ads_mobile_sdk.se2, ads_mobile_sdk.jz2, Qu, ads_mobile_sdk.ah3, ads_mobile_sdk.ve2, ads_mobile_sdk.qr0, S9, ads_mobile_sdk.hg0):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.<init>(Ug, java.lang.String, ads_mobile_sdk.a2, ads_mobile_sdk.xv, ads_mobile_sdk.kh3, java.util.Optional, ads_mobile_sdk.z2, ads_mobile_sdk.ph0, ads_mobile_sdk.it1, ads_mobile_sdk.zt1, ads_mobile_sdk.iw1, ads_mobile_sdk.qw1, ads_mobile_sdk.we1, java.util.Optional, ads_mobile_sdk.se2, ads_mobile_sdk.jz2, Qu, ads_mobile_sdk.ah3, ads_mobile_sdk.ve2, ads_mobile_sdk.qr0, S9, ads_mobile_sdk.hg0):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.a(ads_mobile_sdk.xm2):java.lang.Object, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.a(ads_mobile_sdk.xm2):java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.a(ads_mobile_sdk.xm2):java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final java.lang.Object a(ads_mobile_sdk.xm2 r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.a(ads_mobile_sdk.xm2):java.lang.Object, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.a(ads_mobile_sdk.xm2):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.a(ads_mobile_sdk.xm2):java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.destroy():void, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.destroy():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.destroy():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void destroy() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.destroy():void, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.destroy():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.destroy():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.g():yz, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.g():yz, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.g():yz, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final C2565yz g() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.g():yz, dex: classes.dex in method: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.g():yz, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.ads.mobile.sdk.internal.nativead.InternalNativeAd.g():yz");
    }
}
