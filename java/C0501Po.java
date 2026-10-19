import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: Po */
public final class C0501Po implements ThreadFactory {
    public final /* synthetic */ String a;
    public final /* synthetic */ AtomicLong b;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Po.<init>(java.util.concurrent.atomic.AtomicLong):void, dex: classes.dex in method: Po.<init>(java.util.concurrent.atomic.AtomicLong):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Po.<init>(java.util.concurrent.atomic.AtomicLong):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public C0501Po(java.util.concurrent.atomic.AtomicLong r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Po.<init>(java.util.concurrent.atomic.AtomicLong):void, dex: classes.dex in method: Po.<init>(java.util.concurrent.atomic.AtomicLong):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Po.<init>(java.util.concurrent.atomic.AtomicLong):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Po.newThread(java.lang.Runnable):java.lang.Thread, dex: classes.dex in method: Po.newThread(java.lang.Runnable):java.lang.Thread, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Po.newThread(java.lang.Runnable):java.lang.Thread, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final java.lang.Thread newThread(java.lang.Runnable r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Po.newThread(java.lang.Runnable):java.lang.Thread, dex: classes.dex in method: Po.newThread(java.lang.Runnable):java.lang.Thread, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Po.newThread(java.lang.Runnable):java.lang.Thread");
    }
}
