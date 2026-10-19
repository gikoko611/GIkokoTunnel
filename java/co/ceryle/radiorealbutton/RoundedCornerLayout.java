package co.ceryle.radiorealbutton;

import android.view.ViewOutlineProvider;
import android.widget.FrameLayout;

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
public class RoundedCornerLayout extends FrameLayout {
    private float cornerRadius;
    private boolean hasStroke;
    private int strokeColor;
    private int strokeSize;

    public class ButtonOutlineProvider extends ViewOutlineProvider {
        final /* synthetic */ RoundedCornerLayout this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        private ButtonOutlineProvider(co.ceryle.radiorealbutton.RoundedCornerLayout r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout, co.ceryle.radiorealbutton.RoundedCornerLayout$1):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout, co.ceryle.radiorealbutton.RoundedCornerLayout$1):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout, co.ceryle.radiorealbutton.RoundedCornerLayout$1):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public /* synthetic */ ButtonOutlineProvider(co.ceryle.radiorealbutton.RoundedCornerLayout r1, co.ceryle.radiorealbutton.RoundedCornerLayout.AnonymousClass1 r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout, co.ceryle.radiorealbutton.RoundedCornerLayout$1):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout, co.ceryle.radiorealbutton.RoundedCornerLayout$1):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.<init>(co.ceryle.radiorealbutton.RoundedCornerLayout, co.ceryle.radiorealbutton.RoundedCornerLayout$1):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.getOutline(android.view.View, android.graphics.Outline):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.getOutline(android.view.View, android.graphics.Outline):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.getOutline(android.view.View, android.graphics.Outline):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void getOutline(android.view.View r1, android.graphics.Outline r2) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.getOutline(android.view.View, android.graphics.Outline):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.getOutline(android.view.View, android.graphics.Outline):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.ButtonOutlineProvider.getOutline(android.view.View, android.graphics.Outline):void");
        }
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RoundedCornerLayout(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2, int r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public RoundedCornerLayout(android.content.Context r1, android.util.AttributeSet r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.<init>(android.content.Context, android.util.AttributeSet, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.access$000(co.ceryle.radiorealbutton.RoundedCornerLayout):float, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.access$000(co.ceryle.radiorealbutton.RoundedCornerLayout):float, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.access$000(co.ceryle.radiorealbutton.RoundedCornerLayout):float, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ float access$000(co.ceryle.radiorealbutton.RoundedCornerLayout r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.access$000(co.ceryle.radiorealbutton.RoundedCornerLayout):float, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.access$000(co.ceryle.radiorealbutton.RoundedCornerLayout):float, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.access$000(co.ceryle.radiorealbutton.RoundedCornerLayout):float");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.init(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.init(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.init(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void init(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.init(android.content.Context):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.init(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.init(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.dispatchDraw(android.graphics.Canvas):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.dispatchDraw(android.graphics.Canvas):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.dispatchDraw(android.graphics.Canvas):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void dispatchDraw(android.graphics.Canvas r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.dispatchDraw(android.graphics.Canvas):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.dispatchDraw(android.graphics.Canvas):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.dispatchDraw(android.graphics.Canvas):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setCornerRadius(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setCornerRadius(float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setCornerRadius(float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setCornerRadius(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setCornerRadius(float):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setCornerRadius(float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.setCornerRadius(float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStroke(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStroke(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStroke(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setStroke(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStroke(boolean):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStroke(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.setStroke(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeColor(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeColor(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setStrokeColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeColor(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeColor(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeColor(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeSize(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeSize(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setStrokeSize(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeSize(int):void, dex: classes.dex in method: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeSize(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: co.ceryle.radiorealbutton.RoundedCornerLayout.setStrokeSize(int):void");
    }
}
