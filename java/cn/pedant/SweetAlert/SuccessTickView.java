package cn.pedant.SweetAlert;

import android.graphics.Paint;
import android.view.View;
import android.view.animation.Animation;

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
public class SuccessTickView extends View {
    private final float CONST_LEFT_RECT_W;
    private final float CONST_RADIUS;
    private final float CONST_RECT_WEIGHT;
    private final float CONST_RIGHT_RECT_W;
    private final float MAX_RIGHT_RECT_W;
    private final float MIN_LEFT_RECT_W;
    private float mDensity;
    private boolean mLeftRectGrowMode;
    private float mLeftRectWidth;
    private float mMaxLeftRectWidth;
    private Paint mPaint;
    private float mRightRectWidth;

    /* renamed from: cn.pedant.SweetAlert.SuccessTickView$1 */
    public class AnonymousClass1 extends Animation {
        final /* synthetic */ SuccessTickView this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.1.<init>(cn.pedant.SweetAlert.SuccessTickView):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.1.<init>(cn.pedant.SweetAlert.SuccessTickView):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.1.<init>(cn.pedant.SweetAlert.SuccessTickView):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass1(cn.pedant.SweetAlert.SuccessTickView r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.1.<init>(cn.pedant.SweetAlert.SuccessTickView):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.1.<init>(cn.pedant.SweetAlert.SuccessTickView):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.1.<init>(cn.pedant.SweetAlert.SuccessTickView):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.1.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.1.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.1.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void applyTransformation(float r1, android.view.animation.Transformation r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.1.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.1.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.1.applyTransformation(float, android.view.animation.Transformation):void");
        }
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public SuccessTickView(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public SuccessTickView(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$002(cn.pedant.SweetAlert.SuccessTickView, boolean):boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$002(cn.pedant.SweetAlert.SuccessTickView, boolean):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$002(cn.pedant.SweetAlert.SuccessTickView, boolean):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ boolean access$002(cn.pedant.SweetAlert.SuccessTickView r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$002(cn.pedant.SweetAlert.SuccessTickView, boolean):boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$002(cn.pedant.SweetAlert.SuccessTickView, boolean):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$002(cn.pedant.SweetAlert.SuccessTickView, boolean):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$100(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$100(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$100(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$100(cn.pedant.SweetAlert.SuccessTickView r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$100(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$100(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$100(cn.pedant.SweetAlert.SuccessTickView):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$102(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$102(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$102(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$102(cn.pedant.SweetAlert.SuccessTickView r1, float r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$102(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$102(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$102(cn.pedant.SweetAlert.SuccessTickView, float):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$200(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$200(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$200(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$200(cn.pedant.SweetAlert.SuccessTickView r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$200(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$200(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$200(cn.pedant.SweetAlert.SuccessTickView):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$302(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$302(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$302(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$302(cn.pedant.SweetAlert.SuccessTickView r1, float r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$302(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$302(cn.pedant.SweetAlert.SuccessTickView, float):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$302(cn.pedant.SweetAlert.SuccessTickView, float):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$400(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$400(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$400(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$400(cn.pedant.SweetAlert.SuccessTickView r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$400(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$400(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$400(cn.pedant.SweetAlert.SuccessTickView):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$500(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$500(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$500(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$500(cn.pedant.SweetAlert.SuccessTickView r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$500(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$500(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$500(cn.pedant.SweetAlert.SuccessTickView):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$600(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$600(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$600(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$600(cn.pedant.SweetAlert.SuccessTickView r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$600(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$600(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$600(cn.pedant.SweetAlert.SuccessTickView):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$700(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$700(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$700(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$700(cn.pedant.SweetAlert.SuccessTickView r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.access$700(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.access$700(cn.pedant.SweetAlert.SuccessTickView):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.access$700(cn.pedant.SweetAlert.SuccessTickView):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.init():void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.init():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.init():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void init() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.init():void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.init():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.init():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.dip2px(float):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.dip2px(float):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.dip2px(float):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public float dip2px(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.dip2px(float):float, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.dip2px(float):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.dip2px(float):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.draw(android.graphics.Canvas):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.draw(android.graphics.Canvas):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.draw(android.graphics.Canvas):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void draw(android.graphics.Canvas r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.draw(android.graphics.Canvas):void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.draw(android.graphics.Canvas):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.draw(android.graphics.Canvas):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.startTickAnim():void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.startTickAnim():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.startTickAnim():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void startTickAnim() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SuccessTickView.startTickAnim():void, dex: classes.dex in method: cn.pedant.SweetAlert.SuccessTickView.startTickAnim():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SuccessTickView.startTickAnim():void");
    }
}
