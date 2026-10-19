package hamara.tunnel.vpn.service.vpn.logger;

import android.content.Intent;
import java.util.LinkedList;
import java.util.Vector;

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
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class SkStatus {
    static final int MAXLOGENTRIES = 1000;
    public static final String SSH_AUTHENTICATING = "AUTHENTICATING";
    public static final String SSH_CONNECTED = "CONNECTED";
    public static final String SSH_CONNECTING = "CONNECTING";
    public static final String SSH_DISCONNECTED = "DISCONNECTED";
    public static final String SSH_RECONECTANDO = "RECONECTANDO";
    public static final String SSH_STARTING = "STARTING";
    public static final String SSH_STOPPING = "STOPPING";
    public static final String SSH_WAITING = "WAITING";
    private static Vector<LogListener> logListener;
    private static final LinkedList<LogItem> logbuffer = null;
    private static Intent mLastIntent;
    private static ConnectionStatus mLastLevel;
    private static int mLastStateresid;
    private static String mLaststate;
    private static String mLaststatemsg;
    private static Vector<StateListener> stateListener;

    /* renamed from: hamara.tunnel.vpn.service.vpn.logger.SkStatus$1 */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$hamara$tunnel$vpn$service$vpn$logger$ConnectionStatus = null;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.1.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.1.<clinit>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.1.<clinit>():void, dex: classes.dex
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
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.1.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.1.<clinit>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.1.<clinit>():void");
        }
    }

    /* DevToolsApp ERROR: NullPointerException in pass: b
        java.lang.NullPointerException: Attempt to invoke interface method 'java.lang.Object java.util.List.get(int)' on a null object reference
        	at U4.b.f(SourceFile:1152)
        	at androidx.work.D.T(SourceFile:1)
        	at androidx.work.D.T(SourceFile:27)
        	at n1.c.u(SourceFile:42)
        	at C4.c.run(SourceFile:73)
        */
    public enum LogLevel {
        ;
        
        protected int mValue;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<clinit>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<clinit>():void, dex: classes.dex
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
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<clinit>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<clinit>():void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<init>(java.lang.String, int, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<init>(java.lang.String, int, int):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<init>(java.lang.String, int, int):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        private LogLevel(int r3) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<init>(java.lang.String, int, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<init>(java.lang.String, int, int):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.<init>(java.lang.String, int, int):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getEnumByValue(int):hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getEnumByValue(int):hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getEnumByValue(int):hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public static hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel getEnumByValue(int r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getEnumByValue(int):hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getEnumByValue(int):hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getEnumByValue(int):hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getInt():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getInt():int, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getInt():int, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public int getInt() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getInt():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getInt():int, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel.getInt():int");
        }
    }

    public interface LogListener {
        void newLog(LogItem logItem);

        void onClear();
    }

    public interface StateListener {
        void updateState(String str, String str2, int i, ConnectionStatus connectionStatus, Intent intent);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<init>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public SkStatus() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<init>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus.StateListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.addStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.clearLog():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.clearLog():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.clearLog():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void clearLog() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.clearLog():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.clearLog():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.clearLog():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastCleanLogMessage(android.content.Context):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastCleanLogMessage(android.content.Context):java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastCleanLogMessage(android.content.Context):java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static java.lang.String getLastCleanLogMessage(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastCleanLogMessage(android.content.Context):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastCleanLogMessage(android.content.Context):java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastCleanLogMessage(android.content.Context):java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastState():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastState():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastState():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static java.lang.String getLastState() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastState():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastState():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLastState():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLevel(java.lang.String):hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLevel(java.lang.String):hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLevel(java.lang.String):hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private static hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus getLevel(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLevel(java.lang.String):hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLevel(java.lang.String):hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLevel(java.lang.String):hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLocalizedState(java.lang.String):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLocalizedState(java.lang.String):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLocalizedState(java.lang.String):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static int getLocalizedState(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLocalizedState(java.lang.String):int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLocalizedState(java.lang.String):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getLocalizedState(java.lang.String):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getlogbuffer():hamara.tunnel.vpn.service.vpn.logger.LogItem[], dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getlogbuffer():hamara.tunnel.vpn.service.vpn.logger.LogItem[], dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getlogbuffer():hamara.tunnel.vpn.service.vpn.logger.LogItem[], dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized hamara.tunnel.vpn.service.vpn.logger.LogItem[] getlogbuffer() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getlogbuffer():hamara.tunnel.vpn.service.vpn.logger.LogItem[], dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getlogbuffer():hamara.tunnel.vpn.service.vpn.logger.LogItem[], dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.getlogbuffer():hamara.tunnel.vpn.service.vpn.logger.LogItem[]");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.isTunnelActive():boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.isTunnelActive():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.isTunnelActive():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static boolean isTunnelActive() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.isTunnelActive():boolean, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.isTunnelActive():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.isTunnelActive():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(int, java.lang.Object[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(int, java.lang.Object[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logDebug(int r1, java.lang.Object... r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(int, java.lang.Object[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(int, java.lang.Object[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logDebug(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logDebug(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logError(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int, java.lang.Object[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int, java.lang.Object[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logError(int r1, java.lang.Object... r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int, java.lang.Object[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(int, java.lang.Object[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logError(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logError(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String, java.lang.Exception):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String, java.lang.Exception):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String, java.lang.Exception):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel r1, java.lang.String r2, java.lang.Exception r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String, java.lang.Exception):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String, java.lang.Exception):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String, java.lang.Exception):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.Exception):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.Exception):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.Exception):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logException(java.lang.Exception r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.Exception):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.Exception):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.Exception):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.String, java.lang.Exception):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.String, java.lang.Exception):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.String, java.lang.Exception):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logException(java.lang.String r1, java.lang.Exception r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.String, java.lang.Exception):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.String, java.lang.Exception):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logException(java.lang.String, java.lang.Exception):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(int, java.lang.Object[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(int, java.lang.Object[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logInfo(int r1, java.lang.Object... r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(int, java.lang.Object[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(int, java.lang.Object[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logInfo(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInfo(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInformation():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInformation():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInformation():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private static void logInformation() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInformation():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInformation():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logInformation():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(int, java.lang.Object[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(int, java.lang.Object[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logWarning(int r1, java.lang.Object... r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(int, java.lang.Object[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(int, java.lang.Object[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void logWarning(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.logWarning(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem, boolean):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.newLogItem(hamara.tunnel.vpn.service.vpn.logger.LogItem, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeLogListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus.StateListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.removeStateListener(hamara.tunnel.vpn.service.vpn.logger.SkStatus$StateListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static void updateStateString(java.lang.String r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void updateStateString(java.lang.String r1, java.lang.String r2, int r3, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, android.content.Intent):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, android.content.Intent):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, android.content.Intent):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static synchronized void updateStateString(java.lang.String r1, java.lang.String r2, int r3, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus r4, android.content.Intent r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, android.content.Intent):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, android.content.Intent):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.SkStatus.updateStateString(java.lang.String, java.lang.String, int, hamara.tunnel.vpn.service.vpn.logger.ConnectionStatus, android.content.Intent):void");
    }
}
