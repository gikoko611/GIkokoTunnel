package cn.pedant.SweetAlert;

import android.app.Dialog;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationSet;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at U4.b.f(SourceFile:233)
    	at U4.b.f(SourceFile:233)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.lang.Object java.util.List.get(int)' on a null object reference
    	at U4.b.f(SourceFile:1852)
    	at U4.b.f(SourceFile:1673)
    	at U4.b.f(SourceFile:1673)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class SweetAlertDialog extends Dialog implements OnClickListener {
    public static final int BUTTON_CANCEL = -2;
    public static final int BUTTON_CONFIRM = -1;
    public static final int CUSTOM_IMAGE_TYPE = 4;
    public static boolean DARK_STYLE = false;
    public static final int ERROR_TYPE = 1;
    public static final int NORMAL_TYPE = 0;
    public static final int PROGRESS_TYPE = 5;
    public static final int SUCCESS_TYPE = 2;
    public static final int WARNING_TYPE = 3;
    private int contentTextSize;
    private final float defStrokeWidth;
    private int mAlertType;
    private LinearLayout mButtonsContainer;
    private Button mCancelButton;
    private Integer mCancelButtonBackgroundColor;
    private Integer mCancelButtonTextColor;
    private OnSweetClickListener mCancelClickListener;
    private String mCancelText;
    private boolean mCloseFromCancel;
    private Button mConfirmButton;
    private Integer mConfirmButtonBackgroundColor;
    private Integer mConfirmButtonTextColor;
    private OnSweetClickListener mConfirmClickListener;
    private String mConfirmText;
    private String mContentText;
    private TextView mContentTextView;
    private ImageView mCustomImage;
    private Drawable mCustomImgDrawable;
    private View mCustomView;
    private FrameLayout mCustomViewContainer;
    private View mDialogView;
    private FrameLayout mErrorFrame;
    private Animation mErrorInAnim;
    private ImageView mErrorX;
    private AnimationSet mErrorXInAnim;
    private boolean mHideConfirmButton;
    private boolean mHideKeyBoardOnDismiss;
    private AnimationSet mModalInAnim;
    private AnimationSet mModalOutAnim;
    private Button mNeutralButton;
    private Integer mNeutralButtonBackgroundColor;
    private Integer mNeutralButtonTextColor;
    private OnSweetClickListener mNeutralClickListener;
    private String mNeutralText;
    private Animation mOverlayOutAnim;
    private FrameLayout mProgressFrame;
    private ProgressHelper mProgressHelper;
    private boolean mShowCancel;
    private boolean mShowContent;
    private Animation mSuccessBowAnim;
    private FrameLayout mSuccessFrame;
    private AnimationSet mSuccessLayoutAnimSet;
    private View mSuccessLeftMask;
    private View mSuccessRightMask;
    private SuccessTickView mSuccessTick;
    private String mTitleText;
    private TextView mTitleTextView;
    private FrameLayout mWarningFrame;
    private float strokeWidth;

    /* renamed from: cn.pedant.SweetAlert.SweetAlertDialog$1 */
    public class AnonymousClass1 implements AnimationListener {
        final /* synthetic */ SweetAlertDialog this$0;

        /* renamed from: cn.pedant.SweetAlert.SweetAlertDialog$1$1 */
        public class AnonymousClass1 implements Runnable {
            final /* synthetic */ AnonymousClass1 this$1;

            /* DevToolsApp ERROR: Method load error
                g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog$1):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog$1):void, dex: classes.dex
                	at O4.o.y(SourceFile:95)
                	at O4.b.v(SourceFile:19)
                	at O4.b.v(SourceFile:55)
                	at O4.b.v(SourceFile:55)
                	at n1.c.u(SourceFile:19)
                	at C4.c.run(SourceFile:73)
                Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog$1):void, dex: classes.dex
                	at v0.s.u(SourceFile:75)
                	at O4.o.y(SourceFile:40)
                	... 5 more
                Caused by: com.android.dex.DexException: bogus element_width: 0000
                	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
                	at v0.s.u(SourceFile:53)
                	... 6 more
                */
            public AnonymousClass1(cn.pedant.SweetAlert.SweetAlertDialog.AnonymousClass1 r1) {
                /*
                // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog$1):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog$1):void, dex: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.1.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog$1):void");
            }

            /* DevToolsApp ERROR: Method load error
                g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.run():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.run():void, dex: classes.dex
                	at O4.o.y(SourceFile:95)
                	at O4.b.v(SourceFile:19)
                	at O4.b.v(SourceFile:55)
                	at O4.b.v(SourceFile:55)
                	at n1.c.u(SourceFile:19)
                	at C4.c.run(SourceFile:73)
                Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.run():void, dex: classes.dex
                	at v0.s.u(SourceFile:75)
                	at O4.o.y(SourceFile:40)
                	... 5 more
                Caused by: com.android.dex.DexException: bogus element_width: 0000
                	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
                	at v0.s.u(SourceFile:53)
                	... 6 more
                */
            public void run() {
                /*
                // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.run():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.1.run():void, dex: classes.dex
                */
                throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.1.1.run():void");
            }
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass1(cn.pedant.SweetAlert.SweetAlertDialog r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.1.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationEnd(android.view.animation.Animation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationEnd(android.view.animation.Animation):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationEnd(android.view.animation.Animation):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onAnimationEnd(android.view.animation.Animation r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationEnd(android.view.animation.Animation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationEnd(android.view.animation.Animation):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationEnd(android.view.animation.Animation):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationRepeat(android.view.animation.Animation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationRepeat(android.view.animation.Animation):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationRepeat(android.view.animation.Animation):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onAnimationRepeat(android.view.animation.Animation r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationRepeat(android.view.animation.Animation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationRepeat(android.view.animation.Animation):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationRepeat(android.view.animation.Animation):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationStart(android.view.animation.Animation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationStart(android.view.animation.Animation):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationStart(android.view.animation.Animation):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public void onAnimationStart(android.view.animation.Animation r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationStart(android.view.animation.Animation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationStart(android.view.animation.Animation):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.1.onAnimationStart(android.view.animation.Animation):void");
        }
    }

    /* renamed from: cn.pedant.SweetAlert.SweetAlertDialog$2 */
    public class AnonymousClass2 extends Animation {
        final /* synthetic */ SweetAlertDialog this$0;

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.2.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.2.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.2.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
            	at v0.s.u(SourceFile:75)
            	at O4.o.y(SourceFile:40)
            	... 4 more
            Caused by: com.android.dex.DexException: bogus element_width: 0000
            	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
            	at v0.s.u(SourceFile:53)
            	... 5 more
            */
        public AnonymousClass2(cn.pedant.SweetAlert.SweetAlertDialog r1) {
            /*
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.2.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.2.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.2.<init>(cn.pedant.SweetAlert.SweetAlertDialog):void");
        }

        /* DevToolsApp ERROR: Method load error
            g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.2.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.2.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
            	at O4.o.y(SourceFile:95)
            	at O4.b.v(SourceFile:19)
            	at O4.b.v(SourceFile:55)
            	at n1.c.u(SourceFile:19)
            	at C4.c.run(SourceFile:73)
            Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.2.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
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
            // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.2.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.2.applyTransformation(float, android.view.animation.Transformation):void, dex: classes.dex
            */
            throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.2.applyTransformation(float, android.view.animation.Transformation):void");
        }
    }

    public interface OnSweetClickListener {
        void onClick(SweetAlertDialog sweetAlertDialog);
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public SweetAlertDialog(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context, int):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public SweetAlertDialog(android.content.Context r1, int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context, int):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.<init>(android.content.Context, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$000(cn.pedant.SweetAlert.SweetAlertDialog):android.view.View, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$000(cn.pedant.SweetAlert.SweetAlertDialog):android.view.View, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$000(cn.pedant.SweetAlert.SweetAlertDialog):android.view.View, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ android.view.View access$000(cn.pedant.SweetAlert.SweetAlertDialog r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$000(cn.pedant.SweetAlert.SweetAlertDialog):android.view.View, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$000(cn.pedant.SweetAlert.SweetAlertDialog):android.view.View, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.access$000(cn.pedant.SweetAlert.SweetAlertDialog):android.view.View");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$100(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$100(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$100(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ boolean access$100(cn.pedant.SweetAlert.SweetAlertDialog r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$100(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$100(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.access$100(cn.pedant.SweetAlert.SweetAlertDialog):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$200(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$200(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$200(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ void access$200(cn.pedant.SweetAlert.SweetAlertDialog r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$200(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$200(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.access$200(cn.pedant.SweetAlert.SweetAlertDialog):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$300(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$300(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$300(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ boolean access$300(cn.pedant.SweetAlert.SweetAlertDialog r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$300(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$300(cn.pedant.SweetAlert.SweetAlertDialog):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.access$300(cn.pedant.SweetAlert.SweetAlertDialog):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$401(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$401(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$401(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ void access$401(cn.pedant.SweetAlert.SweetAlertDialog r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$401(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$401(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.access$401(cn.pedant.SweetAlert.SweetAlertDialog):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$501(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$501(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$501(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static /* synthetic */ void access$501(cn.pedant.SweetAlert.SweetAlertDialog r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.access$501(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.access$501(cn.pedant.SweetAlert.SweetAlertDialog):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.access$501(cn.pedant.SweetAlert.SweetAlertDialog):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.adjustButtonContainerVisibility():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.adjustButtonContainerVisibility():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.adjustButtonContainerVisibility():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void adjustButtonContainerVisibility() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.adjustButtonContainerVisibility():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.adjustButtonContainerVisibility():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.adjustButtonContainerVisibility():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.applyStroke():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.applyStroke():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.applyStroke():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void applyStroke() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.applyStroke():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.applyStroke():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.applyStroke():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void changeAlertType(int r1, boolean r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int, boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation(boolean):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation(boolean):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation(boolean):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void dismissWithAnimation(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation(boolean):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation(boolean):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation(boolean):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.genStrokeColor(int):int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.genStrokeColor(int):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.genStrokeColor(int):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private int genStrokeColor(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.genStrokeColor(int):int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.genStrokeColor(int):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.genStrokeColor(int):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.hideSoftKeyboard():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.hideSoftKeyboard():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.hideSoftKeyboard():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void hideSoftKeyboard() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.hideSoftKeyboard():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.hideSoftKeyboard():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.hideSoftKeyboard():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.playAnimation():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.playAnimation():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.playAnimation():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void playAnimation() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.playAnimation():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.playAnimation():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.playAnimation():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.restore():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.restore():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.restore():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void restore() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.restore():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.restore():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.restore():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setButtonBackgroundColor(android.widget.Button, java.lang.Integer):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setButtonBackgroundColor(android.widget.Button, java.lang.Integer):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setButtonBackgroundColor(android.widget.Button, java.lang.Integer):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private void setButtonBackgroundColor(android.widget.Button r1, java.lang.Integer r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setButtonBackgroundColor(android.widget.Button, java.lang.Integer):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setButtonBackgroundColor(android.widget.Button, java.lang.Integer):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setButtonBackgroundColor(android.widget.Button, java.lang.Integer):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.spToPx(float, android.content.Context):int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.spToPx(float, android.content.Context):int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.spToPx(float, android.content.Context):int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static int spToPx(float r1, android.content.Context r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.spToPx(float, android.content.Context):int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.spToPx(float, android.content.Context):int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.spToPx(float, android.content.Context):int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.cancel():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.cancel():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.cancel():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void cancel() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.cancel():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.cancel():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.cancel():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void changeAlertType(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.changeAlertType(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void dismissWithAnimation() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.dismissWithAnimation():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getAlertType():int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getAlertType():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getAlertType():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getAlertType() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getAlertType():int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getAlertType():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getAlertType():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getButton(int):android.widget.Button, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getButton(int):android.widget.Button, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getButton(int):android.widget.Button, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public android.widget.Button getButton(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getButton(int):android.widget.Button, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getButton(int):android.widget.Button, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getButton(int):android.widget.Button");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonBackgroundColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer getCancelButtonBackgroundColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonBackgroundColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonBackgroundColor():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonTextColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonTextColor():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonTextColor():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer getCancelButtonTextColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonTextColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonTextColor():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getCancelButtonTextColor():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelText():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelText():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getCancelText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getCancelText():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getCancelText():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonBackgroundColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer getConfirmButtonBackgroundColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonBackgroundColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonBackgroundColor():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonTextColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonTextColor():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonTextColor():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer getConfirmButtonTextColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonTextColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonTextColor():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmButtonTextColor():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmText():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmText():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getConfirmText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmText():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getConfirmText():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentText():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentText():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getContentText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentText():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getContentText():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentTextSize():int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentTextSize():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentTextSize():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int getContentTextSize() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentTextSize():int, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getContentTextSize():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getContentTextSize():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonBackgroundColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer getNeutralButtonBackgroundColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonBackgroundColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonBackgroundColor():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonBackgroundColor():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonTextColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonTextColor():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonTextColor():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer getNeutralButtonTextColor() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonTextColor():java.lang.Integer, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonTextColor():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getNeutralButtonTextColor():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getProgressHelper():cn.pedant.SweetAlert.ProgressHelper, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getProgressHelper():cn.pedant.SweetAlert.ProgressHelper, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getProgressHelper():cn.pedant.SweetAlert.ProgressHelper, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.ProgressHelper getProgressHelper() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getProgressHelper():cn.pedant.SweetAlert.ProgressHelper, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getProgressHelper():cn.pedant.SweetAlert.ProgressHelper, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getProgressHelper():cn.pedant.SweetAlert.ProgressHelper");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getTitleText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getTitleText():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getTitleText():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String getTitleText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.getTitleText():java.lang.String, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.getTitleText():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.getTitleText():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.hideConfirmButton():cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.hideConfirmButton():cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.hideConfirmButton():cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog hideConfirmButton() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.hideConfirmButton():cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.hideConfirmButton():cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.hideConfirmButton():cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isHideKeyBoardOnDismiss():boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.isHideKeyBoardOnDismiss():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isHideKeyBoardOnDismiss():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isHideKeyBoardOnDismiss() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isHideKeyBoardOnDismiss():boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.isHideKeyBoardOnDismiss():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.isHideKeyBoardOnDismiss():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowCancelButton():boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowCancelButton():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowCancelButton():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isShowCancelButton() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowCancelButton():boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowCancelButton():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.isShowCancelButton():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowContentText():boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowContentText():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowContentText():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isShowContentText() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowContentText():boolean, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.isShowContentText():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.isShowContentText():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onClick(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.onClick(android.view.View):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onCreate(android.os.Bundle):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.onCreate(android.os.Bundle):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onCreate(android.os.Bundle):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onCreate(android.os.Bundle r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onCreate(android.os.Bundle):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.onCreate(android.os.Bundle):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.onCreate(android.os.Bundle):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onStart():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.onStart():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onStart():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void onStart() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.onStart():void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.onStart():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.onStart():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCancelButton(int r1, cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCancelButton(java.lang.String r1, cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCancelButtonBackgroundColor(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCancelButtonTextColor(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCancelButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCancelClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCancelText(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCancelText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCancelText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setConfirmButton(int r1, cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setConfirmButton(java.lang.String r1, cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setConfirmButtonBackgroundColor(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setConfirmButtonTextColor(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setConfirmText(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setConfirmText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setContentText(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setContentText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentTextSize(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentTextSize(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentTextSize(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setContentTextSize(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentTextSize(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setContentTextSize(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setContentTextSize(int):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCustomImage(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(int):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(android.graphics.drawable.Drawable):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(android.graphics.drawable.Drawable):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(android.graphics.drawable.Drawable):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCustomImage(android.graphics.drawable.Drawable r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(android.graphics.drawable.Drawable):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(android.graphics.drawable.Drawable):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCustomImage(android.graphics.drawable.Drawable):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomView(android.view.View):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomView(android.view.View):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomView(android.view.View):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setCustomView(android.view.View r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomView(android.view.View):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setCustomView(android.view.View):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setCustomView(android.view.View):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setHideKeyBoardOnDismiss(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setHideKeyBoardOnDismiss(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setHideKeyBoardOnDismiss(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setHideKeyBoardOnDismiss(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setHideKeyBoardOnDismiss(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setHideKeyBoardOnDismiss(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setHideKeyBoardOnDismiss(boolean):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setNeutralButton(int r1, cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(int, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setNeutralButton(java.lang.String r1, cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButton(java.lang.String, cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setNeutralButtonBackgroundColor(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonBackgroundColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setNeutralButtonTextColor(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralButtonTextColor(java.lang.Integer):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog.OnSweetClickListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralClickListener(cn.pedant.SweetAlert.SweetAlertDialog$OnSweetClickListener):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setNeutralText(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setNeutralText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setStrokeWidth(float):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setStrokeWidth(float):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setStrokeWidth(float):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setStrokeWidth(float r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setStrokeWidth(float):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setStrokeWidth(float):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setStrokeWidth(float):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(int):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTitle(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(int):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(java.lang.CharSequence):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(java.lang.CharSequence):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(java.lang.CharSequence):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTitle(java.lang.CharSequence r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(java.lang.CharSequence):void, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(java.lang.CharSequence):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setTitle(java.lang.CharSequence):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setTitleText(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(int):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(int):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog setTitleText(java.lang.String r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.setTitleText(java.lang.String):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.showCancelButton(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.showCancelButton(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.showCancelButton(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog showCancelButton(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.showCancelButton(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.showCancelButton(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.showCancelButton(boolean):cn.pedant.SweetAlert.SweetAlertDialog");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.showContentText(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.showContentText(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.showContentText(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public cn.pedant.SweetAlert.SweetAlertDialog showContentText(boolean r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: cn.pedant.SweetAlert.SweetAlertDialog.showContentText(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex in method: cn.pedant.SweetAlert.SweetAlertDialog.showContentText(boolean):cn.pedant.SweetAlert.SweetAlertDialog, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: cn.pedant.SweetAlert.SweetAlertDialog.showContentText(boolean):cn.pedant.SweetAlert.SweetAlertDialog");
    }
}
