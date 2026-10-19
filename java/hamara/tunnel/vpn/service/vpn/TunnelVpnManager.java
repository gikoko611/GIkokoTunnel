package hamara.tunnel.vpn.service.vpn;

import hamara.tunnel.vpn.service.vpn.Tunnel.HostService;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

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
public class TunnelVpnManager implements HostService {
    private static final String TAG = "TunnelManager";
    public static final String VPN_SETTINGS = "vpnSettings";
    private TunnelVpnSettings mSettings;
    private AtomicBoolean m_isReconnecting;
    private AtomicBoolean m_isStopping;
    private TunnelVpnService m_parentService;
    private Tunnel m_tunnel;
    private Thread m_tunnelThread;
    private CountDownLatch m_tunnelThreadStopSignal;

    /* renamed from: hamara.tunnel.vpn.service.vpn.TunnelVpnManager$1 */
    public class AnonymousClass1 implements Runnable {
        final /* synthetic */ TunnelVpnManager this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public AnonymousClass1(hamara.tunnel.vpn.service.vpn.TunnelVpnManager r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.run():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.run():void, dex: classes.dex
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
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.run():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.1.run():void");
        }
    }

    public interface ManagerListener {
        void onLog(String str);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnService):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnService):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnService):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public TunnelVpnManager(hamara.tunnel.vpn.service.vpn.TunnelVpnService r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnService):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnService):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.<init>(hamara.tunnel.vpn.service.vpn.TunnelVpnService):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):hamara.tunnel.vpn.service.vpn.TunnelVpnSettings, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):hamara.tunnel.vpn.service.vpn.TunnelVpnSettings, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):hamara.tunnel.vpn.service.vpn.TunnelVpnSettings, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ hamara.tunnel.vpn.service.vpn.TunnelVpnSettings access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):hamara.tunnel.vpn.service.vpn.TunnelVpnSettings, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):hamara.tunnel.vpn.service.vpn.TunnelVpnSettings, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$000(hamara.tunnel.vpn.service.vpn.TunnelVpnManager):hamara.tunnel.vpn.service.vpn.TunnelVpnSettings");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager, java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager, java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager, java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static /* synthetic */ void access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager r1, java.lang.String r2, java.lang.String[] r3, boolean r4, java.lang.String r5, boolean r6) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager, java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager, java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.access$100(hamara.tunnel.vpn.service.vpn.TunnelVpnManager, java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    private void runTunnel(java.lang.String r1, java.lang.String[] r2, boolean r3, java.lang.String r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.runTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.startTunnel():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.startTunnel():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.startTunnel():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    private void startTunnel() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.startTunnel():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.startTunnel():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.startTunnel():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getAppName():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getAppName():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getAppName():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public java.lang.String getAppName() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getAppName():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getAppName():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getAppName():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getContext():android.content.Context, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getContext():android.content.Context, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getContext():android.content.Context, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public android.content.Context getContext() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getContext():android.content.Context, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getContext():android.content.Context, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getContext():android.content.Context");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():android.net.VpnService, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():android.net.VpnService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():android.net.VpnService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public android.net.VpnService getVpnService() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():android.net.VpnService, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():android.net.VpnService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():android.net.VpnService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():java.lang.Object, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public /* bridge */ /* synthetic */ java.lang.Object getVpnService() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():java.lang.Object, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.getVpnService():java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():android.net.VpnService$Builder, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():android.net.VpnService$Builder, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():android.net.VpnService$Builder, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public android.net.VpnService.Builder newVpnServiceBuilder() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():android.net.VpnService$Builder, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():android.net.VpnService$Builder, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():android.net.VpnService$Builder");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():java.lang.Object, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public /* bridge */ /* synthetic */ java.lang.Object newVpnServiceBuilder() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():java.lang.Object, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.newVpnServiceBuilder():java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDestroy():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDestroy():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDestroy():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void onDestroy() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDestroy():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDestroy():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDestroy():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDiagnosticMessage(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDiagnosticMessage(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDiagnosticMessage(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void onDiagnosticMessage(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDiagnosticMessage(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDiagnosticMessage(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onDiagnosticMessage(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public int onStartCommand(android.content.Intent r1, int r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onStartCommand(android.content.Intent, int, int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onStartCommand(android.content.Intent, int, int):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onTunnelConnected():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onTunnelConnected():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onTunnelConnected():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void onTunnelConnected() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onTunnelConnected():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onTunnelConnected():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onTunnelConnected():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onVpnEstablished():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onVpnEstablished():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onVpnEstablished():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void onVpnEstablished() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onVpnEstablished():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onVpnEstablished():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.onVpnEstablished():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.restartTunnel(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.restartTunnel(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.restartTunnel(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void restartTunnel(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.restartTunnel(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.restartTunnel(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.restartTunnel(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.signalStopService():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.signalStopService():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.signalStopService():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void signalStopService() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.signalStopService():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.signalStopService():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnManager.signalStopService():void");
    }
}
