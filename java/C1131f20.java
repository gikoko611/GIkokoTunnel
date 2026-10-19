import android.content.BroadcastReceiver;
import android.os.PowerManager.WakeLock;
import android.util.SparseArray;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:36)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:260)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: f20 */
public abstract class C1131f20 extends BroadcastReceiver {
    private static final String EXTRA_WAKE_LOCK_ID = "androidx.contentpager.content.wakelockid";
    private static int mNextId;
    private static final SparseArray<WakeLock> sActiveWakeLocks = null;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: f20.<clinit>():void, dex: classes.dex in method: f20.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: f20.<clinit>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    static {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: f20.<clinit>():void, dex: classes.dex in method: f20.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: f20.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: f20.completeWakefulIntent(android.content.Intent):boolean, dex: classes.dex in method: f20.completeWakefulIntent(android.content.Intent):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: f20.completeWakefulIntent(android.content.Intent):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static boolean completeWakefulIntent(android.content.Intent r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: f20.completeWakefulIntent(android.content.Intent):boolean, dex: classes.dex in method: f20.completeWakefulIntent(android.content.Intent):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: f20.completeWakefulIntent(android.content.Intent):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: f20.startWakefulService(android.content.Context, android.content.Intent):android.content.ComponentName, dex: classes.dex in method: f20.startWakefulService(android.content.Context, android.content.Intent):android.content.ComponentName, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: f20.startWakefulService(android.content.Context, android.content.Intent):android.content.ComponentName, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static android.content.ComponentName startWakefulService(android.content.Context r1, android.content.Intent r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: f20.startWakefulService(android.content.Context, android.content.Intent):android.content.ComponentName, dex: classes.dex in method: f20.startWakefulService(android.content.Context, android.content.Intent):android.content.ComponentName, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: f20.startWakefulService(android.content.Context, android.content.Intent):android.content.ComponentName");
    }
}
