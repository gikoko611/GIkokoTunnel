package ads_mobile_sdk;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.widget.FrameLayout;
import android.widget.ImageView.ScaleType;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
public abstract class zt1 {
    public final AtomicBoolean a;
    public final AtomicBoolean b;
    public WeakReference c;
    public WeakReference d;
    public WeakReference e;
    public WeakReference f;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.zt1.<init>():void, dex: classes.dex in method: ads_mobile_sdk.zt1.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: ads_mobile_sdk.zt1.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public zt1() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: ads_mobile_sdk.zt1.<init>():void, dex: classes.dex in method: ads_mobile_sdk.zt1.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: ads_mobile_sdk.zt1.<init>():void");
    }

    public abstract C2565yz a(FrameLayout frameLayout, ScaleType scaleType, LinkedHashMap linkedHashMap);

    public abstract void a();

    public abstract void a(View view, int i);

    public abstract void a(View view, FrameLayout frameLayout, LinkedHashMap linkedHashMap, ScaleType scaleType);

    public abstract void a(FrameLayout frameLayout, MotionEvent motionEvent);

    public abstract void a(FrameLayout frameLayout, ScaleType scaleType, Map map);

    public abstract void a(FrameLayout frameLayout, LinkedHashMap linkedHashMap);

    public abstract void a(WeakReference weakReference, FrameLayout frameLayout, LinkedHashMap linkedHashMap, OnTouchListener onTouchListener, OnClickListener onClickListener);

    public abstract void a$1();

    public abstract C2565yz b(FrameLayout frameLayout, ScaleType scaleType, LinkedHashMap linkedHashMap);

    public abstract void b(FrameLayout frameLayout, ScaleType scaleType, Map map);

    public abstract void c();

    public abstract boolean d();

    public abstract int e();

    public abstract boolean k();
}
