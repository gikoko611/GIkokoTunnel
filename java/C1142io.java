import android.app.Service;
import android.content.Intent;
import defpackage.E30;
import java.util.concurrent.ExecutorService;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: io */
public abstract class C1142io extends Service {
    public final ExecutorService a;
    public E30 b;
    public final Object c;
    public int d;
    public int e;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: io.<init>():void, dex: classes.dex in method: io.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: io.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public C1142io() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: io.<init>():void, dex: classes.dex in method: io.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: io.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: io.a(android.content.Intent):void, dex: classes.dex in method: io.a(android.content.Intent):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: io.a(android.content.Intent):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void a(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: io.a(android.content.Intent):void, dex: classes.dex in method: io.a(android.content.Intent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: io.a(android.content.Intent):void");
    }

    public abstract void b(Intent intent);

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: io.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex in method: io.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: io.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final synchronized android.os.IBinder onBind(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: io.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex in method: io.onBind(android.content.Intent):android.os.IBinder, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: io.onBind(android.content.Intent):android.os.IBinder");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: io.onDestroy():void, dex: classes.dex in method: io.onDestroy():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: io.onDestroy():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void onDestroy() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: io.onDestroy():void, dex: classes.dex in method: io.onDestroy():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: io.onDestroy():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: io.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex in method: io.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: io.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final int onStartCommand(android.content.Intent r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: io.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex in method: io.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: io.onStartCommand(android.content.Intent, int, int):int");
    }
}
