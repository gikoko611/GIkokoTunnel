import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;

/* renamed from: si */
public abstract class C0943si implements ServiceConnection {
    private Context mApplicationContext;

    public abstract void onCustomTabsServiceConnected(ComponentName componentName, C1889xL c1889xL);

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: si.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes.dex in method: si.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: si.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void onServiceConnected(android.content.ComponentName r1, android.os.IBinder r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: si.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes.dex in method: si.onServiceConnected(android.content.ComponentName, android.os.IBinder):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: si.onServiceConnected(android.content.ComponentName, android.os.IBinder):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: si.setApplicationContext(android.content.Context):void, dex: classes.dex in method: si.setApplicationContext(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: si.setApplicationContext(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void setApplicationContext(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: si.setApplicationContext(android.content.Context):void, dex: classes.dex in method: si.setApplicationContext(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: si.setApplicationContext(android.content.Context):void");
    }
}
