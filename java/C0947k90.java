import android.app.Activity;
import android.content.Context;
import android.view.InputEvent;
import android.view.View;
import com.google.common.util.concurrent.ListenableFuture;

/* renamed from: k90 */
public interface C0947k90 {
    ListenableFuture a();

    ListenableFuture a(Context context);

    ListenableFuture a(Context context, String str, View view, Activity activity);

    void a(InputEvent inputEvent);

    ListenableFuture b(Context context, String str, View view, Activity activity);

    String b();
}
