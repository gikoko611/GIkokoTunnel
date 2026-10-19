package co.ceryle.radiorealbutton;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.animation.Interpolator;
import android.widget.LinearLayout;
import co.ceryle.radiorealbutton.RadioRealButton.OnSelectorColorChangedListener;
import java.util.List;

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
public class RadioRealButtonGroup extends RoundedCornerLayout implements OnSelectorColorChangedListener {
    public final int ANIM_ALPHA;
    public final int ANIM_SCALE_X;
    public final int ANIM_SCALE_Y;
    public final int ANIM_TRANSLATE_X;
    public final int ANIM_TRANSLATE_Y;
    private int animateDrawablesEnter;
    private int animateDrawablesEnterDuration;
    private int animateDrawablesExit;
    private int animateDrawablesExitDuration;
    private float animateDrawablesScale;
    private int animateDrawablesTintDuration;
    private int animateDrawablesTintDurationEnter;
    private int animateDrawablesTintDurationExit;
    private int animateDrawablesTintEnter;
    private int animateDrawablesTintExit;
    private int animateSelector;
    private int animateSelectorDelay;
    private int animateSelectorDuration;
    private int animateTextsColorDuration;
    private int animateTextsColorDurationEnter;
    private int animateTextsColorDurationExit;
    private int animateTextsColorEnter;
    private int animateTextsColorExit;
    private int animateTextsEnter;
    private int animateTextsEnterDuration;
    private int animateTextsExit;
    private int animateTextsExitDuration;
    private float animateTextsScale;
    private int animationType;
    private int borderColor;
    private int borderSize;
    private boolean bottomLineBringToFront;
    private int bottomLineColor;
    private int bottomLineRadius;
    private int bottomLineSize;
    private int buttonPadding;
    private int buttonPaddingBottom;
    private int buttonPaddingLeft;
    private int buttonPaddingRight;
    private int buttonPaddingTop;
    private List<RadioRealButton> buttons;
    private int checkedButtonId;
    private boolean clickable;
    private LinearLayout container;
    private int dividerColor;
    private int dividerPadding;
    private int dividerRadius;
    private int dividerSize;
    private boolean enableDeselection;
    private boolean enabled;
    private int groupBackgroundColor;
    private boolean hasAnimateDrawables;
    private boolean hasAnimateDrawablesTint;
    private boolean hasAnimateTexts;
    private boolean hasAnimateTextsColor;
    private boolean hasAnimation;
    private boolean hasBorder;
    private boolean hasClickable;
    private boolean hasEnabled;
    private boolean hasPadding;
    private boolean hasPaddingBottom;
    private boolean hasPaddingLeft;
    private boolean hasPaddingRight;
    private boolean hasPaddingTop;
    private int initialPosition;
    private Interpolator interpolatorDrawablesEnter;
    private Interpolator interpolatorDrawablesExit;
    private Interpolator interpolatorSelector;
    private Interpolator interpolatorText;
    private Interpolator interpolatorTextExit;
    private int lastPosition;
    private int numberOfButtons;
    private OnClickedButtonListener onClickedButtonListener;
    private OnPositionChangedListener onPositionChangedListener;
    private float radius;
    private boolean selectorAboveOfBottomLine;
    private boolean selectorBottom;
    private boolean selectorBringToFront;
    private int selectorColor;
    private LinearLayout selectorContainer;
    private int selectorDividerColor;
    private int selectorDividerPadding;
    private int selectorDividerRadius;
    private int selectorDividerSize;
    private boolean selectorFullSize;
    private int selectorRadius;
    private int selectorSize;
    private boolean selectorTop;
    private View v_bottomLine;
    private List<View> v_selectors;

    /* renamed from: co.ceryle.radiorealbutton.RadioRealButtonGroup$1 */
    public class AnonymousClass1 implements OnClickListener {
        final /* synthetic */ RadioRealButtonGroup this$0;
        final /* synthetic */ int val$position;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, int):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, int):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass1(co.ceryle.radiorealbutton.RadioRealButtonGroup r1, int r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, int):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, int):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.onClick(android.view.View):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.onClick(android.view.View):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.onClick(android.view.View):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onClick(android.view.View r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.onClick(android.view.View):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.onClick(android.view.View):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.1.onClick(android.view.View):void");
        }
    }

    /* renamed from: co.ceryle.radiorealbutton.RadioRealButtonGroup$2 */
    public class AnonymousClass2 implements OnLongClickListener {
        final /* synthetic */ RadioRealButtonGroup this$0;
        final /* synthetic */ int val$buttonPosition;
        final /* synthetic */ OnLongClickedButtonListener val$onLongClickedButtonListener;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener, int):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener, int):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass2(co.ceryle.radiorealbutton.RadioRealButtonGroup r1, co.ceryle.radiorealbutton.RadioRealButtonGroup.OnLongClickedButtonListener r2, int r3) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener, int):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.<init>(co.ceryle.radiorealbutton.RadioRealButtonGroup, co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener, int):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.onLongClick(android.view.View):boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.onLongClick(android.view.View):boolean, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.onLongClick(android.view.View):boolean, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public boolean onLongClick(android.view.View r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.onLongClick(android.view.View):boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.onLongClick(android.view.View):boolean, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.2.onLongClick(android.view.View):boolean");
        }
    }

    public interface OnClickedButtonListener {
        void onClickedButton(RadioRealButton radioRealButton, int i);
    }

    public interface OnLongClickedButtonListener {
        boolean onLongClickedButton(RadioRealButton radioRealButton, int i);
    }

    public interface OnPositionChangedListener {
        void onPositionChanged(RadioRealButton radioRealButton, int i, int i2);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButtonGroup(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButtonGroup(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RadioRealButtonGroup(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup):boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ boolean access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup):boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$000(co.ceryle.radiorealbutton.RadioRealButtonGroup):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup, int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup, int, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup, int, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ void access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup r1, int r2, boolean r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup, int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup, int, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.access$100(co.ceryle.radiorealbutton.RadioRealButtonGroup, int, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton r1, boolean r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateColorTransitions(co.ceryle.radiorealbutton.RadioRealButton, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateEnter(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateEnter(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateEnter(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void animateEnter(co.ceryle.radiorealbutton.RadioRealButton r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateEnter(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateEnter(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateEnter(co.ceryle.radiorealbutton.RadioRealButton, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateExit(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateExit(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateExit(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void animateExit(co.ceryle.radiorealbutton.RadioRealButton r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateExit(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateExit(co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateExit(co.ceryle.radiorealbutton.RadioRealButton, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelector(int, java.lang.String, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelector(int, java.lang.String, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelector(int, java.lang.String, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void animateSelector(int r1, java.lang.String r2, boolean r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelector(int, java.lang.String, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelector(int, java.lang.String, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelector(int, java.lang.String, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelectorSliding(int, java.lang.String, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelectorSliding(int, java.lang.String, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelectorSliding(int, java.lang.String, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void animateSelectorSliding(int r1, java.lang.String r2, boolean r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelectorSliding(int, java.lang.String, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelectorSliding(int, java.lang.String, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateSelectorSliding(int, java.lang.String, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateTextAndDrawable(int, boolean, co.ceryle.radiorealbutton.RadioRealButton, co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateTextAndDrawable(int, boolean, co.ceryle.radiorealbutton.RadioRealButton, co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateTextAndDrawable(int, boolean, co.ceryle.radiorealbutton.RadioRealButton, co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void animateTextAndDrawable(int r1, boolean r2, co.ceryle.radiorealbutton.RadioRealButton r3, co.ceryle.radiorealbutton.RadioRealButton r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateTextAndDrawable(int, boolean, co.ceryle.radiorealbutton.RadioRealButton, co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateTextAndDrawable(int, boolean, co.ceryle.radiorealbutton.RadioRealButton, co.ceryle.radiorealbutton.RadioRealButton, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.animateTextAndDrawable(int, boolean, co.ceryle.radiorealbutton.RadioRealButton, co.ceryle.radiorealbutton.RadioRealButton, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createAnimator(android.view.View, java.lang.String, float, boolean, boolean):android.animation.ObjectAnimator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createAnimator(android.view.View, java.lang.String, float, boolean, boolean):android.animation.ObjectAnimator, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createAnimator(android.view.View, java.lang.String, float, boolean, boolean):android.animation.ObjectAnimator, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private android.animation.ObjectAnimator createAnimator(android.view.View r1, java.lang.String r2, float r3, boolean r4, boolean r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createAnimator(android.view.View, java.lang.String, float, boolean, boolean):android.animation.ObjectAnimator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createAnimator(android.view.View, java.lang.String, float, boolean, boolean):android.animation.ObjectAnimator, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.createAnimator(android.view.View, java.lang.String, float, boolean, boolean):android.animation.ObjectAnimator");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createSelectorItem(int, co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createSelectorItem(int, co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createSelectorItem(int, co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void createSelectorItem(int r1, co.ceryle.radiorealbutton.RadioRealButton r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createSelectorItem(int, co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.createSelectorItem(int, co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.createSelectorItem(int, co.ceryle.radiorealbutton.RadioRealButton):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAttributes(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAttributes(android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAttributes(android.util.AttributeSet):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAttributes(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAttributes(android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAttributes(android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.init(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.init(android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.init(android.util.AttributeSet):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.init(android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.init(android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.init(android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initButtonListener(co.ceryle.radiorealbutton.RadioRealButton, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initButtonListener(co.ceryle.radiorealbutton.RadioRealButton, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initButtonListener(co.ceryle.radiorealbutton.RadioRealButton, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void initButtonListener(co.ceryle.radiorealbutton.RadioRealButton r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initButtonListener(co.ceryle.radiorealbutton.RadioRealButton, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initButtonListener(co.ceryle.radiorealbutton.RadioRealButton, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.initButtonListener(co.ceryle.radiorealbutton.RadioRealButton, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initInterpolations():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initInterpolations():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initInterpolations():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void initInterpolations() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initInterpolations():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initInterpolations():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.initInterpolations():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initViews():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initViews():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initViews():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initViews():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.initViews():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.initViews():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isInRange(int):boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isInRange(int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isInRange(int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private boolean isInRange(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isInRange(int):boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isInRange(int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isInRange(int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void makeSelection(int r1, boolean r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void makeSelection(int r1, boolean r2, boolean r3, boolean r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.makeSelection(int, boolean, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.moveSelector(int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.moveSelector(int, boolean, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.moveSelector(int, boolean, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void moveSelector(int r1, boolean r2, boolean r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.moveSelector(int, boolean, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.moveSelector(int, boolean, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.moveSelector(int, boolean, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderAttrs():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderAttrs():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setBorderAttrs() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderAttrs():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderAttrs():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineAttrs():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineAttrs():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setBottomLineAttrs() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineAttrs():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineAttrs():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonPadding(co.ceryle.radiorealbutton.RadioRealButton):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonsPadding(int, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonsPadding(int, int, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonsPadding(int, int, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setButtonsPadding(int r1, int r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonsPadding(int, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonsPadding(int, int, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setButtonsPadding(int, int, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabledAlpha(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabledAlpha(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabledAlpha(boolean):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabledAlpha(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabledAlpha(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabledAlpha(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRippleState(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRippleState(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRippleState(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setRippleState(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRippleState(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRippleState(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRippleState(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAttrs():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAttrs():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setSelectorAttrs() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAttrs():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAttrs():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAttrs():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setState():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setState():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setState():void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setState():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setState():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setState():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewBottomLine():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewBottomLine():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewBottomLine():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void updateViewBottomLine() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewBottomLine():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewBottomLine():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewBottomLine():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void updateViewSelector(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View, int, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View, int, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void updateViewSelector(android.view.View r1, int r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View, int, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View, int, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelector(android.view.View, int, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelectorColor(android.view.View, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelectorColor(android.view.View, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelectorColor(android.view.View, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void updateViewSelectorColor(android.view.View r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelectorColor(android.view.View, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelectorColor(android.view.View, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.updateViewSelectorColor(android.view.View, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void addView(android.view.View r1, int r2, android.view.ViewGroup.LayoutParams r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.addView(android.view.View, int, android.view.ViewGroup$LayoutParams):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void deselect() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect():void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void deselect(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.deselect(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesEnterDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesEnterDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesEnterDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateDrawablesEnterDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesEnterDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesEnterDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesEnterDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesExitDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesExitDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesExitDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateDrawablesExitDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesExitDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesExitDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesExitDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesScale():float, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesScale():float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesScale():float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public float getAnimateDrawablesScale() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesScale():float, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesScale():float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesScale():float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintColorDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintColorDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintColorDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateDrawablesTintColorDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintColorDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintColorDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintColorDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintEnter():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintEnter():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintEnter():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateDrawablesTintEnter() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintEnter():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintEnter():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintEnter():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintExit():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintExit():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintExit():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateDrawablesTintExit() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintExit():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintExit():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateDrawablesTintExit():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelector():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelector():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelector():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateSelector() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelector():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelector():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelector():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDelay():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDelay():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDelay():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateSelectorDelay() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDelay():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDelay():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDelay():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateSelectorDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateSelectorDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsColorDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorEnter():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorEnter():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorEnter():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsColorEnter() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorEnter():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorEnter():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorEnter():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorExit():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorExit():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorExit():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsColorExit() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorExit():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorExit():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsColorExit():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnter():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnter():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnter():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsEnter() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnter():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnter():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnter():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnterDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnterDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnterDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsEnterDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnterDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnterDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsEnterDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExit():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExit():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExit():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsExit() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExit():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExit():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExit():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExitDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExitDuration():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExitDuration():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimateTextsExitDuration() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExitDuration():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExitDuration():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsExitDuration():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsScale():float, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsScale():float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsScale():float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public float getAnimateTextsScale() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsScale():float, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsScale():float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimateTextsScale():float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimationType():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimationType():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimationType():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAnimationType() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimationType():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimationType():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getAnimationType():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderColor():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getBorderColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderSize():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderSize():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getBorderSize() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderSize():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBorderSize():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineColor():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getBottomLineColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineRadius():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineRadius():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineRadius():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getBottomLineRadius() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineRadius():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineRadius():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineRadius():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineSize():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineSize():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getBottomLineSize() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineSize():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getBottomLineSize():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtons():java.util.List<co.ceryle.radiorealbutton.RadioRealButton>, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtons():java.util.List<co.ceryle.radiorealbutton.RadioRealButton>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtons():java.util.List<co.ceryle.radiorealbutton.RadioRealButton>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.util.List<co.ceryle.radiorealbutton.RadioRealButton> getButtons() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtons():java.util.List<co.ceryle.radiorealbutton.RadioRealButton>, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtons():java.util.List<co.ceryle.radiorealbutton.RadioRealButton>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtons():java.util.List<co.ceryle.radiorealbutton.RadioRealButton>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPadding():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPadding():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getButtonsPadding() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPadding():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPadding():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingBottom():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingBottom():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingBottom():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getButtonsPaddingBottom() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingBottom():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingBottom():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingBottom():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingLeft():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingLeft():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingLeft():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getButtonsPaddingLeft() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingLeft():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingLeft():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingLeft():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingRight():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingRight():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingRight():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getButtonsPaddingRight() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingRight():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingRight():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingRight():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingTop():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingTop():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingTop():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getButtonsPaddingTop() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingTop():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingTop():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getButtonsPaddingTop():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerColor():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDividerColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerPadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerPadding():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerPadding():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDividerPadding() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerPadding():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerPadding():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerPadding():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerRadius():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerRadius():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerRadius():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDividerRadius() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerRadius():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerRadius():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerRadius():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerSize():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerSize():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getDividerSize() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerSize():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getDividerSize():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesEnter():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesEnter():android.view.animation.Interpolator, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesEnter():android.view.animation.Interpolator, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.view.animation.Interpolator getInterpolatorDrawablesEnter() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesEnter():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesEnter():android.view.animation.Interpolator, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesEnter():android.view.animation.Interpolator");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesExit():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesExit():android.view.animation.Interpolator, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesExit():android.view.animation.Interpolator, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.view.animation.Interpolator getInterpolatorDrawablesExit() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesExit():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesExit():android.view.animation.Interpolator, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorDrawablesExit():android.view.animation.Interpolator");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorSelector():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorSelector():android.view.animation.Interpolator, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorSelector():android.view.animation.Interpolator, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.view.animation.Interpolator getInterpolatorSelector() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorSelector():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorSelector():android.view.animation.Interpolator, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorSelector():android.view.animation.Interpolator");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorText():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorText():android.view.animation.Interpolator, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorText():android.view.animation.Interpolator, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.view.animation.Interpolator getInterpolatorText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorText():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorText():android.view.animation.Interpolator, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorText():android.view.animation.Interpolator");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorTextExit():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorTextExit():android.view.animation.Interpolator, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorTextExit():android.view.animation.Interpolator, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.view.animation.Interpolator getInterpolatorTextExit() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorTextExit():android.view.animation.Interpolator, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorTextExit():android.view.animation.Interpolator, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getInterpolatorTextExit():android.view.animation.Interpolator");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getNumberOfButtons():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getNumberOfButtons():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getNumberOfButtons():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getNumberOfButtons() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getNumberOfButtons():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getNumberOfButtons():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getNumberOfButtons():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getPosition():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getPosition():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getPosition():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getPosition() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getPosition():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getPosition():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getPosition():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getRadius():float, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getRadius():float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getRadius():float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public float getRadius() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getRadius():float, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getRadius():float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getRadius():float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorColor():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorColor():int, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorColor():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorColor():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorColor():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorRadius():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorRadius():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorRadius():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getSelectorRadius() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorRadius():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorRadius():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorRadius():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorSize():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorSize():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getSelectorSize() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorSize():int, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorSize():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.getSelectorSize():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasDeselection():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasDeselection():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasDeselection():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasDeselection() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasDeselection():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasDeselection():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasDeselection():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPadding():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPadding():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPadding():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean hasPadding() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPadding():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPadding():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPadding():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingBottom():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingBottom():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingBottom():boolean, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingBottom():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingBottom():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingBottom():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingLeft():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingLeft():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingLeft():boolean, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingLeft():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingLeft():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingLeft():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingRight():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingRight():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingRight():boolean, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingRight():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingRight():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingRight():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingTop():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingTop():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingTop():boolean, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingTop():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingTop():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.hasPaddingTop():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isBottomLineOnFront():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isBottomLineOnFront():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isBottomLineOnFront():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isBottomLineOnFront() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isBottomLineOnFront():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isBottomLineOnFront():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isBottomLineOnFront():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isClickable():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isClickable():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isClickable():boolean, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isClickable():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isClickable():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isClickable():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isEnabled():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isEnabled():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isEnabled():boolean, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isEnabled():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isEnabled():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isEnabled():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorAboveOfBottomLine():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorAboveOfBottomLine():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorAboveOfBottomLine():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isSelectorAboveOfBottomLine() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorAboveOfBottomLine():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorAboveOfBottomLine():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorAboveOfBottomLine():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorBottom():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorBottom():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorBottom():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isSelectorBottom() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorBottom():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorBottom():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorBottom():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorOnFront():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorOnFront():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorOnFront():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isSelectorOnFront() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorOnFront():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorOnFront():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorOnFront():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorTop():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorTop():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorTop():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isSelectorTop() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorTop():boolean, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorTop():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.isSelectorTop():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onRestoreInstanceState(android.os.Parcelable):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onRestoreInstanceState(android.os.Parcelable):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onRestoreInstanceState(android.os.Parcelable):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onRestoreInstanceState(android.os.Parcelable r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onRestoreInstanceState(android.os.Parcelable):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onRestoreInstanceState(android.os.Parcelable):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.onRestoreInstanceState(android.os.Parcelable):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSaveInstanceState():android.os.Parcelable, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSaveInstanceState():android.os.Parcelable, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSaveInstanceState():android.os.Parcelable, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.os.Parcelable onSaveInstanceState() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSaveInstanceState():android.os.Parcelable, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSaveInstanceState():android.os.Parcelable, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSaveInstanceState():android.os.Parcelable");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSelectorColorChanged(int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSelectorColorChanged(int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSelectorColorChanged(int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onSelectorColorChanged(int r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSelectorColorChanged(int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSelectorColorChanged(int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.onSelectorColorChanged(int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesEnterDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesEnterDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesEnterDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateDrawablesEnterDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesEnterDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesEnterDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesEnterDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesExitDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesExitDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesExitDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateDrawablesExitDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesExitDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesExitDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesExitDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesScale(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesScale(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesScale(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateDrawablesScale(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesScale(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesScale(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesScale(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintColorDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintColorDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintColorDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateDrawablesTintColorDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintColorDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintColorDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintColorDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintEnter(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintEnter(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintEnter(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateDrawablesTintEnter(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintEnter(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintEnter(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintEnter(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintExit(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintExit(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintExit(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateDrawablesTintExit(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintExit(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintExit(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateDrawablesTintExit(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelector(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelector(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelector(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateSelector(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelector(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelector(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelector(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDelay(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDelay(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDelay(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateSelectorDelay(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDelay(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDelay(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDelay(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateSelectorDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateSelectorDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsColorDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorEnter(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorEnter(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorEnter(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsColorEnter(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorEnter(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorEnter(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorEnter(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorExit(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorExit(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorExit(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsColorExit(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorExit(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorExit(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsColorExit(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnter(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnter(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnter(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsEnter(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnter(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnter(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnter(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnterDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnterDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnterDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsEnterDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnterDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnterDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsEnterDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExit(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExit(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExit(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsExit(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExit(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExit(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExit(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExitDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExitDuration(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExitDuration(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsExitDuration(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExitDuration(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExitDuration(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsExitDuration(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsScale(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsScale(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsScale(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimateTextsScale(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsScale(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsScale(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimateTextsScale(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimationType(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimationType(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimationType(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setAnimationType(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimationType(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimationType(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setAnimationType(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBorderColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderSize(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderSize(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBorderSize(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderSize(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBorderSize(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBottomLineColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineRadius(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineRadius(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineRadius(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBottomLineRadius(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineRadius(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineRadius(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineRadius(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineSize(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineSize(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBottomLineSize(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineSize(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineSize(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineToFront(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineToFront(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineToFront(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBottomLineToFront(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineToFront(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineToFront(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setBottomLineToFront(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setClickable(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setClickable(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setClickable(boolean):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setClickable(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setClickable(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setClickable(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDeselection(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDeselection(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDeselection(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDeselection(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDeselection(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDeselection(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDeselection(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDividerColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerPadding(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerPadding(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerPadding(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDividerPadding(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerPadding(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerPadding(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerPadding(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerRadius(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerRadius(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerRadius(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDividerRadius(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerRadius(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerRadius(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerRadius(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerSize(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerSize(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setDividerSize(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerSize(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setDividerSize(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabled(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabled(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabled(boolean):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabled(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabled(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setEnabled(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesEnter(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesEnter(android.view.animation.Interpolator):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesEnter(android.view.animation.Interpolator):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setInterpolatorDrawablesEnter(android.view.animation.Interpolator r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesEnter(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesEnter(android.view.animation.Interpolator):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesEnter(android.view.animation.Interpolator):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesExit(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesExit(android.view.animation.Interpolator):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesExit(android.view.animation.Interpolator):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setInterpolatorDrawablesExit(android.view.animation.Interpolator r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesExit(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesExit(android.view.animation.Interpolator):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorDrawablesExit(android.view.animation.Interpolator):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorSelector(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorSelector(android.view.animation.Interpolator):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorSelector(android.view.animation.Interpolator):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setInterpolatorSelector(android.view.animation.Interpolator r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorSelector(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorSelector(android.view.animation.Interpolator):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorSelector(android.view.animation.Interpolator):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorText(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorText(android.view.animation.Interpolator):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorText(android.view.animation.Interpolator):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setInterpolatorText(android.view.animation.Interpolator r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorText(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorText(android.view.animation.Interpolator):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorText(android.view.animation.Interpolator):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorTextExit(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorTextExit(android.view.animation.Interpolator):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorTextExit(android.view.animation.Interpolator):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setInterpolatorTextExit(android.view.animation.Interpolator r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorTextExit(android.view.animation.Interpolator):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorTextExit(android.view.animation.Interpolator):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setInterpolatorTextExit(android.view.animation.Interpolator):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnClickedButtonListener):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnClickedButtonListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnClickedButtonListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup.OnClickedButtonListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnClickedButtonListener):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnClickedButtonListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnClickedButtonListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup.OnLongClickedButtonListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnLongClickedButtonListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnLongClickedButtonListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnPositionChangedListener):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnPositionChangedListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnPositionChangedListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup.OnPositionChangedListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnPositionChangedListener):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnPositionChangedListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setOnPositionChangedListener(co.ceryle.radiorealbutton.RadioRealButtonGroup$OnPositionChangedListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setPosition(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setPosition(int r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int, boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setPosition(int, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRadius(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRadius(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRadius(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setRadius(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRadius(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRadius(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setRadius(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAboveOfBottomLine(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAboveOfBottomLine(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAboveOfBottomLine(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorAboveOfBottomLine(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAboveOfBottomLine(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAboveOfBottomLine(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorAboveOfBottomLine(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorBottom(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorBottom(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorBottom(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorBottom(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorBottom(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorBottom(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorBottom(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorColor(int):void, dex: classes.dex
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
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorRadius(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorRadius(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorRadius(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorRadius(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorRadius(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorRadius(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorRadius(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorSize(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorSize(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorSize(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorSize(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorSize(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorToFront(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorToFront(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorToFront(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorToFront(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorToFront(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorToFront(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorToFront(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorTop(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorTop(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorTop(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setSelectorTop(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorTop(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorTop(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RadioRealButtonGroup.setSelectorTop(boolean):void");
    }
}
