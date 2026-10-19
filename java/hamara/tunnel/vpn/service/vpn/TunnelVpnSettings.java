package hamara.tunnel.vpn.service.vpn;

import android.os.Parcelable;
import android.os.Parcelable.Creator;

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
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
public class TunnelVpnSettings implements Parcelable {
    public static final Creator<TunnelVpnSettings> CREATOR = null;
    public boolean bypass;
    public boolean mDnsForward;
    public String[] mDnsResolver;
    public boolean mEnableFilterApps;
    public String[] mExcludeIps;
    public String[] mFilterApps;
    public boolean mFilterBypassMode;
    public String mSocksServer;
    public boolean mTetheringSubnet;
    public boolean mUdpDnsRelay;
    public String mUdpResolver;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(android.os.Parcel):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(android.os.Parcel):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(android.os.Parcel):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public TunnelVpnSettings(android.os.Parcel r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(android.os.Parcel):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(android.os.Parcel):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(android.os.Parcel):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(java.lang.String, boolean, java.lang.String[], boolean, java.lang.String, java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(java.lang.String, boolean, java.lang.String[], boolean, java.lang.String, java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(java.lang.String, boolean, java.lang.String[], boolean, java.lang.String, java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public TunnelVpnSettings(java.lang.String r1, boolean r2, java.lang.String[] r3, boolean r4, java.lang.String r5, java.lang.String[] r6, boolean r7, boolean r8, java.lang.String[] r9, boolean r10, boolean r11) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(java.lang.String, boolean, java.lang.String[], boolean, java.lang.String, java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(java.lang.String, boolean, java.lang.String[], boolean, java.lang.String, java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.<init>(java.lang.String, boolean, java.lang.String[], boolean, java.lang.String, java.lang.String[], boolean, boolean, java.lang.String[], boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.describeContents():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.describeContents():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.describeContents():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public int describeContents() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.describeContents():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.describeContents():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.describeContents():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.writeToParcel(android.os.Parcel, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public void writeToParcel(android.os.Parcel r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.writeToParcel(android.os.Parcel, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.TunnelVpnSettings.writeToParcel(android.os.Parcel, int):void");
    }
}
