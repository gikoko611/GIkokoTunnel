import android.app.Activity;
import android.content.Context;
import android.os.Handler;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: Es */
public abstract class C0147Es extends C0086Cs {
    public final Activity a;
    public final Context b;
    public final Handler c;
    public final C0474Os d;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Es.<init>(androidx.fragment.app.q):void, dex: classes.dex in method: Es.<init>(androidx.fragment.app.q):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Es.<init>(androidx.fragment.app.q):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public C0147Es(androidx.fragment.app.q r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Es.<init>(androidx.fragment.app.q):void, dex: classes.dex in method: Es.<init>(androidx.fragment.app.q):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Es.<init>(androidx.fragment.app.q):void");
    }
}
