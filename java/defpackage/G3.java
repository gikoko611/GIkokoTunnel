package defpackage;

import android.content.Context;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnKeyListener;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ListAdapter;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: G3 */
public final class G3 {
    public final Context a;
    public final LayoutInflater b;
    public Drawable c;
    public CharSequence d;
    public View e;
    public CharSequence f;
    public CharSequence g;
    public OnClickListener h;
    public CharSequence i;
    public OnClickListener j;
    public CharSequence k;
    public OnClickListener l;
    public boolean m;
    public OnKeyListener n;
    public ListAdapter o;
    public OnClickListener p;
    public View q;
    public boolean r;
    public int s;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: G3.<init>(android.view.ContextThemeWrapper):void, dex: classes.dex in method: G3.<init>(android.view.ContextThemeWrapper):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: G3.<init>(android.view.ContextThemeWrapper):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public G3(android.view.ContextThemeWrapper r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: G3.<init>(android.view.ContextThemeWrapper):void, dex: classes.dex in method: G3.<init>(android.view.ContextThemeWrapper):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: G3.<init>(android.view.ContextThemeWrapper):void");
    }
}
