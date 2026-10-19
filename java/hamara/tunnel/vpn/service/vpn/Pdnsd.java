package hamara.tunnel.vpn.service.vpn;

import android.content.Context;
import defpackage.QU;
import java.io.File;

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
public class Pdnsd extends Thread {
    private static final String PDNSD_BIN = "libpdnsd";
    private static final String PDNSD_SERVER = "server {\n label= \"%1$s\";\n ip = %2$s;\n port = %3$d;\n uptest = none;\n }\n";
    private static final String PDNSD_SERVER_TEST = "server {\n label= \"%1$s\";\n ip = %2$s;\n port = %3$d;\n reject = ::/0;\n reject_policy = negate;\n reject_recursively = on;\n timeout = 5;\n }\n";
    private static final String TAG = "PdnsdThread";
    private File filePdnsd;
    private Context mContext;
    private String[] mDnsHosts;
    private int mDnsPort;
    private String mPdnsdHost;
    private int mPdnsdPort;
    private Process mProcess;

    /* renamed from: hamara.tunnel.vpn.service.vpn.Pdnsd$1 */
    public class AnonymousClass1 implements QU {
        final /* synthetic */ Pdnsd this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.<init>(hamara.tunnel.vpn.service.vpn.Pdnsd):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.<init>(hamara.tunnel.vpn.service.vpn.Pdnsd):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.<init>(hamara.tunnel.vpn.service.vpn.Pdnsd):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass1(hamara.tunnel.vpn.service.vpn.Pdnsd r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.<init>(hamara.tunnel.vpn.service.vpn.Pdnsd):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.<init>(hamara.tunnel.vpn.service.vpn.Pdnsd):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.1.<init>(hamara.tunnel.vpn.service.vpn.Pdnsd):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.onLine(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.onLine(java.lang.String):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.onLine(java.lang.String):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onLine(java.lang.String r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.onLine(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.1.onLine(java.lang.String):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.1.onLine(java.lang.String):void");
        }
    }

    public interface OnPdnsdListener {
        void onStart();

        void onStop();
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.<init>(android.content.Context, java.lang.String[], int, java.lang.String, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.<init>(android.content.Context, java.lang.String[], int, java.lang.String, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.<init>(android.content.Context, java.lang.String[], int, java.lang.String, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public Pdnsd(android.content.Context r1, java.lang.String[] r2, int r3, java.lang.String r4, int r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.<init>(android.content.Context, java.lang.String[], int, java.lang.String, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.<init>(android.content.Context, java.lang.String[], int, java.lang.String, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.<init>(android.content.Context, java.lang.String[], int, java.lang.String, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.makePdnsdConf(java.io.File, java.lang.String[], int, java.lang.String, int):java.io.File, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.makePdnsdConf(java.io.File, java.lang.String[], int, java.lang.String, int):java.io.File, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.makePdnsdConf(java.io.File, java.lang.String[], int, java.lang.String, int):java.io.File, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private java.io.File makePdnsdConf(java.io.File r1, java.lang.String[] r2, int r3, java.lang.String r4, int r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.makePdnsdConf(java.io.File, java.lang.String[], int, java.lang.String, int):java.io.File, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.makePdnsdConf(java.io.File, java.lang.String[], int, java.lang.String, int):java.io.File, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.makePdnsdConf(java.io.File, java.lang.String[], int, java.lang.String, int):java.io.File");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.readFromRaw(android.content.Context, int):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.readFromRaw(android.content.Context, int):java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.readFromRaw(android.content.Context, int):java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static java.lang.String readFromRaw(android.content.Context r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.readFromRaw(android.content.Context, int):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.readFromRaw(android.content.Context, int):java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.readFromRaw(android.content.Context, int):java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.saveTextFile(java.io.File, java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.saveTextFile(java.io.File, java.lang.String):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.saveTextFile(java.io.File, java.lang.String):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static boolean saveTextFile(java.io.File r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.saveTextFile(java.io.File, java.lang.String):boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.saveTextFile(java.io.File, java.lang.String):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.saveTextFile(java.io.File, java.lang.String):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.interrupt():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.interrupt():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.interrupt():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public synchronized void interrupt() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.interrupt():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.interrupt():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.interrupt():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.run():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.run():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.Pdnsd.run():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.Pdnsd.run():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.Pdnsd.run():void");
    }
}
