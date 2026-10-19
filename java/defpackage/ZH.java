package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import androidx.core.graphics.drawable.IconCompat;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: ZH */
public final class ZH {
    public final Bundle a;
    public IconCompat b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final CharSequence f;
    public final PendingIntent g;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ZH.<init>(int, java.lang.String, android.app.PendingIntent):void, dex: classes.dex in method: ZH.<init>(int, java.lang.String, android.app.PendingIntent):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ZH.<init>(int, java.lang.String, android.app.PendingIntent):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public ZH(int r1, java.lang.String r2, android.app.PendingIntent r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ZH.<init>(int, java.lang.String, android.app.PendingIntent):void, dex: classes.dex in method: ZH.<init>(int, java.lang.String, android.app.PendingIntent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ZH.<init>(int, java.lang.String, android.app.PendingIntent):void");
    }
}
