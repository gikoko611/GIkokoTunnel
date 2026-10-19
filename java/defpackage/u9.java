package defpackage;

/* renamed from: u9 */
public abstract class u9 implements Runnable {
    public abstract void a();

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: u9.run():void, dex: classes.dex in method: u9.run():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: u9.run():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void run() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: u9.run():void, dex: classes.dex in method: u9.run():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: u9.run():void");
    }
}
