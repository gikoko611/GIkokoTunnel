import android.os.Handler;
import defpackage.OC;
import java.util.concurrent.Executor;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: x6 */
public abstract class C1127x6 extends OC {
    static final boolean DEBUG = false;
    static final String TAG = "AsyncTaskLoader";
    volatile C2398w6 mCancellingTask;
    private final Executor mExecutor;
    Handler mHandler;
    long mLastLoadCompleteTime;
    volatile C2398w6 mTask;
    long mUpdateThrottle;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.<init>(android.content.Context):void, dex: classes.dex in method: x6.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public C1127x6(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.<init>(android.content.Context):void, dex: classes.dex in method: x6.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.cancelLoadInBackground():void, dex: classes.dex in method: x6.cancelLoadInBackground():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.cancelLoadInBackground():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void cancelLoadInBackground() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.cancelLoadInBackground():void, dex: classes.dex in method: x6.cancelLoadInBackground():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.cancelLoadInBackground():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.dispatchOnCancelled(w6, java.lang.Object):void, dex: classes.dex in method: x6.dispatchOnCancelled(w6, java.lang.Object):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.dispatchOnCancelled(w6, java.lang.Object):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void dispatchOnCancelled(C2398w6 r1, java.lang.Object r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.dispatchOnCancelled(w6, java.lang.Object):void, dex: classes.dex in method: x6.dispatchOnCancelled(w6, java.lang.Object):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.dispatchOnCancelled(w6, java.lang.Object):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.dispatchOnLoadComplete(w6, java.lang.Object):void, dex: classes.dex in method: x6.dispatchOnLoadComplete(w6, java.lang.Object):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.dispatchOnLoadComplete(w6, java.lang.Object):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void dispatchOnLoadComplete(C2398w6 r1, java.lang.Object r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.dispatchOnLoadComplete(w6, java.lang.Object):void, dex: classes.dex in method: x6.dispatchOnLoadComplete(w6, java.lang.Object):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.dispatchOnLoadComplete(w6, java.lang.Object):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void, dex: classes.dex in method: x6.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @java.lang.Deprecated
    public void dump(java.lang.String r1, java.io.FileDescriptor r2, java.io.PrintWriter r3, java.lang.String[] r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void, dex: classes.dex in method: x6.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.executePendingTask():void, dex: classes.dex in method: x6.executePendingTask():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.executePendingTask():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void executePendingTask() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.executePendingTask():void, dex: classes.dex in method: x6.executePendingTask():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.executePendingTask():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.isLoadInBackgroundCanceled():boolean, dex: classes.dex in method: x6.isLoadInBackgroundCanceled():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.isLoadInBackgroundCanceled():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isLoadInBackgroundCanceled() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.isLoadInBackgroundCanceled():boolean, dex: classes.dex in method: x6.isLoadInBackgroundCanceled():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.isLoadInBackgroundCanceled():boolean");
    }

    public abstract Object loadInBackground();

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.onCancelLoad():boolean, dex: classes.dex in method: x6.onCancelLoad():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.onCancelLoad():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean onCancelLoad() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.onCancelLoad():boolean, dex: classes.dex in method: x6.onCancelLoad():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.onCancelLoad():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.onCanceled(java.lang.Object):void, dex: classes.dex in method: x6.onCanceled(java.lang.Object):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.onCanceled(java.lang.Object):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onCanceled(java.lang.Object r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.onCanceled(java.lang.Object):void, dex: classes.dex in method: x6.onCanceled(java.lang.Object):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.onCanceled(java.lang.Object):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.onForceLoad():void, dex: classes.dex in method: x6.onForceLoad():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.onForceLoad():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onForceLoad() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.onForceLoad():void, dex: classes.dex in method: x6.onForceLoad():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.onForceLoad():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.onLoadInBackground():java.lang.Object, dex: classes.dex in method: x6.onLoadInBackground():java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.onLoadInBackground():java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Object onLoadInBackground() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.onLoadInBackground():java.lang.Object, dex: classes.dex in method: x6.onLoadInBackground():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.onLoadInBackground():java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.setUpdateThrottle(long):void, dex: classes.dex in method: x6.setUpdateThrottle(long):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.setUpdateThrottle(long):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setUpdateThrottle(long r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.setUpdateThrottle(long):void, dex: classes.dex in method: x6.setUpdateThrottle(long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.setUpdateThrottle(long):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: x6.waitForLoader():void, dex: classes.dex in method: x6.waitForLoader():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: x6.waitForLoader():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void waitForLoader() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: x6.waitForLoader():void, dex: classes.dex in method: x6.waitForLoader():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: x6.waitForLoader():void");
    }
}
