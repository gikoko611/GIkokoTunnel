package hamara.tunnel.vpn.service.vpn.logger;

import android.os.Parcelable;
import android.os.Parcelable.Creator;
import hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:36)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class LogItem implements Parcelable {
    public static final Creator<LogItem> CREATOR = null;
    private long logtime;
    private Object[] mArgs;
    LogLevel mLevel;
    private String mMessage;
    private int mResourceId;
    private int mVerbosityLevel;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<clinit>():void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(int, java.lang.Object[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(int, java.lang.Object[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public LogItem(int r1, java.lang.Object... r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(int, java.lang.Object[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(int, java.lang.Object[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(android.os.Parcel):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(android.os.Parcel):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(android.os.Parcel):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public LogItem(android.os.Parcel r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(android.os.Parcel):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(android.os.Parcel):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(android.os.Parcel):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public LogItem(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public LogItem(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel r1, int r2, java.lang.String r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.Object[]):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.Object[]):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public LogItem(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel r1, int r2, java.lang.Object... r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.Object[]):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.Object[]):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, int, java.lang.Object[]):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public LogItem(hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.<init>(hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.join(java.lang.CharSequence, java.lang.Object[]):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.join(java.lang.CharSequence, java.lang.Object[]):java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.join(java.lang.CharSequence, java.lang.Object[]):java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static java.lang.String join(java.lang.CharSequence r1, java.lang.Object[] r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.join(java.lang.CharSequence, java.lang.Object[]):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.join(java.lang.CharSequence, java.lang.Object[]):java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.join(java.lang.CharSequence, java.lang.Object[]):java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.describeContents():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.describeContents():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.describeContents():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int describeContents() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.describeContents():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.describeContents():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.describeContents():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogLevel():hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogLevel():hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogLevel():hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public hamara.tunnel.vpn.service.vpn.logger.SkStatus.LogLevel getLogLevel() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogLevel():hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogLevel():hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogLevel():hamara.tunnel.vpn.service.vpn.logger.SkStatus$LogLevel");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogtime():long, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogtime():long, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogtime():long, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public long getLogtime() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogtime():long, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogtime():long, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.getLogtime():long");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getMessage():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getMessage():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getMessage():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getMessage() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getMessage():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getMessage():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.getMessage():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getString(android.content.Context):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getString(android.content.Context):java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getString(android.content.Context):java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getString(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getString(android.content.Context):java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getString(android.content.Context):java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.getString(android.content.Context):java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getVerbosityLevel():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getVerbosityLevel():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getVerbosityLevel():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getVerbosityLevel() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getVerbosityLevel():int, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.getVerbosityLevel():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.getVerbosityLevel():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.toString():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.toString():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.toString():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String toString() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.toString():java.lang.String, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.toString():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.toString():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.writeToParcel(android.os.Parcel, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void writeToParcel(android.os.Parcel r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.writeToParcel(android.os.Parcel, int):void, dex: classes.dex in method: hamara.tunnel.vpn.service.vpn.logger.LogItem.writeToParcel(android.os.Parcel, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: hamara.tunnel.vpn.service.vpn.logger.LogItem.writeToParcel(android.os.Parcel, int):void");
    }
}
