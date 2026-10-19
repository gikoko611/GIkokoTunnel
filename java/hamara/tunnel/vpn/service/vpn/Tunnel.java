package hamara.tunnel.vpn.service.vpn;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import defpackage.JH;
import hamara.tunnel.vpn.service.vpn.Tun2Socks.OnTun2SocksListener;
import hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.lang.Object java.util.List.get(int)' on a null object reference
    	at U4.b.f(SourceFile:1852)
    	at U4.b.f(SourceFile:1673)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class Tunnel {
    private static final String DNS_RESOLVER_IP = "8.8.8.8";
    private static final int DNS_RESOLVER_PORT = 53;
    private static final String VPN_INTERFACE_NETMASK = "255.255.255.0";
    private static Tunnel mTunnel;
    private final HostService mHostService;
    private int mMtu;
    private Pdnsd mPdnsd;
    private PrivateAddress mPrivateAddress;
    private JH mRoutes;
    private AtomicBoolean mRoutingThroughTunnel;
    private Tun2Socks mTun2Socks;
    private Thread mTun2SocksThread;
    private AtomicReference<ParcelFileDescriptor> mTunFd;

    /* renamed from: hamara.tunnel.vpn.service.vpn.Tunnel$1 */
    public class AnonymousClass1 implements OnTun2SocksListener {
        final /* synthetic */ Tunnel this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.<init>(hamara.tunnel.vpn.service.vpn.Tunnel):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.<init>(hamara.tunnel.vpn.service.vpn.Tunnel):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.<init>(hamara.tunnel.vpn.service.vpn.Tunnel):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass1(hamara.tunnel.vpn.service.vpn.Tunnel r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.<init>(hamara.tunnel.vpn.service.vpn.Tunnel):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.<init>(hamara.tunnel.vpn.service.vpn.Tunnel):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.1.<init>(hamara.tunnel.vpn.service.vpn.Tunnel):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStart():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStart():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStart():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onStart() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStart():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStart():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStart():void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStop():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStop():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStop():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onStop() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStop():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStop():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.1.onStop():void");
        }
    }

    /* renamed from: hamara.tunnel.vpn.service.vpn.Tunnel$2 */
    public class AnonymousClass2 implements Runnable {
        final /* synthetic */ Tunnel this$0;
        final /* synthetic */ String val$dnsResolverAddress;
        final /* synthetic */ boolean val$socks5UdpEnabled;
        final /* synthetic */ String val$socksServerAddress;
        final /* synthetic */ boolean val$transparentDns;
        final /* synthetic */ String val$udpRelayAddress;
        final /* synthetic */ ParcelFileDescriptor val$vpnInterfaceFileDescriptor;
        final /* synthetic */ int val$vpnInterfaceMTU;
        final /* synthetic */ String val$vpnIpAddress;
        final /* synthetic */ String val$vpnIpV6Address;
        final /* synthetic */ String val$vpnNetMask;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.<init>(hamara.tunnel.vpn.service.vpn.Tunnel, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.<init>(hamara.tunnel.vpn.service.vpn.Tunnel, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.<init>(hamara.tunnel.vpn.service.vpn.Tunnel, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass2(hamara.tunnel.vpn.service.vpn.Tunnel r1, android.os.ParcelFileDescriptor r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, java.lang.String r9, boolean r10, boolean r11) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.<init>(hamara.tunnel.vpn.service.vpn.Tunnel, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.<init>(hamara.tunnel.vpn.service.vpn.Tunnel, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.2.<init>(hamara.tunnel.vpn.service.vpn.Tunnel, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.run():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.run():void, dex: classes.dex
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
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.2.run():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.2.run():void");
        }
    }

    public interface HostService {
        String getAppName();

        Context getContext();

        Object getVpnService();

        Object newVpnServiceBuilder();

        void onDiagnosticMessage(String str);

        void onTunnelConnected();

        void onVpnEstablished();
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.<init>(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.<init>(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.<init>(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private Tunnel(hamara.tunnel.vpn.service.vpn.Tunnel.HostService r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.<init>(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.<init>(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.<init>(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.access$000(hamara.tunnel.vpn.service.vpn.Tunnel):hamara.tunnel.vpn.service.vpn.Tunnel$HostService, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.access$000(hamara.tunnel.vpn.service.vpn.Tunnel):hamara.tunnel.vpn.service.vpn.Tunnel$HostService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.access$000(hamara.tunnel.vpn.service.vpn.Tunnel):hamara.tunnel.vpn.service.vpn.Tunnel$HostService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ hamara.tunnel.vpn.service.vpn.Tunnel.HostService access$000(hamara.tunnel.vpn.service.vpn.Tunnel r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.access$000(hamara.tunnel.vpn.service.vpn.Tunnel):hamara.tunnel.vpn.service.vpn.Tunnel$HostService, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.access$000(hamara.tunnel.vpn.service.vpn.Tunnel):hamara.tunnel.vpn.service.vpn.Tunnel$HostService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.access$000(hamara.tunnel.vpn.service.vpn.Tunnel):hamara.tunnel.vpn.service.vpn.Tunnel$HostService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):hamara.tunnel.vpn.service.vpn.Tunnel, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):hamara.tunnel.vpn.service.vpn.Tunnel, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):hamara.tunnel.vpn.service.vpn.Tunnel, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized hamara.tunnel.vpn.service.vpn.Tunnel newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel.HostService r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):hamara.tunnel.vpn.service.vpn.Tunnel, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):hamara.tunnel.vpn.service.vpn.Tunnel, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.newTunnel(hamara.tunnel.vpn.service.vpn.Tunnel$HostService):hamara.tunnel.vpn.service.vpn.Tunnel");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.routeThroughTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.routeThroughTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.routeThroughTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private boolean routeThroughTunnel(java.lang.String r1, java.lang.String[] r2, boolean r3, java.lang.String r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.routeThroughTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.routeThroughTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.routeThroughTunnel(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTun2Socks(android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTun2Socks(android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTun2Socks(android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void startTun2Socks(android.os.ParcelFileDescriptor r1, int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9, boolean r10) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTun2Socks(android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTun2Socks(android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.startTun2Socks(android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startVpn(boolean, java.lang.String[], java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startVpn(boolean, java.lang.String[], java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startVpn(boolean, java.lang.String[], java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private boolean startVpn(boolean r1, java.lang.String[] r2, java.lang.String[] r3, boolean r4, boolean r5, java.lang.String[] r6, boolean r7, boolean r8) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startVpn(boolean, java.lang.String[], java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startVpn(boolean, java.lang.String[], java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.startVpn(boolean, java.lang.String[], java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopRoutingThroughTunnel():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopRoutingThroughTunnel():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopRoutingThroughTunnel():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void stopRoutingThroughTunnel() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopRoutingThroughTunnel():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopRoutingThroughTunnel():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.stopRoutingThroughTunnel():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTun2Socks():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTun2Socks():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTun2Socks():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void stopTun2Socks() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTun2Socks():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTun2Socks():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.stopTun2Socks():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopVpn():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopVpn():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopVpn():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void stopVpn() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopVpn():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopVpn():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.stopVpn():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.clone():java.lang.Object, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.clone():java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.clone():java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Object clone() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.clone():java.lang.Object, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.clone():java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.clone():java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public synchronized boolean startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.startRouting(hamara.tunnel.vpn.service.vpn.TunnelVpnSettings):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTunneling(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTunneling(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTunneling(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public synchronized boolean startTunneling(java.lang.String r1, java.lang.String[] r2, boolean r3, java.lang.String r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTunneling(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.startTunneling(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.startTunneling(java.lang.String, java.lang.String[], boolean, java.lang.String, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stop():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stop():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stop():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public synchronized void stop() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stop():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stop():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.stop():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTunneling():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTunneling():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTunneling():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public synchronized void stopTunneling() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTunneling():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tunnel.stopTunneling():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tunnel.stopTunneling():void");
    }
}
