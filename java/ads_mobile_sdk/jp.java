package ads_mobile_sdk;

import android.content.Context;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.view.ViewTreeObserver.OnScrollChangedListener;
import defpackage.Na0;
import defpackage.Ug;
import defpackage.l50;
import defpackage.l90;
import java.lang.ref.WeakReference;

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
public abstract class jp implements OnAttachStateChangeListener, OnGlobalLayoutListener, OnScrollChangedListener, l50, l90 {
    public static final long p = 0;
    public final Context a;
    public final Ug b;
    public final C0954n90 c;
    public final kj0 d;
    public final Na0 e;
    public final qr0 f;
    public final av2 g;
    public final g0 h;
    public View i;
    public boolean j;
    public WeakReference k;
    public int l;
    public long m;
    public Boolean n;
    public fp o;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.<clinit>():void, dex: classes.dex in method: ads_mobile_sdk.jp.<clinit>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.<clinit>():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.<clinit>():void, dex: classes.dex in method: ads_mobile_sdk.jp.<clinit>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.<clinit>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.<init>(android.content.Context, Ug, n90, ads_mobile_sdk.kj0, Na0, ads_mobile_sdk.qr0, ads_mobile_sdk.av2, ads_mobile_sdk.g0, ads_mobile_sdk.a2):void, dex: classes.dex in method: ads_mobile_sdk.jp.<init>(android.content.Context, Ug, n90, ads_mobile_sdk.kj0, Na0, ads_mobile_sdk.qr0, ads_mobile_sdk.av2, ads_mobile_sdk.g0, ads_mobile_sdk.a2):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.<init>(android.content.Context, Ug, n90, ads_mobile_sdk.kj0, Na0, ads_mobile_sdk.qr0, ads_mobile_sdk.av2, ads_mobile_sdk.g0, ads_mobile_sdk.a2):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public jp(android.content.Context r1, defpackage.Ug r2, C0954n90 r3, ads_mobile_sdk.kj0 r4, defpackage.Na0 r5, ads_mobile_sdk.qr0 r6, ads_mobile_sdk.av2 r7, ads_mobile_sdk.g0 r8, ads_mobile_sdk.a2 r9) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.<init>(android.content.Context, Ug, n90, ads_mobile_sdk.kj0, Na0, ads_mobile_sdk.qr0, ads_mobile_sdk.av2, ads_mobile_sdk.g0, ads_mobile_sdk.a2):void, dex: classes.dex in method: ads_mobile_sdk.jp.<init>(android.content.Context, Ug, n90, ads_mobile_sdk.kj0, Na0, ads_mobile_sdk.qr0, ads_mobile_sdk.av2, ads_mobile_sdk.g0, ads_mobile_sdk.a2):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.<init>(android.content.Context, Ug, n90, ads_mobile_sdk.kj0, Na0, ads_mobile_sdk.qr0, ads_mobile_sdk.av2, ads_mobile_sdk.g0, ads_mobile_sdk.a2):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(ads_mobile_sdk.jp, ads_mobile_sdk.pn3, vg):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.jp.a(ads_mobile_sdk.jp, ads_mobile_sdk.pn3, vg):java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(ads_mobile_sdk.jp, ads_mobile_sdk.pn3, vg):java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static final java.lang.Object a(ads_mobile_sdk.jp r1, ads_mobile_sdk.pn3 r2, defpackage.vg r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(ads_mobile_sdk.jp, ads_mobile_sdk.pn3, vg):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.jp.a(ads_mobile_sdk.jp, ads_mobile_sdk.pn3, vg):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.a(ads_mobile_sdk.jp, ads_mobile_sdk.pn3, vg):java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(android.app.Activity, int):void, dex: classes.dex in method: ads_mobile_sdk.jp.a(android.app.Activity, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(android.app.Activity, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void a(android.app.Activity r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(android.app.Activity, int):void, dex: classes.dex in method: ads_mobile_sdk.jp.a(android.app.Activity, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.a(android.app.Activity, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.a(android.view.View):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(android.view.View):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void a(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.a(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.a(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.a(android.view.View):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(long, vg):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.jp.b(long, vg):java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(long, vg):java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final java.lang.Object b(long r1, defpackage.vg r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(long, vg):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.jp.b(long, vg):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.b(long, vg):java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b():void, dex: classes.dex in method: ads_mobile_sdk.jp.b():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void b() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b():void, dex: classes.dex in method: ads_mobile_sdk.jp.b():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.b():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(ads_mobile_sdk.pn3):void, dex: classes.dex in method: ads_mobile_sdk.jp.b(ads_mobile_sdk.pn3):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(ads_mobile_sdk.pn3):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void b(ads_mobile_sdk.pn3 r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(ads_mobile_sdk.pn3):void, dex: classes.dex in method: ads_mobile_sdk.jp.b(ads_mobile_sdk.pn3):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.b(ads_mobile_sdk.pn3):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.b(android.view.View):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(android.view.View):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void b(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.b(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.b(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.b(android.view.View):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.d(long, vg):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.jp.d(long, vg):java.lang.Object, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.d(long, vg):java.lang.Object, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final java.lang.Object d(long r1, defpackage.vg r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.d(long, vg):java.lang.Object, dex: classes.dex in method: ads_mobile_sdk.jp.d(long, vg):java.lang.Object, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.d(long, vg):java.lang.Object");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onGlobalLayout():void, dex: classes.dex in method: ads_mobile_sdk.jp.onGlobalLayout():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onGlobalLayout():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void onGlobalLayout() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onGlobalLayout():void, dex: classes.dex in method: ads_mobile_sdk.jp.onGlobalLayout():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.onGlobalLayout():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onScrollChanged():void, dex: classes.dex in method: ads_mobile_sdk.jp.onScrollChanged():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onScrollChanged():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void onScrollChanged() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onScrollChanged():void, dex: classes.dex in method: ads_mobile_sdk.jp.onScrollChanged():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.onScrollChanged():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onViewAttachedToWindow(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.onViewAttachedToWindow(android.view.View):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onViewAttachedToWindow(android.view.View):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void onViewAttachedToWindow(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onViewAttachedToWindow(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.onViewAttachedToWindow(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.onViewAttachedToWindow(android.view.View):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onViewDetachedFromWindow(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.onViewDetachedFromWindow(android.view.View):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onViewDetachedFromWindow(android.view.View):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void onViewDetachedFromWindow(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.jp.onViewDetachedFromWindow(android.view.View):void, dex: classes.dex in method: ads_mobile_sdk.jp.onViewDetachedFromWindow(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.jp.onViewDetachedFromWindow(android.view.View):void");
    }
}
