package ads_mobile_sdk;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import java.util.concurrent.atomic.AtomicReference;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
public final class ng {
    public final Context a;
    public final i41 b;
    public final ApplicationInfo c;
    public final AtomicReference d;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.ng.<init>(android.content.Context, ads_mobile_sdk.i41):void, dex: classes.dex in method: ads_mobile_sdk.ng.<init>(android.content.Context, ads_mobile_sdk.i41):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.ng.<init>(android.content.Context, ads_mobile_sdk.i41):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public ng(android.content.Context r1, ads_mobile_sdk.i41 r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.ng.<init>(android.content.Context, ads_mobile_sdk.i41):void, dex: classes.dex in method: ads_mobile_sdk.ng.<init>(android.content.Context, ads_mobile_sdk.i41):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.ng.<init>(android.content.Context, ads_mobile_sdk.i41):void");
    }
}
