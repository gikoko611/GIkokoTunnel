package com.google.android.play.core.hsdp.service;

import android.os.Bundle;
import java.util.List;
import java.util.Map;

public interface HsdpDeepLinkService {
    public static final String SDK_VERSION = "2.0.0";

    public interface HsdpDeepLinkServiceListener {
        void onAffordanceEnded();

        void onAffordanceStarted();

        void onDeepLinkStarted();

        void onDismissed(Bundle bundle);

        void onError(Bundle bundle);

        void onShown(Bundle bundle);
    }

    public interface HsdpPrewarmListener {
        void onCompleted(Bundle bundle);

        void onError(Bundle bundle);
    }

    public interface AffordanceListener {
        void onError(String str);

        void onStop();
    }

    void detach();

    void dismiss(String str);

    void endSession(String str);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map<String, String> map);

    void open(String str, String str2, HsdpDeepLinkServiceListener hsdpDeepLinkServiceListener, Map<String, String> map, boolean z);

    void prewarm(List<HsdpPrewarmRequest> list, HsdpPrewarmListener hsdpPrewarmListener);

    void stopAffordance(String str, AffordanceListener affordanceListener);
}
