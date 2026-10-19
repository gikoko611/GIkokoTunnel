package ads_mobile_sdk;

import defpackage.Qb0;

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
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public final class h70 extends ku0 {
    private static final h70 DEFAULT_INSTANCE = null;
    public static final int c = 1;
    public static final int d = 9;
    public static final int e = 2;
    public static final int f = 3;
    public static final int g = 4;
    public static final int h = 5;
    public static final int i = 6;
    public static final int j = 7;
    public static final int k = 8;
    public static final int l = 10;
    public static final int m = 11;
    public static final int n = 12;
    public static final int o = 13;
    public static final int p = 14;
    private int bitField0_;
    private Qb0 ipAddresses_;
    private boolean isRetargeting_;
    private boolean isSubframeReferrerUrlRemoved_;
    private boolean isSubframeUrlRemoved_;
    private boolean isUrlRemovedByPolicy_;
    private String mainFrameUrl_;
    private boolean maybeLaunchedByExternalApplication_;
    private int navigationInitiation_;
    private double navigationTimeMsec_;
    private String referrerMainFrameUrl_;
    private String referrerUrl_;
    private Qb0 serverRedirectChain_;
    private int type_;
    private String url_;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.h70.<clinit>():void, dex: classes.dex in method: ads_mobile_sdk.h70.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.h70.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.h70.<clinit>():void, dex: classes.dex in method: ads_mobile_sdk.h70.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h70.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.h70.<init>():void, dex: classes.dex in method: ads_mobile_sdk.h70.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.h70.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public h70() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.h70.<init>():void, dex: classes.dex in method: ads_mobile_sdk.h70.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h70.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.h70.a(int, ads_mobile_sdk.ku0):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.h70.a(int, ads_mobile_sdk.ku0):java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.h70.a(int, ads_mobile_sdk.ku0):java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final java.lang.Object a(int r1, ads_mobile_sdk.ku0 r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.h70.a(int, ads_mobile_sdk.ku0):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.h70.a(int, ads_mobile_sdk.ku0):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.h70.a(int, ads_mobile_sdk.ku0):java.lang.Object");
    }
}
