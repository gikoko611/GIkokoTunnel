package com.google.android.recaptcha;

import com.google.android.gms.tasks.Task;
import org.jetbrains.annotations.NotNull;

public interface RecaptchaTasksClient {
    @NotNull
    Task<String> executeTask(RecaptchaAction recaptchaAction);

    @NotNull
    Task<String> executeTask(RecaptchaAction recaptchaAction, long j);
}
