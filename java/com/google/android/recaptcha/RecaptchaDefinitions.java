package com.google.android.recaptcha;

import org.jetbrains.annotations.NotNull;

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
public final class RecaptchaDefinitions {
    public static final long DEFAULT_TIMEOUT_EXECUTE = 10000;
    public static final long DEFAULT_TIMEOUT_INIT = 10000;
    @NotNull
    public static final RecaptchaDefinitions INSTANCE = null;
    public static final long MIN_TIMEOUT_EXECUTE = 5000;
    public static final long MIN_TIMEOUT_INIT = 5000;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaDefinitions.<clinit>():void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaDefinitions.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaDefinitions.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaDefinitions.<clinit>():void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaDefinitions.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.RecaptchaDefinitions.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaDefinitions.<init>():void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaDefinitions.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaDefinitions.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private RecaptchaDefinitions() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaDefinitions.<init>():void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaDefinitions.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.RecaptchaDefinitions.<init>():void");
    }
}
