package com.skyfishjy.library;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.graphics.Paint;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import java.util.ArrayList;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.lang.Object java.util.List.get(int)' on a null object reference
    	at U4.b.f(SourceFile:1852)
    	at U4.b.f(SourceFile:1673)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class RippleBackground extends RelativeLayout {
    private static final int DEFAULT_DURATION_TIME = 3000;
    private static final int DEFAULT_FILL_TYPE = 0;
    private static final int DEFAULT_RIPPLE_COUNT = 6;
    private static final float DEFAULT_SCALE = 6.0f;
    private boolean animationRunning;
    private ArrayList<Animator> animatorList;
    private AnimatorSet animatorSet;
    private Paint paint;
    private int rippleAmount;
    private int rippleColor;
    private int rippleDelay;
    private int rippleDurationTime;
    private LayoutParams rippleParams;
    private float rippleRadius;
    private float rippleScale;
    private float rippleStrokeWidth;
    private int rippleType;
    private ArrayList<RippleView> rippleViewList;

    public class RippleView extends View {
        final /* synthetic */ RippleBackground this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.RippleView.<init>(com.skyfishjy.library.RippleBackground, android.content.Context):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.RippleView.<init>(com.skyfishjy.library.RippleBackground, android.content.Context):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.RippleView.<init>(com.skyfishjy.library.RippleBackground, android.content.Context):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public RippleView(com.skyfishjy.library.RippleBackground r1, android.content.Context r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.RippleView.<init>(com.skyfishjy.library.RippleBackground, android.content.Context):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.RippleView.<init>(com.skyfishjy.library.RippleBackground, android.content.Context):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.RippleView.<init>(com.skyfishjy.library.RippleBackground, android.content.Context):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.RippleView.onDraw(android.graphics.Canvas):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.RippleView.onDraw(android.graphics.Canvas):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.RippleView.onDraw(android.graphics.Canvas):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onDraw(android.graphics.Canvas r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.RippleView.onDraw(android.graphics.Canvas):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.RippleView.onDraw(android.graphics.Canvas):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.RippleView.onDraw(android.graphics.Canvas):void");
        }
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RippleBackground(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RippleBackground(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RippleBackground(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.access$000(com.skyfishjy.library.RippleBackground):float, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.access$000(com.skyfishjy.library.RippleBackground):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.access$000(com.skyfishjy.library.RippleBackground):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$000(com.skyfishjy.library.RippleBackground r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.access$000(com.skyfishjy.library.RippleBackground):float, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.access$000(com.skyfishjy.library.RippleBackground):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.access$000(com.skyfishjy.library.RippleBackground):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.access$100(com.skyfishjy.library.RippleBackground):android.graphics.Paint, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.access$100(com.skyfishjy.library.RippleBackground):android.graphics.Paint, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.access$100(com.skyfishjy.library.RippleBackground):android.graphics.Paint, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ android.graphics.Paint access$100(com.skyfishjy.library.RippleBackground r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.access$100(com.skyfishjy.library.RippleBackground):android.graphics.Paint, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.access$100(com.skyfishjy.library.RippleBackground):android.graphics.Paint, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.access$100(com.skyfishjy.library.RippleBackground):android.graphics.Paint");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.init(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.init(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.init(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void init(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.init(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.init(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.init(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.isRippleAnimationRunning():boolean, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.isRippleAnimationRunning():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.isRippleAnimationRunning():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isRippleAnimationRunning() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.isRippleAnimationRunning():boolean, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.isRippleAnimationRunning():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.isRippleAnimationRunning():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.startRippleAnimation():void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.startRippleAnimation():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.startRippleAnimation():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void startRippleAnimation() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.startRippleAnimation():void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.startRippleAnimation():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.startRippleAnimation():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.stopRippleAnimation():void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.stopRippleAnimation():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.stopRippleAnimation():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void stopRippleAnimation() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.skyfishjy.library.RippleBackground.stopRippleAnimation():void, dex: classes.dex in method: com.skyfishjy.library.RippleBackground.stopRippleAnimation():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.skyfishjy.library.RippleBackground.stopRippleAnimation():void");
    }
}
