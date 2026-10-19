package com.google.android.play.core.appupdate.testing;

import android.content.Context;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.appupdate.zzc;
import com.google.android.play.core.install.model.AppUpdateType;
import com.google.android.play.core.install.model.InstallErrorCode;
import com.google.android.play.core.install.model.InstallStatus;
import java.util.List;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class FakeAppUpdateManager implements AppUpdateManager {
    private final zzc zza;
    private final Context zzb;
    private final List zzc;
    @InstallStatus
    private int zzd;
    @InstallErrorCode
    private int zze;
    private boolean zzf;
    private int zzg;
    private Integer zzh;
    private int zzi;
    private long zzj;
    private long zzk;
    private boolean zzl;
    private boolean zzm;
    private boolean zzn;
    @AppUpdateType
    private Integer zzo;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.<init>(android.content.Context):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.<init>(android.content.Context):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.<init>(android.content.Context):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public FakeAppUpdateManager(android.content.Context r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.<init>(android.content.Context):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.<init>(android.content.Context):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.<init>(android.content.Context):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zza():int, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zza():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zza():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private static int zza() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zza():int, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zza():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zza():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzb():int, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzb():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzb():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @com.google.android.play.core.install.model.UpdateAvailability
    private final int zzb() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzb():int, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzb():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzb():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzc():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzc():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzc():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private final void zzc() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzc():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzc():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzc():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzd(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzd(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzd(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private final boolean zzd(com.google.android.play.core.appupdate.AppUpdateInfo r1, com.google.android.play.core.appupdate.AppUpdateOptions r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzd(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzd(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.zzd(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.appupdate.AppUpdateOptions):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.completeUpdate():com.google.android.gms.tasks.Task<java.lang.Void>, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.completeUpdate():com.google.android.gms.tasks.Task<java.lang.Void>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.completeUpdate():com.google.android.gms.tasks.Task<java.lang.Void>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public com.google.android.gms.tasks.Task<java.lang.Void> completeUpdate() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.completeUpdate():com.google.android.gms.tasks.Task<java.lang.Void>, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.completeUpdate():com.google.android.gms.tasks.Task<java.lang.Void>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.completeUpdate():com.google.android.gms.tasks.Task<java.lang.Void>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadCompletes():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadCompletes():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadCompletes():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void downloadCompletes() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadCompletes():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadCompletes():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadCompletes():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadFails():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadFails():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadFails():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void downloadFails() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadFails():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadFails():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadFails():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadStarts():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadStarts():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadStarts():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void downloadStarts() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadStarts():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadStarts():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.downloadStarts():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getAppUpdateInfo():com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo>, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getAppUpdateInfo():com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getAppUpdateInfo():com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo> getAppUpdateInfo() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getAppUpdateInfo():com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo>, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getAppUpdateInfo():com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getAppUpdateInfo():com.google.android.gms.tasks.Task<com.google.android.play.core.appupdate.AppUpdateInfo>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getTypeForUpdateInProgress():java.lang.Integer, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getTypeForUpdateInProgress():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getTypeForUpdateInProgress():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @com.google.android.play.core.install.model.AppUpdateType
    public java.lang.Integer getTypeForUpdateInProgress() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getTypeForUpdateInProgress():java.lang.Integer, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getTypeForUpdateInProgress():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.getTypeForUpdateInProgress():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installCompletes():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installCompletes():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installCompletes():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void installCompletes() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installCompletes():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installCompletes():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installCompletes():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installFails():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installFails():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installFails():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void installFails() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installFails():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installFails():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.installFails():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isConfirmationDialogVisible():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isConfirmationDialogVisible():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isConfirmationDialogVisible():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isConfirmationDialogVisible() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isConfirmationDialogVisible():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isConfirmationDialogVisible():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isConfirmationDialogVisible():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isImmediateFlowVisible():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isImmediateFlowVisible():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isImmediateFlowVisible():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isImmediateFlowVisible() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isImmediateFlowVisible():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isImmediateFlowVisible():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isImmediateFlowVisible():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isInstallSplashScreenVisible():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isInstallSplashScreenVisible():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isInstallSplashScreenVisible():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isInstallSplashScreenVisible() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isInstallSplashScreenVisible():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isInstallSplashScreenVisible():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.isInstallSplashScreenVisible():boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.registerListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.registerListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.registerListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void registerListener(com.google.android.play.core.install.InstallStateUpdatedListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.registerListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.registerListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.registerListener(com.google.android.play.core.install.InstallStateUpdatedListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setBytesDownloaded(long):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setBytesDownloaded(long):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setBytesDownloaded(long):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setBytesDownloaded(long r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setBytesDownloaded(long):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setBytesDownloaded(long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setBytesDownloaded(long):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setClientVersionStalenessDays(java.lang.Integer):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setClientVersionStalenessDays(java.lang.Integer):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setClientVersionStalenessDays(java.lang.Integer):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setClientVersionStalenessDays(java.lang.Integer r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setClientVersionStalenessDays(java.lang.Integer):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setClientVersionStalenessDays(java.lang.Integer):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setClientVersionStalenessDays(java.lang.Integer):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setInstallErrorCode(int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setInstallErrorCode(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setInstallErrorCode(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setInstallErrorCode(@com.google.android.play.core.install.model.InstallErrorCode int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setInstallErrorCode(int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setInstallErrorCode(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setInstallErrorCode(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setTotalBytesToDownload(long):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setTotalBytesToDownload(long):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setTotalBytesToDownload(long):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setTotalBytesToDownload(long r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setTotalBytesToDownload(long):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setTotalBytesToDownload(long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setTotalBytesToDownload(long):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setUpdateAvailable(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int, int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int, int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int, int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setUpdateAvailable(int r1, @com.google.android.play.core.install.model.AppUpdateType int r2) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int, int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int, int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateAvailable(int, int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateNotAvailable():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateNotAvailable():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateNotAvailable():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setUpdateNotAvailable() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateNotAvailable():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateNotAvailable():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdateNotAvailable():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdatePriority(int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdatePriority(int):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdatePriority(int):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void setUpdatePriority(int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdatePriority(int):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdatePriority(int):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.setUpdatePriority(int):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions):com.google.android.gms.tasks.Task<java.lang.Integer>, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions):com.google.android.gms.tasks.Task<java.lang.Integer>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions):com.google.android.gms.tasks.Task<java.lang.Integer>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final com.google.android.gms.tasks.Task<java.lang.Integer> startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo r1, android.app.Activity r2, com.google.android.play.core.appupdate.AppUpdateOptions r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions):com.google.android.gms.tasks.Task<java.lang.Integer>, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions):com.google.android.gms.tasks.Task<java.lang.Integer>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlow(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions):com.google.android.gms.tasks.Task<java.lang.Integer>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, android.app.Activity r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, android.app.Activity, int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, com.google.android.play.core.common.IntentSenderForResultStarter, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, com.google.android.play.core.common.IntentSenderForResultStarter, int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, com.google.android.play.core.common.IntentSenderForResultStarter, int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, @com.google.android.play.core.install.model.AppUpdateType int r2, com.google.android.play.core.common.IntentSenderForResultStarter r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, com.google.android.play.core.common.IntentSenderForResultStarter, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, com.google.android.play.core.common.IntentSenderForResultStarter, int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, int, com.google.android.play.core.common.IntentSenderForResultStarter, int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, android.app.Activity r2, com.google.android.play.core.appupdate.AppUpdateOptions r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, android.app.Activity, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.common.IntentSenderForResultStarter, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.common.IntentSenderForResultStarter, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.common.IntentSenderForResultStarter, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, com.google.android.play.core.common.IntentSenderForResultStarter r2, com.google.android.play.core.appupdate.AppUpdateOptions r3, int r4) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.common.IntentSenderForResultStarter, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.common.IntentSenderForResultStarter, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, com.google.android.play.core.common.IntentSenderForResultStarter, com.google.android.play.core.appupdate.AppUpdateOptions, int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, z1, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, z1, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, z1, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo r1, defpackage.z1 r2, com.google.android.play.core.appupdate.AppUpdateOptions r3) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, z1, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, z1, com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.startUpdateFlowForResult(com.google.android.play.core.appupdate.AppUpdateInfo, z1, com.google.android.play.core.appupdate.AppUpdateOptions):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.unregisterListener(com.google.android.play.core.install.InstallStateUpdatedListener):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userAcceptsUpdate():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userAcceptsUpdate():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userAcceptsUpdate():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void userAcceptsUpdate() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userAcceptsUpdate():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userAcceptsUpdate():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userAcceptsUpdate():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userCancelsDownload():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userCancelsDownload():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userCancelsDownload():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void userCancelsDownload() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userCancelsDownload():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userCancelsDownload():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userCancelsDownload():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userRejectsUpdate():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userRejectsUpdate():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userRejectsUpdate():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public void userRejectsUpdate() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userRejectsUpdate():void, dex: classes.dex in method: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userRejectsUpdate():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.testing.FakeAppUpdateManager.userRejectsUpdate():void");
    }
}
