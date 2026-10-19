package com.google.android.play.core.hsdp.service;

import android.os.IBinder;
import java.util.Map;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public abstract class HsdpPrewarmRequest {

    public static abstract class Builder {
        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder.<init>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder.<init>():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public Builder() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder.<init>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder.<init>():void");
        }

        public abstract HsdpPrewarmRequest build();

        public abstract Builder setExtraQueryParams(Map<String, String> map);

        public abstract Builder setReferrer(String str);

        public abstract Builder setTargetAppPackageName(String str);

        public abstract Builder setWindowToken(IBinder iBinder);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.<init>():void, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public HsdpPrewarmRequest() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.<init>():void, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.builder():com.google.android.play.core.hsdp.service.HsdpPrewarmRequest$Builder, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.builder():com.google.android.play.core.hsdp.service.HsdpPrewarmRequest$Builder, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.builder():com.google.android.play.core.hsdp.service.HsdpPrewarmRequest$Builder, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.Builder builder() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.builder():com.google.android.play.core.hsdp.service.HsdpPrewarmRequest$Builder, dex: classes.dex in method: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.builder():com.google.android.play.core.hsdp.service.HsdpPrewarmRequest$Builder, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.hsdp.service.HsdpPrewarmRequest.builder():com.google.android.play.core.hsdp.service.HsdpPrewarmRequest$Builder");
    }

    public abstract Map<String, String> extraQueryParams();

    public abstract String referrer();

    public abstract String targetAppPackageName();

    public abstract IBinder windowToken();
}
