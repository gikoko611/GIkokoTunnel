import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:36)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:260)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: Tg */
public final class C0632Tg implements Executor, Closeable {
    public static final /* synthetic */ AtomicLongFieldUpdater h = null;
    public static final /* synthetic */ AtomicLongFieldUpdater i = null;
    public static final /* synthetic */ AtomicIntegerFieldUpdater j = null;
    public static final C0225H2 k = null;
    private volatile /* synthetic */ int _isTerminated$volatile;
    public final int a;
    public final int b;
    public final long c;
    private volatile /* synthetic */ long controlState$volatile;
    public final String d;
    public final C0219Gu e;
    public final C0219Gu f;
    public final C1044bO g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.<clinit>():void, dex: classes.dex in method: Tg.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.<clinit>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    static {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.<clinit>():void, dex: classes.dex in method: Tg.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.<init>(int, int, long, java.lang.String):void, dex: classes.dex in method: Tg.<init>(int, int, long, java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.<init>(int, int, long, java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public C0632Tg(int r1, int r2, long r3, java.lang.String r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.<init>(int, int, long, java.lang.String):void, dex: classes.dex in method: Tg.<init>(int, int, long, java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.<init>(int, int, long, java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.h(Tg, java.lang.Runnable, boolean, int):void, dex: classes.dex in method: Tg.h(Tg, java.lang.Runnable, boolean, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.h(Tg, java.lang.Runnable, boolean, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ void h(C0632Tg r1, java.lang.Runnable r2, boolean r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.h(Tg, java.lang.Runnable, boolean, int):void, dex: classes.dex in method: Tg.h(Tg, java.lang.Runnable, boolean, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.h(Tg, java.lang.Runnable, boolean, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.close():void, dex: classes.dex in method: Tg.close():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.close():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void close() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.close():void, dex: classes.dex in method: Tg.close():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.close():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.d():int, dex: classes.dex in method: Tg.d():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.d():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final int d() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.d():int, dex: classes.dex in method: Tg.d():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.d():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.execute(java.lang.Runnable):void, dex: classes.dex in method: Tg.execute(java.lang.Runnable):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.execute(java.lang.Runnable):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void execute(java.lang.Runnable r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.execute(java.lang.Runnable):void, dex: classes.dex in method: Tg.execute(java.lang.Runnable):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.execute(java.lang.Runnable):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.g(java.lang.Runnable, boolean, boolean):void, dex: classes.dex in method: Tg.g(java.lang.Runnable, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.g(java.lang.Runnable, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void g(java.lang.Runnable r1, boolean r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.g(java.lang.Runnable, boolean, boolean):void, dex: classes.dex in method: Tg.g(java.lang.Runnable, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.g(java.lang.Runnable, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.r(Rg, int, int):void, dex: classes.dex in method: Tg.r(Rg, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.r(Rg, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void r(C0563Rg r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.r(Rg, int, int):void, dex: classes.dex in method: Tg.r(Rg, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.r(Rg, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.toString():java.lang.String, dex: classes.dex in method: Tg.toString():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.toString():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.toString():java.lang.String, dex: classes.dex in method: Tg.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.toString():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.w(long):boolean, dex: classes.dex in method: Tg.w(long):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.w(long):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final boolean w(long r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.w(long):boolean, dex: classes.dex in method: Tg.w(long):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.w(long):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: Tg.z():boolean, dex: classes.dex in method: Tg.z():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: Tg.z():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final boolean z() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: Tg.z():boolean, dex: classes.dex in method: Tg.z():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: Tg.z():boolean");
    }
}
