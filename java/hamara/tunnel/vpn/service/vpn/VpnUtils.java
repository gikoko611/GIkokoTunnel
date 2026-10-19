package hamara.tunnel.vpn.service.vpn;

import java.util.regex.Pattern;

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
public class VpnUtils {
    private static final String DEFAULT_PRIMARY_DNS_SERVER = "8.8.8.8";
    private static final String DEFAULT_SECONDARY_DNS_SERVER = "1.1.0.0";
    private static final Pattern IPV4_PATTERN = null;
    private static final Pattern IPV6_HEX_COMPRESSED_PATTERN = null;
    private static final Pattern IPV6_STD_PATTERN = null;

    public static class PrivateAddress {
        public final String mIpAddress;
        public final int mPrefixLength;
        public final String mRouter;
        public final String mSubnet;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress.<init>(java.lang.String, java.lang.String, int, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress.<init>(java.lang.String, java.lang.String, int, java.lang.String):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at n1.c.u(SourceFile:83)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress.<init>(java.lang.String, java.lang.String, int, java.lang.String):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 5 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 6 more
            */
        public PrivateAddress(java.lang.String r1, java.lang.String r2, int r3, java.lang.String r4) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress.<init>(java.lang.String, java.lang.String, int, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress.<init>(java.lang.String, java.lang.String, int, java.lang.String):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress.<init>(java.lang.String, java.lang.String, int, java.lang.String):void");
        }
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<init>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public VpnUtils() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<init>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findAvailablePort(int, int):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findAvailablePort(int, int):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findAvailablePort(int, int):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static int findAvailablePort(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findAvailablePort(int, int):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findAvailablePort(int, int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.findAvailablePort(int, int):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findProcessId(java.lang.String):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findProcessId(java.lang.String):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findProcessId(java.lang.String):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static int findProcessId(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findProcessId(java.lang.String):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.findProcessId(java.lang.String):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.findProcessId(java.lang.String):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolver(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolver(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolver(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static java.util.List<java.lang.String> getActiveNetworkDnsResolver(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolver(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolver(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolver(android.content.Context):java.util.List<java.lang.String>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolvers(android.content.Context):java.util.Collection<java.net.InetAddress>, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolvers(android.content.Context):java.util.Collection<java.net.InetAddress>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolvers(android.content.Context):java.util.Collection<java.net.InetAddress>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    private static java.util.Collection<java.net.InetAddress> getActiveNetworkDnsResolvers(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolvers(android.content.Context):java.util.Collection<java.net.InetAddress>, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolvers(android.content.Context):java.util.Collection<java.net.InetAddress>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.getActiveNetworkDnsResolvers(android.content.Context):java.util.Collection<java.net.InetAddress>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getNetworkDnsServer(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getNetworkDnsServer(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getNetworkDnsServer(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static java.util.List<java.lang.String> getNetworkDnsServer(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getNetworkDnsServer(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.getNetworkDnsServer(android.content.Context):java.util.List<java.lang.String>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.getNetworkDnsServer(android.content.Context):java.util.List<java.lang.String>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv4Address(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv4Address(java.lang.String):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv4Address(java.lang.String):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static boolean isIPv4Address(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv4Address(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv4Address(java.lang.String):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv4Address(java.lang.String):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6Address(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6Address(java.lang.String):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6Address(java.lang.String):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static boolean isIPv6Address(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6Address(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6Address(java.lang.String):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6Address(java.lang.String):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6HexCompressedAddress(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6HexCompressedAddress(java.lang.String):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6HexCompressedAddress(java.lang.String):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static boolean isIPv6HexCompressedAddress(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6HexCompressedAddress(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6HexCompressedAddress(java.lang.String):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6HexCompressedAddress(java.lang.String):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6StdAddress(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6StdAddress(java.lang.String):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6StdAddress(java.lang.String):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static boolean isIPv6StdAddress(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6StdAddress(java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6StdAddress(java.lang.String):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.isIPv6StdAddress(java.lang.String):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isPortAvailable(int):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isPortAvailable(int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isPortAvailable(int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    private static boolean isPortAvailable(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isPortAvailable(int):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.isPortAvailable(int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.isPortAvailable(int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File, java.lang.String):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File, java.lang.String):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File, java.lang.String):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static int killProcess(java.io.File r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File, java.lang.String):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File, java.lang.String):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File, java.lang.String):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static void killProcess(java.io.File r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.io.File):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.lang.String, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.lang.String, java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.lang.String, java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static void killProcess(java.lang.String r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.lang.String, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.lang.String, java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.killProcess(java.lang.String, java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.selectPrivateAddress():hamara.tunnel.vpn.service.vpn.VpnUtils$PrivateAddress, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.selectPrivateAddress():hamara.tunnel.vpn.service.vpn.VpnUtils$PrivateAddress, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.selectPrivateAddress():hamara.tunnel.vpn.service.vpn.VpnUtils$PrivateAddress, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public static hamara.tunnel.vpn.service.vpn.VpnUtils.PrivateAddress selectPrivateAddress() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.VpnUtils.selectPrivateAddress():hamara.tunnel.vpn.service.vpn.VpnUtils$PrivateAddress, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.VpnUtils.selectPrivateAddress():hamara.tunnel.vpn.service.vpn.VpnUtils$PrivateAddress, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.VpnUtils.selectPrivateAddress():hamara.tunnel.vpn.service.vpn.VpnUtils$PrivateAddress");
    }
}
