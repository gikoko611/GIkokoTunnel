package com.google.android.play.core.integrity;

import android.app.Activity;
import com.google.android.gms.tasks.Task;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public interface StandardIntegrityManager {

    public static abstract class PrepareIntegrityTokenRequest {

        public static abstract class Builder {
            /* DevToolsApp ERROR: Method load error
                g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex
                	at O4.o.y(SourceFile:95)
                	at O4.b.v(SourceFile:19)
                	at O4.b.v(SourceFile:55)
                	at O4.b.v(SourceFile:55)
                	at n1.c.u(SourceFile:19)
                	at C4.c.run(SourceFile:73)
                Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex
                	at v0.s.u(SourceFile:75)
                	at O4.o.y(SourceFile:40)
                	... 5 more
                Caused by: com.android.dex.DexException: bogus element_width: 0000
                	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
                	at v0.s.u(SourceFile:53)
                	... 6 more
                */
            public Builder() {
                /*
                // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder.<init>():void");
            }

            public abstract PrepareIntegrityTokenRequest build();

            public abstract Builder setCloudProjectNumber(long j);
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.<init>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.<init>():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public PrepareIntegrityTokenRequest() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.<init>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.<init>():void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public static com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.Builder builder() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.PrepareIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$PrepareIntegrityTokenRequest$Builder");
        }

        public abstract int a();

        public abstract long b();
    }

    public static abstract class StandardIntegrityToken {
        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken.<init>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken.<init>():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public StandardIntegrityToken() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken.<init>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityToken.<init>():void");
        }

        public abstract Task<Integer> showDialog(Activity activity, int i);

        public abstract String token();
    }

    public interface StandardIntegrityTokenProvider {
        Task<StandardIntegrityToken> request(StandardIntegrityTokenRequest standardIntegrityTokenRequest);
    }

    public static abstract class StandardIntegrityTokenRequest {

        public static abstract class Builder {
            /* DevToolsApp ERROR: Method load error
                g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex
                	at O4.o.y(SourceFile:95)
                	at O4.b.v(SourceFile:19)
                	at O4.b.v(SourceFile:55)
                	at O4.b.v(SourceFile:55)
                	at n1.c.u(SourceFile:19)
                	at C4.c.run(SourceFile:73)
                Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex
                	at v0.s.u(SourceFile:75)
                	at O4.o.y(SourceFile:40)
                	... 5 more
                Caused by: com.android.dex.DexException: bogus element_width: 0000
                	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
                	at v0.s.u(SourceFile:53)
                	... 6 more
                */
            public Builder() {
                /*
                // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder.<init>():void, dex: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder.<init>():void");
            }

            public abstract StandardIntegrityTokenRequest build();

            public abstract Builder setRequestHash(String str);
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.<init>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.<init>():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public StandardIntegrityTokenRequest() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.<init>():void, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.<init>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.<init>():void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public static com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.Builder builder() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder, dex: classes.dex in method: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.integrity.StandardIntegrityManager.StandardIntegrityTokenRequest.builder():com.google.android.play.core.integrity.StandardIntegrityManager$StandardIntegrityTokenRequest$Builder");
        }

        public abstract String a();
    }

    Task<StandardIntegrityTokenProvider> prepareIntegrityToken(PrepareIntegrityTokenRequest prepareIntegrityTokenRequest);
}
