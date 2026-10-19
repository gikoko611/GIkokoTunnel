package com.google.android.recaptcha;

import org.jetbrains.annotations.NotNull;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'int java.util.List.size()' on a null object reference
    	at C0.b.accept(SourceFile:265)
    	at r1.b.h(SourceFile:17)
    	at U4.b.f(SourceFile:2025)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public final class RecaptchaException extends Exception {
    @NotNull
    private final RecaptchaErrorCode errorCode;
    @NotNull
    private final String errorMessage;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String):void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode r1, java.lang.String r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String):void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String, int, Pj):void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String, int, Pj):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String, int, Pj):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public /* synthetic */ RecaptchaException(com.google.android.recaptcha.RecaptchaErrorCode r1, java.lang.String r2, int r3, C0496Pj r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String, int, Pj):void, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String, int, Pj):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.RecaptchaException.<init>(com.google.android.recaptcha.RecaptchaErrorCode, java.lang.String, int, Pj):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.getErrorCode():com.google.android.recaptcha.RecaptchaErrorCode, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.getErrorCode():com.google.android.recaptcha.RecaptchaErrorCode, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.getErrorCode():com.google.android.recaptcha.RecaptchaErrorCode, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @org.jetbrains.annotations.NotNull
    public final com.google.android.recaptcha.RecaptchaErrorCode getErrorCode() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.getErrorCode():com.google.android.recaptcha.RecaptchaErrorCode, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.getErrorCode():com.google.android.recaptcha.RecaptchaErrorCode, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.RecaptchaException.getErrorCode():com.google.android.recaptcha.RecaptchaErrorCode");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.getErrorMessage():java.lang.String, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.getErrorMessage():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.getErrorMessage():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getErrorMessage() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.recaptcha.RecaptchaException.getErrorMessage():java.lang.String, dex: classes.dex in method: com.google.android.recaptcha.RecaptchaException.getErrorMessage():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.recaptcha.RecaptchaException.getErrorMessage():java.lang.String");
    }
}
