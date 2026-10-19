package com.google.android.play.core.appupdate;

import com.google.android.play.core.install.model.AppUpdateType;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public abstract class AppUpdateOptions {

    public static abstract class Builder {
        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.Builder.<init>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.Builder.<init>():void, dex: classes.dex
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
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.Builder.<init>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateOptions.Builder.<init>():void");
        }

        public abstract AppUpdateOptions build();

        public abstract Builder setAllowAssetPackDeletion(boolean z);

        public abstract Builder setAppUpdateType(@AppUpdateType int i);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.<init>():void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public AppUpdateOptions() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.<init>():void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateOptions.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(int):com.google.android.play.core.appupdate.AppUpdateOptions, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(int):com.google.android.play.core.appupdate.AppUpdateOptions, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(int):com.google.android.play.core.appupdate.AppUpdateOptions, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static com.google.android.play.core.appupdate.AppUpdateOptions defaultOptions(@com.google.android.play.core.install.model.AppUpdateType int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(int):com.google.android.play.core.appupdate.AppUpdateOptions, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(int):com.google.android.play.core.appupdate.AppUpdateOptions, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateOptions.defaultOptions(int):com.google.android.play.core.appupdate.AppUpdateOptions");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(int):com.google.android.play.core.appupdate.AppUpdateOptions$Builder, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(int):com.google.android.play.core.appupdate.AppUpdateOptions$Builder, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(int):com.google.android.play.core.appupdate.AppUpdateOptions$Builder, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static com.google.android.play.core.appupdate.AppUpdateOptions.Builder newBuilder(@com.google.android.play.core.install.model.AppUpdateType int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(int):com.google.android.play.core.appupdate.AppUpdateOptions$Builder, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(int):com.google.android.play.core.appupdate.AppUpdateOptions$Builder, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateOptions.newBuilder(int):com.google.android.play.core.appupdate.AppUpdateOptions$Builder");
    }

    public abstract boolean allowAssetPackDeletion();

    @AppUpdateType
    public abstract int appUpdateType();
}
