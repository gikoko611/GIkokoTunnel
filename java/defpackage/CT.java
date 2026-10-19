package defpackage;

import java.lang.ref.WeakReference;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: CT */
public final class CT {
    public final WeakReference a;
    public int b;
    public boolean c;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: CT.<init>(int, Y9):void, dex: classes.dex in method: CT.<init>(int, Y9):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: CT.<init>(int, Y9):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public CT(int r1, defpackage.Y9 r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: CT.<init>(int, Y9):void, dex: classes.dex in method: CT.<init>(int, Y9):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: CT.<init>(int, Y9):void");
    }
}
