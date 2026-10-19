package co.ceryle.radiorealbutton;

import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Typeface;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import defpackage.K5;

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
public class RadioRealButton extends LinearLayout {
    private int backgroundColor;
    private boolean checked;
    private boolean clickable;
    private Typeface defaultTypeface;
    private int drawable;
    private DrawableGravity drawableGravity;
    private int drawableHeight;
    private int drawablePadding;
    private int drawableTint;
    private int drawableTintTo;
    private int drawableWidth;
    private boolean enabled;
    private boolean hasClickable;
    private boolean hasDrawable;
    private boolean hasDrawableHeight;
    private boolean hasDrawableTint;
    private boolean hasDrawableTintTo;
    private boolean hasDrawableWidth;
    private boolean hasEnabled;
    private boolean hasPaddingBottom;
    private boolean hasPaddingLeft;
    private boolean hasPaddingRight;
    private boolean hasPaddingTop;
    private boolean hasRipple;
    private boolean hasRippleColor;
    private boolean hasSelectorColor;
    private boolean hasText;
    private boolean hasTextColor;
    private boolean hasTextColorTo;
    private boolean hasTextSize;
    private boolean hasTextStyle;
    private boolean hasTextTypefacePath;
    private C1416h5 imageView;
    private OnSelectorColorChangedListener onSelectorColorChangedListener;
    private int padding;
    private int paddingBottom;
    private int paddingLeft;
    private int paddingRight;
    private int paddingTop;
    private int position;
    private int rippleColor;
    private int selectorColor;
    private String text;
    private int textColor;
    private int textColorTo;
    private boolean textFillSpace;
    private int textGravity;
    private int textSize;
    private int textStyle;
    private Typeface textTypeface;
    private String textTypefacePath;
    private K5 textView;

    /* renamed from: co.ceryle.radiorealbutton.RadioRealButton$1 */
    public class AnonymousClass1 extends LayoutParams {
        final /* synthetic */ RadioRealButton this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.1.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.1.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.1.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass1(co.ceryle.radiorealbutton.RadioRealButton r1, int r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.1.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.1.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.1.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void");
        }
    }

    /* renamed from: co.ceryle.radiorealbutton.RadioRealButton$2 */
    public class AnonymousClass2 extends LayoutParams {
        final /* synthetic */ RadioRealButton this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.2.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.2.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.2.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass2(co.ceryle.radiorealbutton.RadioRealButton r1, int r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.2.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.2.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.2.<init>(co.ceryle.radiorealbutton.RadioRealButton, int, int):void");
        }
    }

    /* renamed from: co.ceryle.radiorealbutton.RadioRealButton$3 */
    public class AnonymousClass3 implements AnimatorUpdateListener {
        final /* synthetic */ RadioRealButton this$0;
        final /* synthetic */ View val$v;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.3.<init>(co.ceryle.radiorealbutton.RadioRealButton, android.view.View):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.3.<init>(co.ceryle.radiorealbutton.RadioRealButton, android.view.View):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.3.<init>(co.ceryle.radiorealbutton.RadioRealButton, android.view.View):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass3(co.ceryle.radiorealbutton.RadioRealButton r1, android.view.View r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.3.<init>(co.ceryle.radiorealbutton.RadioRealButton, android.view.View):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.3.<init>(co.ceryle.radiorealbutton.RadioRealButton, android.view.View):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.3.<init>(co.ceryle.radiorealbutton.RadioRealButton, android.view.View):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.3.onAnimationUpdate(android.animation.ValueAnimator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.3.onAnimationUpdate(android.animation.ValueAnimator):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.3.onAnimationUpdate(android.animation.ValueAnimator):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onAnimationUpdate(android.animation.ValueAnimator r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.3.onAnimationUpdate(android.animation.ValueAnimator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.3.onAnimationUpdate(android.animation.ValueAnimator):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.3.onAnimationUpdate(android.animation.ValueAnimator):void");
        }
    }

    /* DevToolsApp ERROR: NullPointerException in pass: b
        java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
        	at U4.b.f(SourceFile:36)
        	at androidx.work.D.T(SourceFile:1)
        	at androidx.work.D.T(SourceFile:27)
        	at n1.c.u(SourceFile:42)
        	at C4.c.run(SourceFile:73)
        */
    /* DevToolsApp ERROR: NullPointerException in pass: b
        java.lang.NullPointerException: Attempt to invoke interface method 'java.lang.Object java.util.List.get(int)' on a null object reference
        	at U4.b.f(SourceFile:1152)
        	at androidx.work.D.T(SourceFile:1)
        	at androidx.work.D.T(SourceFile:27)
        	at n1.c.u(SourceFile:42)
        	at C4.c.run(SourceFile:73)
        */
    public enum DrawableGravity {
        ;
        
        private int intValue;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<clinit>():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<clinit>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<clinit>():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        static {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<clinit>():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<clinit>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<clinit>():void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<init>(java.lang.String, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<init>(java.lang.String, int, int):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<init>(java.lang.String, int, int):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        private DrawableGravity(int r3) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<init>(java.lang.String, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<init>(java.lang.String, int, int):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.<init>(java.lang.String, int, int):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getById(int):co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getById(int):co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getById(int):co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public static co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity getById(int r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getById(int):co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getById(int):co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getById(int):co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getIntValue():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getIntValue():int, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getIntValue():int, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        private int getIntValue() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getIntValue():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getIntValue():int, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.getIntValue():int");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.isHorizontal():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.isHorizontal():boolean, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.isHorizontal():boolean, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public boolean isHorizontal() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.isHorizontal():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.isHorizontal():boolean, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity.isHorizontal():boolean");
        }
    }

    public interface OnSelectorColorChangedListener {
        void onSelectorColorChanged(int i, int i2);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButton(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButton(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButton(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButton(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void bounce(android.view.View r1, float r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float, int, android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float, int, android.view.animation.Interpolator):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float, int, android.view.animation.Interpolator):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void bounce(android.view.View r1, float r2, int r3, android.view.animation.Interpolator r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float, int, android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float, int, android.view.animation.Interpolator):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.bounce(android.view.View, float, int, android.view.animation.Interpolator):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransition(android.view.View, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransition(android.view.View, int, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransition(android.view.View, int, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void colorTransition(android.view.View r1, int r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransition(android.view.View, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransition(android.view.View, int, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.colorTransition(android.view.View, int, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getAttributes(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getAttributes(android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getAttributes(android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void getAttributes(android.util.AttributeSet r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getAttributes(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getAttributes(android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getAttributes(android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.init(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.init(android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.init(android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void init(android.util.AttributeSet r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.init(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.init(android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.init(android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.initViews():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.initViews():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.initViews():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void initViews() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.initViews():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.initViews():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.initViews():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableAttrs():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableAttrs():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setDrawableAttrs() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableAttrs():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableAttrs():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setDrawableGravity() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabledAlpha(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabledAlpha(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabledAlpha(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setEnabledAlpha(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabledAlpha(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabledAlpha(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setEnabledAlpha(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddingAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddingAttrs():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddingAttrs():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setPaddingAttrs() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddingAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddingAttrs():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setPaddingAttrs():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleBackground(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleBackground(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleBackground(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setRippleBackground(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleBackground(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleBackground(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setRippleBackground(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setState():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setState():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setState():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setState() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setState():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setState():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setState():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextAttrs():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextAttrs():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setTextAttrs() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextAttrs():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTextAttrs():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.updatePadding(android.view.View, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.updatePadding(android.view.View, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.updatePadding(android.view.View, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void updatePadding(android.view.View r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.updatePadding(android.view.View, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.updatePadding(android.view.View, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.updatePadding(android.view.View, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.updatePaddings():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.updatePaddings():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.updatePaddings():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void updatePaddings() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.updatePaddings():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.updatePaddings():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.updatePaddings():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void bounceDrawable(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void bounceDrawable(float r1, int r2, android.view.animation.Interpolator r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.bounceDrawable(float, int, android.view.animation.Interpolator, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void bounceText(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void bounceText(float r1, int r2, android.view.animation.Interpolator r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float, int, android.view.animation.Interpolator, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.bounceText(float, int, android.view.animation.Interpolator, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionDrawable(boolean, int, int, int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionDrawable(boolean, int, int, int, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionDrawable(boolean, int, int, int, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void colorTransitionDrawable(boolean r1, int r2, int r3, int r4, boolean r5, boolean r6) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionDrawable(boolean, int, int, int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionDrawable(boolean, int, int, int, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionDrawable(boolean, int, int, int, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionText(boolean, int, int, int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionText(boolean, int, int, int, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionText(boolean, int, int, int, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void colorTransitionText(boolean r1, int r2, int r3, int r4, boolean r5, boolean r6) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionText(boolean, int, int, int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionText(boolean, int, int, int, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.colorTransitionText(boolean, int, int, int, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDefaultTypeface():android.graphics.Typeface, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDefaultTypeface():android.graphics.Typeface, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDefaultTypeface():android.graphics.Typeface, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.graphics.Typeface getDefaultTypeface() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDefaultTypeface():android.graphics.Typeface, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDefaultTypeface():android.graphics.Typeface, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDefaultTypeface():android.graphics.Typeface");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawable():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawable():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawable():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDrawable() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawable():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawable():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawable():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableGravity():co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableGravity():co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableGravity():co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity getDrawableGravity() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableGravity():co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableGravity():co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawableGravity():co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableHeight():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableHeight():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableHeight():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDrawableHeight() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableHeight():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableHeight():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawableHeight():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawablePadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawablePadding():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawablePadding():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDrawablePadding() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawablePadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawablePadding():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawablePadding():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTint():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTint():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTint():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDrawableTint() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTint():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTint():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTint():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTintTo():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTintTo():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTintTo():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDrawableTintTo() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTintTo():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTintTo():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawableTintTo():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableWidth():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableWidth():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableWidth():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDrawableWidth() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableWidth():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getDrawableWidth():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getDrawableWidth():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getImageView():h5, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getImageView():h5, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getImageView():h5, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public C1416h5 getImageView() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getImageView():h5, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getImageView():h5, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getImageView():h5");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPadding():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPadding():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getPadding() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPadding():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getPadding():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingBottom():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingBottom():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingBottom():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getPaddingBottom() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingBottom():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingBottom():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getPaddingBottom():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingLeft():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingLeft():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingLeft():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getPaddingLeft() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingLeft():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingLeft():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getPaddingLeft():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingRight():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingRight():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingRight():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getPaddingRight() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingRight():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingRight():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getPaddingRight():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingTop():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingTop():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingTop():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getPaddingTop() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingTop():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getPaddingTop():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getPaddingTop():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getRippleColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getRippleColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getRippleColor():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getRippleColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getRippleColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getRippleColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getRippleColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getSelectorColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getSelectorColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getSelectorColor():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getSelectorColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getSelectorColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getSelectorColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getSelectorColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getText():java.lang.String, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getText():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getText():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getText():java.lang.String, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getText():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getText():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColor():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getTextColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getTextColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColorTo():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColorTo():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColorTo():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getTextColorTo() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColorTo():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextColorTo():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getTextColorTo():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextSize():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextSize():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getTextSize() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextSize():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getTextSize():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextStyle():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextStyle():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextStyle():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getTextStyle() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextStyle():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextStyle():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getTextStyle():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextView():K5, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextView():K5, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextView():K5, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public defpackage.K5 getTextView() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTextView():K5, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTextView():K5, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getTextView():K5");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTypefacePath():java.lang.String, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTypefacePath():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTypefacePath():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getTypefacePath() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.getTypefacePath():java.lang.String, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.getTypefacePath():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.getTypefacePath():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasClickable():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasClickable():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasClickable():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasClickable() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasClickable():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasClickable():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasClickable():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTint():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTint():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTint():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasDrawableTint() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTint():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTint():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTint():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTintTo():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTintTo():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTintTo():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasDrawableTintTo() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTintTo():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTintTo():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasDrawableTintTo():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasEnabled():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasEnabled():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasEnabled():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasEnabled() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasEnabled():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasEnabled():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasEnabled():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingBottom():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingBottom():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingBottom():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasPaddingBottom() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingBottom():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingBottom():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingBottom():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingLeft():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingLeft():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingLeft():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasPaddingLeft() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingLeft():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingLeft():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingLeft():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingRight():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingRight():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingRight():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasPaddingRight() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingRight():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingRight():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingRight():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingTop():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingTop():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingTop():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasPaddingTop() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingTop():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingTop():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasPaddingTop():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasSelectorColor():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasSelectorColor():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasSelectorColor():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasSelectorColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasSelectorColor():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasSelectorColor():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasSelectorColor():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColor():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColor():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColor():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasTextColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColor():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColor():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasTextColor():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColorTo():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColorTo():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColorTo():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasTextColorTo() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColorTo():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.hasTextColorTo():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.hasTextColorTo():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isChecked():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.isChecked():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isChecked():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isChecked() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isChecked():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.isChecked():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.isChecked():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isClickable():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.isClickable():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isClickable():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isClickable() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isClickable():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.isClickable():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.isClickable():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isEnabled():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.isEnabled():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isEnabled():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isEnabled() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.isEnabled():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.isEnabled():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.isEnabled():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.restoreTypeface():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.restoreTypeface():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.restoreTypeface():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void restoreTypeface() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.restoreTypeface():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.restoreTypeface():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.restoreTypeface():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setChecked(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setChecked(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setChecked(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setChecked(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setChecked(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setChecked(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setChecked(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedDrawableTint(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedDrawableTint(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedDrawableTint(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setCheckedDrawableTint(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedDrawableTint(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedDrawableTint(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setCheckedDrawableTint(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedTextColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedTextColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedTextColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setCheckedTextColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedTextColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setCheckedTextColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setCheckedTextColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setClickable(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setClickable(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setClickable(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setClickable(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setClickable(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setClickable(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setClickable(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawable(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(android.graphics.drawable.Drawable):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(android.graphics.drawable.Drawable):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(android.graphics.drawable.Drawable):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawable(android.graphics.drawable.Drawable r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(android.graphics.drawable.Drawable):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(android.graphics.drawable.Drawable):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawable(android.graphics.drawable.Drawable):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton.DrawableGravity r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableGravity(co.ceryle.radiorealbutton.RadioRealButton$DrawableGravity):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableHeight(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableHeight(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableHeight(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableHeight(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableHeight(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableHeight(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableHeight(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawablePadding(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawablePadding(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawablePadding(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawablePadding(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawablePadding(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawablePadding(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawablePadding(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByDp(int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByDp(int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByDp(int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableSizeByDp(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByDp(int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByDp(int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByDp(int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByPx(int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByPx(int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByPx(int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableSizeByPx(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByPx(int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByPx(int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableSizeByPx(int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableTint(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableTint(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTint(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTintTo(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTintTo(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTintTo(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableTintTo(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTintTo(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTintTo(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableTintTo(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableWidth(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableWidth(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableWidth(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDrawableWidth(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableWidth(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setDrawableWidth(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setDrawableWidth(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabled(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabled(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabled(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setEnabled(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabled(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setEnabled(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setEnabled(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasDrawableTintTo(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setHasDrawableTintTo(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasDrawableTintTo(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setHasDrawableTintTo(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasDrawableTintTo(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setHasDrawableTintTo(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setHasDrawableTintTo(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColor(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColor(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColor(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setHasTextColor(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColor(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColor(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColor(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColorTo(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColorTo(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColorTo(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setHasTextColorTo(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColorTo(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColorTo(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setHasTextColorTo(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton$OnSelectorColorChangedListener, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton$OnSelectorColorChangedListener, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton$OnSelectorColorChangedListener, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton.OnSelectorColorChangedListener r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton$OnSelectorColorChangedListener, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton$OnSelectorColorChangedListener, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setOnSelectorColorChangedListener(co.ceryle.radiorealbutton.RadioRealButton$OnSelectorColorChangedListener, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddings(int, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddings(int, int, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddings(int, int, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setPaddings(int r1, int r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddings(int, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setPaddings(int, int, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setPaddings(int, int, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRipple(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRipple(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRipple(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setRipple(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRipple(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRipple(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setRipple(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setRippleColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setRippleColor(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setRippleColor(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setSelectorColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setSelectorColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setSelectorColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setSelectorColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setSelectorColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setSelectorColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setText(java.lang.String):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setText(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setText(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setText(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setText(java.lang.String):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setText(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setText(java.lang.String):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTextColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTextColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColorTo(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColorTo(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColorTo(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTextColorTo(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColorTo(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextColorTo(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTextColorTo(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizePX(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizePX(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizePX(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTextSizePX(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizePX(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizePX(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTextSizePX(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizeSP(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizeSP(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizeSP(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTextSizeSP(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizeSP(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextSizeSP(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTextSizeSP(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextStyle(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextStyle(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextStyle(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTextStyle(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTextStyle(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTextStyle(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTextStyle(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(android.graphics.Typeface):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(android.graphics.Typeface):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(android.graphics.Typeface):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTypeface(android.graphics.Typeface r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(android.graphics.Typeface):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(android.graphics.Typeface):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(android.graphics.Typeface):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(java.lang.String):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(java.lang.String):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(java.lang.String):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTypeface(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(java.lang.String):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(java.lang.String):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButton.setTypeface(java.lang.String):void");
    }
}
