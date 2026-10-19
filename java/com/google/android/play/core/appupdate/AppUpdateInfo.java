package com.google.android.play.core.appupdate;

import android.app.PendingIntent;
import com.google.android.play.core.install.model.InstallStatus;
import com.google.android.play.core.install.model.UpdateAvailability;
import java.util.Map;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at C4.c.run(SourceFile:73)
    */
public class AppUpdateInfo {
    private final String zza;
    private final int zzb;
    @UpdateAvailability
    private final int zzc;
    @InstallStatus
    private final int zzd;
    private final Integer zze;
    private final int zzf;
    private final long zzg;
    private final long zzh;
    private final long zzi;
    private final long zzj;
    private final PendingIntent zzk;
    private final PendingIntent zzl;
    private final PendingIntent zzm;
    private final PendingIntent zzn;
    private final Map zzo;
    private boolean zzp;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.<init>(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.<init>(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.<init>(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private AppUpdateInfo(java.lang.String r1, int r2, @com.google.android.play.core.install.model.UpdateAvailability int r3, @com.google.android.play.core.install.model.InstallStatus int r4, java.lang.Integer r5, int r6, long r7, long r9, long r11, long r13, android.app.PendingIntent r15, android.app.PendingIntent r16, android.app.PendingIntent r17, android.app.PendingIntent r18, java.util.Map r19) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.<init>(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.<init>(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.<init>(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzb(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):com.google.android.play.core.appupdate.AppUpdateInfo, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzb(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):com.google.android.play.core.appupdate.AppUpdateInfo, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzb(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):com.google.android.play.core.appupdate.AppUpdateInfo, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public static com.google.android.play.core.appupdate.AppUpdateInfo zzb(java.lang.String r1, int r2, @com.google.android.play.core.install.model.UpdateAvailability int r3, @com.google.android.play.core.install.model.InstallStatus int r4, java.lang.Integer r5, int r6, long r7, long r9, long r11, long r13, android.app.PendingIntent r15, android.app.PendingIntent r16, android.app.PendingIntent r17, android.app.PendingIntent r18, java.util.Map r19) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzb(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):com.google.android.play.core.appupdate.AppUpdateInfo, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzb(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):com.google.android.play.core.appupdate.AppUpdateInfo, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.zzb(java.lang.String, int, int, int, java.lang.Integer, int, long, long, long, long, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, android.app.PendingIntent, java.util.Map):com.google.android.play.core.appupdate.AppUpdateInfo");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zze(java.util.Set):java.util.Set, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zze(java.util.Set):java.util.Set, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zze(java.util.Set):java.util.Set, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private static java.util.Set zze(java.util.Set r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zze(java.util.Set):java.util.Set, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zze(java.util.Set):java.util.Set, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.zze(java.util.Set):java.util.Set");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzf(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzf(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzf(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    private final boolean zzf(com.google.android.play.core.appupdate.AppUpdateOptions r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzf(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzf(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.zzf(com.google.android.play.core.appupdate.AppUpdateOptions):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.availableVersionCode():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.availableVersionCode():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.availableVersionCode():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int availableVersionCode() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.availableVersionCode():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.availableVersionCode():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.availableVersionCode():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.bytesDownloaded():long, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.bytesDownloaded():long, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.bytesDownloaded():long, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public long bytesDownloaded() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.bytesDownloaded():long, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.bytesDownloaded():long, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.bytesDownloaded():long");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.clientVersionStalenessDays():java.lang.Integer, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.clientVersionStalenessDays():java.lang.Integer, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.clientVersionStalenessDays():java.lang.Integer, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.Integer clientVersionStalenessDays() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.clientVersionStalenessDays():java.lang.Integer, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.clientVersionStalenessDays():java.lang.Integer, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.clientVersionStalenessDays():java.lang.Integer");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions):java.util.Set<java.lang.Integer>, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions):java.util.Set<java.lang.Integer>, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions):java.util.Set<java.lang.Integer>, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.util.Set<java.lang.Integer> getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions):java.util.Set<java.lang.Integer>, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions):java.util.Set<java.lang.Integer>, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.getFailedUpdatePreconditions(com.google.android.play.core.appupdate.AppUpdateOptions):java.util.Set<java.lang.Integer>");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.installStatus():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.installStatus():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.installStatus():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @com.google.android.play.core.install.model.InstallStatus
    public int installStatus() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.installStatus():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.installStatus():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.installStatus():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(int):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(int):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isUpdateTypeAllowed(@com.google.android.play.core.install.model.AppUpdateType int r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(int):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(int):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(int):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public boolean isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions):boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.isUpdateTypeAllowed(com.google.android.play.core.appupdate.AppUpdateOptions):boolean");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.packageName():java.lang.String, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.packageName():java.lang.String, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.packageName():java.lang.String, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public java.lang.String packageName() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.packageName():java.lang.String, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.packageName():java.lang.String, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.packageName():java.lang.String");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.totalBytesToDownload():long, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.totalBytesToDownload():long, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.totalBytesToDownload():long, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public long totalBytesToDownload() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.totalBytesToDownload():long, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.totalBytesToDownload():long, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.totalBytesToDownload():long");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.updateAvailability():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.updateAvailability():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.updateAvailability():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    @com.google.android.play.core.install.model.UpdateAvailability
    public int updateAvailability() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.updateAvailability():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.updateAvailability():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.updateAvailability():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.updatePriority():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.updatePriority():int, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.updatePriority():int, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public int updatePriority() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.updatePriority():int, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.updatePriority():int, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.updatePriority():int");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zza(com.google.android.play.core.appupdate.AppUpdateOptions):android.app.PendingIntent, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zza(com.google.android.play.core.appupdate.AppUpdateOptions):android.app.PendingIntent, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zza(com.google.android.play.core.appupdate.AppUpdateOptions):android.app.PendingIntent, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final android.app.PendingIntent zza(com.google.android.play.core.appupdate.AppUpdateOptions r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zza(com.google.android.play.core.appupdate.AppUpdateOptions):android.app.PendingIntent, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zza(com.google.android.play.core.appupdate.AppUpdateOptions):android.app.PendingIntent, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.zza(com.google.android.play.core.appupdate.AppUpdateOptions):android.app.PendingIntent");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzc():void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzc():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzc():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final void zzc() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzc():void, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzc():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.zzc():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzd():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzd():boolean, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzd():boolean, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 3 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 4 more
        */
    public final boolean zzd() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzd():boolean, dex: classes.dex in method: com.google.android.play.core.appupdate.AppUpdateInfo.zzd():boolean, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.appupdate.AppUpdateInfo.zzd():boolean");
    }
}
