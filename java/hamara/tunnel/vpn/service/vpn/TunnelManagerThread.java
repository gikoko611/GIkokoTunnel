package hamara.tunnel.vpn.service.vpn;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.os.Handler;
import java.util.concurrent.CountDownLatch;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.lang.Object java.util.List.get(int)' on a null object reference
    	at U4.b.f(SourceFile:1852)
    	at U4.b.f(SourceFile:1673)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
public class TunnelManagerThread implements Runnable {
    private static final int AUTH_TRIES = 1;
    private static final int RECONNECT_TRIES = 5;
    private static final String TAG = "TunnelManagerThread";
    private C2319uf mConfig;
    private boolean mConnected;
    private Context mContext;
    private Handler mHandler;
    private OnStopCliente mListener;
    public boolean mReconnecting;
    private boolean mRunning;
    private boolean mStarting;
    private boolean mStopping;
    private CountDownLatch mTunnelThreadStopSignal;
    private BroadcastReceiver m_vpnTunnelBroadcastReceiver;

    public interface OnStopCliente {
        void onStop();
    }

    /* renamed from: hamara.tunnel.vpn.service.vpn.TunnelManagerThread$1 */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ TunnelManagerThread this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public AnonymousClass1(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.run():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.run():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public void run() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.run():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.1.run():void");
        }
    }

    /* renamed from: hamara.tunnel.vpn.service.vpn.TunnelManagerThread$2 */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ TunnelManagerThread this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public AnonymousClass2(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.run():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.run():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public void run() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.run():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.2.run():void");
        }
    }

    /* renamed from: hamara.tunnel.vpn.service.vpn.TunnelManagerThread$3 */
    public class AnonymousClass3 extends BroadcastReceiver {
        final /* synthetic */ TunnelManagerThread this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public AnonymousClass3(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.<init>(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.onReceive(android.content.Context, android.content.Intent):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.onReceive(android.content.Context, android.content.Intent):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.onReceive(android.content.Context, android.content.Intent):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public synchronized void onReceive(android.content.Context r1, android.content.Intent r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.onReceive(android.content.Context, android.content.Intent):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.onReceive(android.content.Context, android.content.Intent):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.3.onReceive(android.content.Context, android.content.Intent):void");
        }
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.<init>(android.os.Handler, android.content.Context):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.<init>(android.os.Handler, android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.<init>(android.os.Handler, android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public TunnelManagerThread(android.os.Handler r1, android.content.Context r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.<init>(android.os.Handler, android.content.Context):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.<init>(android.os.Handler, android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.<init>(android.os.Handler, android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ boolean access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$002(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):java.util.concurrent.CountDownLatch, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):java.util.concurrent.CountDownLatch, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):java.util.concurrent.CountDownLatch, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ java.util.concurrent.CountDownLatch access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):java.util.concurrent.CountDownLatch, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):java.util.concurrent.CountDownLatch, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$100(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):java.util.concurrent.CountDownLatch");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):android.content.Context, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):android.content.Context, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):android.content.Context, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ android.content.Context access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):android.content.Context, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):android.content.Context, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$200(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):android.content.Context");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ boolean access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$302(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ boolean access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$402(hamara.tunnel.vpn.service.vpn.TunnelManagerThread, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ boolean access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.access$500(hamara.tunnel.vpn.service.vpn.TunnelManagerThread):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.isServiceVpnRunning():boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.isServiceVpnRunning():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.isServiceVpnRunning():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static boolean isServiceVpnRunning() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.isServiceVpnRunning():boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.isServiceVpnRunning():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.isServiceVpnRunning():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.closeSSH():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.closeSSH():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.closeSSH():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public synchronized void closeSSH() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.closeSSH():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.closeSSH():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.closeSSH():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.reconnectSSH():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.reconnectSSH():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.reconnectSSH():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void reconnectSSH() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.reconnectSSH():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.reconnectSSH():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.reconnectSSH():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.run():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.run():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void run() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.run():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.run():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread$OnStopCliente):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread$OnStopCliente):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread$OnStopCliente):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread.OnStopCliente r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread$OnStopCliente):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread$OnStopCliente):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.setOnStopClienteListener(hamara.tunnel.vpn.service.vpn.TunnelManagerThread$OnStopCliente):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startClienteSSH():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startClienteSSH():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startClienteSSH():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void startClienteSSH() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startClienteSSH():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startClienteSSH():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startClienteSSH():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startForwarder(int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startForwarder(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startForwarder(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void startForwarder(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startForwarder(int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startForwarder(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startForwarder(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startTunnelVpnService():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startTunnelVpnService():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startTunnelVpnService():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void startTunnelVpnService() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startTunnelVpnService():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startTunnelVpnService():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.startTunnelVpnService():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopAll():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopAll():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopAll():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void stopAll() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopAll():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopAll():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopAll():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopForwarder():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopForwarder():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopForwarder():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void stopForwarder() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopForwarder():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopForwarder():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopForwarder():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopTunnelVpnService():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopTunnelVpnService():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopTunnelVpnService():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public synchronized void stopTunnelVpnService() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopTunnelVpnService():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopTunnelVpnService():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelManagerThread.stopTunnelVpnService():void");
    }
}
