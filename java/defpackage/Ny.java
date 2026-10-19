package defpackage;

import java.util.concurrent.CancellationException;

/* renamed from: Ny */
public interface Ny extends Ig {
    public static final /* synthetic */ int Ho = 0;

    C0738dd attachChild(gd gdVar);

    /* synthetic */ void cancel();

    void cancel(CancellationException cancellationException);

    /* synthetic */ boolean cancel(Throwable th);

    CancellationException getCancellationException();

    WQ getChildren();

    C0264IQ getOnJoin();

    Ny getParent();

    xl invokeOnCompletion(yt ytVar);

    xl invokeOnCompletion(boolean z, boolean z2, yt ytVar);

    boolean isActive();

    boolean isCancelled();

    boolean isCompleted();

    Object join(vg vgVar);

    Ny plus(Ny ny);

    boolean start();
}
