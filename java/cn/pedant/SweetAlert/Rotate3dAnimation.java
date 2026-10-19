package cn.pedant.SweetAlert;

import android.graphics.Camera;
import android.view.animation.Animation;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class Rotate3dAnimation extends Animation {
    public static final int ROLL_BY_X = 0;
    public static final int ROLL_BY_Y = 1;
    public static final int ROLL_BY_Z = 2;
    private Camera mCamera;
    private float mFromDegrees;
    private float mPivotX;
    private int mPivotXType;
    private float mPivotXValue;
    private float mPivotY;
    private int mPivotYType;
    private float mPivotYValue;
    private int mRollType;
    private float mToDegrees;

    public static class Description {
        public int type;
        public float value;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.Description.<init>():void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.Description.<init>():void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.Description.<init>():void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public Description() {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.Description.<init>():void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.Description.<init>():void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.Description.<init>():void");
        }
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public Rotate3dAnimation(int r1, float r2, float r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, float, float):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, float, float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, float, float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public Rotate3dAnimation(int r1, float r2, float r3, float r4, float r5) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, float, float):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, float, float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, float, float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, int, float, int, float):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, int, float, int, float):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, int, float, int, float):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public Rotate3dAnimation(int r1, float r2, float r3, int r4, float r5, int r6, float r7) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, int, float, int, float):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, int, float, int, float):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(int, float, float, int, float, int, float):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public Rotate3dAnimation(android.content.Context r1, android.util.AttributeSet r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(android.content.Context, android.util.AttributeSet):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.initializePivotPoint():void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.initializePivotPoint():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.initializePivotPoint():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void initializePivotPoint() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.initializePivotPoint():void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.initializePivotPoint():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.initializePivotPoint():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void applyTransformation(float r1, android.view.animation.Transformation r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.applyTransformation(float, android.view.animation.Transformation):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.initialize(int, int, int, int):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.initialize(int, int, int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.initialize(int, int, int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void initialize(int r1, int r2, int r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.initialize(int, int, int, int):void, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.initialize(int, int, int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.initialize(int, int, int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.parseValue(android.util.TypedValue):cn.pedant.SweetAlert.Rotate3dAnimation$Description, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.parseValue(android.util.TypedValue):cn.pedant.SweetAlert.Rotate3dAnimation$Description, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.parseValue(android.util.TypedValue):cn.pedant.SweetAlert.Rotate3dAnimation$Description, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.Rotate3dAnimation.Description parseValue(android.util.TypedValue r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.Rotate3dAnimation.parseValue(android.util.TypedValue):cn.pedant.SweetAlert.Rotate3dAnimation$Description, dex: classes.dex in method: cn.pedant.SweetAlert.Rotate3dAnimation.parseValue(android.util.TypedValue):cn.pedant.SweetAlert.Rotate3dAnimation$Description, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.Rotate3dAnimation.parseValue(android.util.TypedValue):cn.pedant.SweetAlert.Rotate3dAnimation$Description");
    }
}
