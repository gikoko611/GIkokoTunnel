package ads_mobile_sdk;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
public final class zi0 extends ContentObserver {
    public final Handler a;
    public final Context b;
    public final AudioManager c;
    public final C0051Bq d;
    public final i72 e;
    public final AtomicReference f;
    public final AtomicBoolean g;
    public final ExecutorService h;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.zi0.<init>(android.os.Handler, android.content.Context, Bq, ads_mobile_sdk.i72):void, dex: classes.dex in method: ads_mobile_sdk.zi0.<init>(android.os.Handler, android.content.Context, Bq, ads_mobile_sdk.i72):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.zi0.<init>(android.os.Handler, android.content.Context, Bq, ads_mobile_sdk.i72):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public zi0(android.os.Handler r1, android.content.Context r2, C0051Bq r3, ads_mobile_sdk.i72 r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.zi0.<init>(android.os.Handler, android.content.Context, Bq, ads_mobile_sdk.i72):void, dex: classes.dex in method: ads_mobile_sdk.zi0.<init>(android.os.Handler, android.content.Context, Bq, ads_mobile_sdk.i72):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zi0.<init>(android.os.Handler, android.content.Context, Bq, ads_mobile_sdk.i72):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.zi0.onChange(boolean):void, dex: classes.dex in method: ads_mobile_sdk.zi0.onChange(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.zi0.onChange(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void onChange(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.zi0.onChange(boolean):void, dex: classes.dex in method: ads_mobile_sdk.zi0.onChange(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zi0.onChange(boolean):void");
    }
}
