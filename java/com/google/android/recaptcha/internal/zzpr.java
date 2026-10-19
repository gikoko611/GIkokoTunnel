package com.google.android.recaptcha.internal;

import sun.misc.Unsafe;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
abstract class zzpr {
    final Unsafe zza;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.internal.zzpr.<init>(sun.misc.Unsafe):void, dex: classes.dex in method: com.google.android.recaptcha.internal.zzpr.<init>(sun.misc.Unsafe):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.internal.zzpr.<init>(sun.misc.Unsafe):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public zzpr(sun.misc.Unsafe r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.internal.zzpr.<init>(sun.misc.Unsafe):void, dex: classes.dex in method: com.google.android.recaptcha.internal.zzpr.<init>(sun.misc.Unsafe):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.internal.zzpr.<init>(sun.misc.Unsafe):void");
    }

    public abstract double zza(Object obj, long j);

    public abstract float zzb(Object obj, long j);

    public abstract void zzc(Object obj, long j, boolean z);

    public abstract void zzd(Object obj, long j, byte b);

    public abstract void zze(Object obj, long j, double d);

    public abstract void zzf(Object obj, long j, float f);

    public abstract boolean zzg(Object obj, long j);
}
