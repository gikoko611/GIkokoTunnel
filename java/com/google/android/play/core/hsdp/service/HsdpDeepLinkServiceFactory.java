package com.google.android.play.core.hsdp.service;

import androidx.annotation.Keep;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
@Keep
public final class HsdpDeepLinkServiceFactory {
    private static final String HPOA_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hpoa.service.HpoaService";
    private static final String HPOA_SERVICE_CLASS_NAME_FOR_TESTING = "com.google.android.play.core.hsdp.testapp.FakeHpoaService";
    private static final String HSDP_SERVICE_CLASS_NAME = "com.google.android.finsky.inlinedetails.hsdp.service.HsdpService";

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.<init>():void, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private HsdpDeepLinkServiceFactory() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.<init>():void, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @androidx.annotation.Keep
    public static com.google.android.play.core.hsdp.service.HsdpDeepLinkService create(android.app.Activity r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity):com.google.android.play.core.hsdp.service.HsdpDeepLinkService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @androidx.annotation.Keep
    public static com.google.android.play.core.hsdp.service.HsdpDeepLinkService create(android.app.Activity r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @androidx.annotation.Keep
    public static com.google.android.play.core.hsdp.service.HsdpDeepLinkService create(android.app.Activity r1, boolean r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.app.Activity, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.content.Context):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.content.Context):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.content.Context):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @androidx.annotation.Keep
    public static com.google.android.play.core.hsdp.service.HsdpDeepLinkService create(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.content.Context):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.content.Context):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.create(android.content.Context):com.google.android.play.core.hsdp.service.HsdpDeepLinkService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHpoaServiceIntent(android.content.Context, boolean):android.content.Intent, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHpoaServiceIntent(android.content.Context, boolean):android.content.Intent, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHpoaServiceIntent(android.content.Context, boolean):android.content.Intent, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private static android.content.Intent createHpoaServiceIntent(android.content.Context r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHpoaServiceIntent(android.content.Context, boolean):android.content.Intent, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHpoaServiceIntent(android.content.Context, boolean):android.content.Intent, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHpoaServiceIntent(android.content.Context, boolean):android.content.Intent");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent():android.content.Intent, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent():android.content.Intent, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent():android.content.Intent, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static android.content.Intent createHsdpServiceIntent() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent():android.content.Intent, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent():android.content.Intent, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createHsdpServiceIntent():android.content.Intent");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private static com.google.android.play.core.hsdp.service.HsdpDeepLinkService createInternal(android.content.Context r1, boolean r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.createInternal(android.content.Context, boolean, boolean):com.google.android.play.core.hsdp.service.HsdpDeepLinkService");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$0(android.content.Context, boolean):com.google.android.play.core.hsdp.service.zze, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$0(android.content.Context, boolean):com.google.android.play.core.hsdp.service.zze, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$0(android.content.Context, boolean):com.google.android.play.core.hsdp.service.zze, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ com.google.android.play.core.hsdp.service.zze lambda$createInternal$0(android.content.Context r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$0(android.content.Context, boolean):com.google.android.play.core.hsdp.service.zze, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$0(android.content.Context, boolean):com.google.android.play.core.hsdp.service.zze, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$0(android.content.Context, boolean):com.google.android.play.core.hsdp.service.zze");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$1(android.content.Context):com.google.android.play.core.hsdp.service.zzr, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$1(android.content.Context):com.google.android.play.core.hsdp.service.zzr, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$1(android.content.Context):com.google.android.play.core.hsdp.service.zzr, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ com.google.android.play.core.hsdp.service.zzr lambda$createInternal$1(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$1(android.content.Context):com.google.android.play.core.hsdp.service.zzr, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$1(android.content.Context):com.google.android.play.core.hsdp.service.zzr, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpDeepLinkServiceFactory.lambda$createInternal$1(android.content.Context):com.google.android.play.core.hsdp.service.zzr");
    }
}
