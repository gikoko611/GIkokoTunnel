package defpackage;

import android.os.Bundle;
import java.util.Map;
import java.util.Set;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: S9 */
public abstract class S9 {
    public final Set a;
    public final String b;
    public final Map c;
    public final Bundle d;
    public final Set e;
    public final Set f;
    public final Map g;
    public final String h;
    public final String i;
    public final long j;
    public final boolean k;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: S9.<init>(java.lang.String, java.util.Set, java.lang.String, java.util.Map, android.os.Bundle, java.util.Set, java.util.Set, java.util.Map, java.lang.String, java.lang.String, long, boolean):void, dex: classes.dex in method: S9.<init>(java.lang.String, java.util.Set, java.lang.String, java.util.Map, android.os.Bundle, java.util.Set, java.util.Set, java.util.Map, java.lang.String, java.lang.String, long, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: S9.<init>(java.lang.String, java.util.Set, java.lang.String, java.util.Map, android.os.Bundle, java.util.Set, java.util.Set, java.util.Map, java.lang.String, java.lang.String, long, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public S9(java.lang.String r1, java.util.Set r2, java.lang.String r3, java.util.Map r4, android.os.Bundle r5, java.util.Set r6, java.util.Set r7, java.util.Map r8, java.lang.String r9, java.lang.String r10, long r11, boolean r13) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: S9.<init>(java.lang.String, java.util.Set, java.lang.String, java.util.Map, android.os.Bundle, java.util.Set, java.util.Set, java.util.Map, java.lang.String, java.lang.String, long, boolean):void, dex: classes.dex in method: S9.<init>(java.lang.String, java.util.Set, java.lang.String, java.util.Map, android.os.Bundle, java.util.Set, java.util.Set, java.util.Map, java.lang.String, java.lang.String, long, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: S9.<init>(java.lang.String, java.util.Set, java.lang.String, java.util.Map, android.os.Bundle, java.util.Set, java.util.Set, java.util.Map, java.lang.String, java.lang.String, long, boolean):void");
    }

    public abstract String m();
}
