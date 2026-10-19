package hamara.tunnel.vpn.service.vpn;

import android.content.Context;
import android.os.ParcelFileDescriptor;
import defpackage.QU;
import java.io.File;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class Tun2Socks extends Thread implements QU {
    private static final String TAG = "Tun2Socks";
    private static final String TUN2SOCKS_BIN = "libtun2socks";
    private File fileTun2Socks;
    private Context mContext;
    private String mDnsResolverAddress;
    private OnTun2SocksListener mListener;
    private String mSocksServerAddress;
    private String mUdpgwServerAddress;
    private boolean mUdpgwTransparentDNS;
    private ParcelFileDescriptor mVpnInterfaceFileDescriptor;
    private int mVpnInterfaceMTU;
    private String mVpnIpAddress;
    private String mVpnNetMask;
    private Process tun2SocksProcess;

    public interface OnTun2SocksListener {
        void onStart();

        void onStop();
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.<init>(android.content.Context, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.<init>(android.content.Context, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.<init>(android.content.Context, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public Tun2Socks(android.content.Context r1, android.os.ParcelFileDescriptor r2, int r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7, java.lang.String r8, boolean r9) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.<init>(android.content.Context, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.<init>(android.content.Context, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tun2Socks.<init>(android.content.Context, android.os.ParcelFileDescriptor, int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.sendFd(android.os.ParcelFileDescriptor, java.io.File):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.sendFd(android.os.ParcelFileDescriptor, java.io.File):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.sendFd(android.os.ParcelFileDescriptor, java.io.File):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private boolean sendFd(android.os.ParcelFileDescriptor r1, java.io.File r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.sendFd(android.os.ParcelFileDescriptor, java.io.File):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.sendFd(android.os.ParcelFileDescriptor, java.io.File):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tun2Socks.sendFd(android.os.ParcelFileDescriptor, java.io.File):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.interrupt():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.interrupt():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.interrupt():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void interrupt() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.interrupt():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.interrupt():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tun2Socks.interrupt():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.onLine(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.onLine(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.onLine(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onLine(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.onLine(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.onLine(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tun2Socks.onLine(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.run():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.run():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void run() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.run():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tun2Socks.run():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks$OnTun2SocksListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks$OnTun2SocksListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks$OnTun2SocksListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks.OnTun2SocksListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks$OnTun2SocksListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Tun2Socks.setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks$OnTun2SocksListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Tun2Socks.setOnTun2SocksListener(hamara.tunnel.vpn.service.vpn.Tun2Socks$OnTun2SocksListener):void");
    }
}
