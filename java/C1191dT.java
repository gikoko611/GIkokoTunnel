import android.os.Bundle;
import defpackage.AQ;
import defpackage.HJ;
import defpackage.R00;
import defpackage.S1;
import defpackage.U1;
import defpackage.UL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* DevToolsApp ERROR: NullPointerException in pass: b
    java.lang.NullPointerException: Attempt to invoke interface method 'java.util.Iterator java.util.List.iterator()' on a null object reference
    	at U4.b.f(SourceFile:555)
    	at androidx.work.D.T(SourceFile:1)
    	at n1.c.u(SourceFile:42)
    	at n1.c.u(SourceFile:83)
    	at C4.c.run(SourceFile:73)
    */
/* renamed from: dT */
public final class C1191dT {
    @Nullable
    @C1913oR("rc_br")
    public Integer A;
    @Nullable
    @C1913oR("vnm")
    public String A0;
    @Nullable
    @C1913oR("preferred_ad_choices_position")
    public Integer A1;
    @C1913oR("tag_for_child_directed_treatment")
    public int B;
    @Nullable
    @C1913oR("dl")
    public String B0;
    @Nullable
    @C1913oR("nrwv")
    public Integer B1;
    @Nullable
    @C1913oR("tfat")
    public Integer C;
    @Nullable
    @C1913oR("request_id")
    public String C0;
    @Nullable
    @C1913oR("topics")
    public String C1;
    @Nullable
    @C1913oR("eco")
    public C2565yz D;
    @Nullable
    @C1913oR("rtb")
    public String D0;
    @Nullable
    @C1913oR("atps")
    public Integer D1;
    @C1913oR("test_request")
    public boolean E;
    public List E0;
    @C1913oR("aos")
    public int E1;
    @C1913oR("d_imp_hdr")
    public boolean F;
    @Nullable
    @C1913oR("gmp_app_id")
    public String F0;
    @Nullable
    @C1913oR("ibrr")
    public Boolean F1;
    @Nullable
    @C1913oR("ppid")
    public String G;
    @Nullable
    @C1913oR("fbs_aiid")
    public String G0;
    @Nullable
    @C1913oR("iconad")
    public Boolean G1;
    @Nullable
    @C1913oR("url")
    public String H;
    @Nullable
    @C1913oR("fbs_aeid")
    public String H0;
    @Nullable
    @C1913oR("iconad_placement")
    public Integer H1;
    @Nullable
    @C1913oR("neighboring_content_urls")
    public Set<String> I;
    @Nullable
    @C1913oR("apm_id_origin")
    public String I0;
    @Nullable
    @C1913oR("correlation_id")
    public String I1;
    @Nullable
    @C1913oR("custom_targeting")
    public Map<String, String> J;
    @Nullable
    @C1913oR("app_wp_code")
    public String J0;
    @Nullable
    @C1913oR("uses_media_view")
    public Boolean J1;
    @Nullable
    @C1913oR("request_agent")
    public String K;
    @Nullable
    @C1913oR("app_code")
    public String K0;
    @Nullable
    @C1913oR("ins_pn")
    public String K1;
    @C1913oR("tag_for_under_age_of_consent")
    public int L;
    @NotNull
    @C1913oR("js")
    public String L0;
    @Nullable
    @C1913oR("ini_pn")
    public String L1;
    @Nullable
    @C1913oR("max_ad_content_rating")
    public String M;
    @C1913oR("is_nonagon")
    public final boolean M0;
    @Nullable
    @C1913oR("signal_type")
    public String M1;
    @Nullable
    @C1913oR("arek")
    public String N;
    @C1913oR("is_decagon")
    public boolean N0;
    @Nullable
    @C1913oR("scar")
    public Boolean N1;
    @NotNull
    @C1913oR("ms")
    public String O;
    @Nullable
    @C1913oR("extra_caps")
    public String O0;
    @Nullable
    @C1913oR("ppt_p13n")
    public Integer O1;
    @NotNull
    @C1913oR("ad_types")
    public final ArrayList<String> P;
    @Nullable
    @C1913oR("target_api")
    public Integer P0;
    @Nullable
    @C1913oR("lft")
    public Integer P1;
    @NotNull
    @C1913oR("installed_adapter_data")
    public final Map<String, C1077c2> Q;
    @Nullable
    @C1913oR("ev")
    public String Q0;
    @Nullable
    @C1913oR("p_signals")
    public Map<String, String> Q1;
    @Nullable
    @C1913oR("app_switched")
    public Boolean R;
    @NotNull
    @C1913oR("sdk_env")
    public final AQ R0;
    @Nullable
    @C1913oR("is_sdk_preload")
    public Boolean R1;
    @NotNull
    @C1913oR("android_permissions")
    public final ArrayList<String> S;
    @Nullable
    @C1913oR("cog")
    public Boolean S0;
    @Nullable
    @C1913oR("dspct")
    public Integer S1;
    @NotNull
    @C1913oR("pii")
    public final HJ T;
    @Nullable
    @C1913oR("coh")
    public Boolean T0;
    @Nullable
    @C1913oR("l_signals")
    public C2565yz T1;
    @Nullable
    @C1913oR("quality_signals")
    public UL U;
    @Nullable
    @C1913oR("gl")
    public String U0;
    @Nullable
    @C1913oR("parent_ad_config")
    public C2525yJ U1;
    @C1913oR("am")
    public int V;
    @Nullable
    @C1913oR("dgl")
    public String V0;
    @Nullable
    @C1913oR("m_state")
    public Map<String, String> V1;
    @C1913oR("ma")
    public boolean W;
    @Nullable
    @C1913oR("simulator")
    public Boolean W0;
    @Nullable
    @C1913oR("max_num_ads")
    public Integer W1;
    @C1913oR("sp")
    public boolean X;
    @C1913oR("is_latchsky")
    public boolean X0;
    @Nullable
    @C1913oR("csrb_output")
    public C0133Ed X1;
    @C1913oR("muv")
    public int Y;
    @Nullable
    @C1913oR("hl")
    public String Y0;
    @Nullable
    @C1913oR("parent_common_config")
    public C2583zJ Y1;
    @Nullable
    @C1913oR("muv_min")
    public Integer Z;
    @Nullable
    @C1913oR("client_hl")
    public String Z0;
    @Nullable
    @C1913oR("tsi")
    private Long Z1;
    @NotNull
    @C1913oR("adid_p")
    public String a;
    @Nullable
    @C1913oR("muv_max")
    public Integer a0;
    @NotNull
    @C1913oR("hl_list")
    public final ArrayList<String> a1;
    @Nullable
    @C1913oR("s2s_rr")
    private Integer a2;
    @NotNull
    @C1913oR("valid_ad_sizes")
    public final ArrayList<S1> b;
    @Nullable
    @C1913oR("muv_percent")
    public Double b0;
    @Nullable
    @C1913oR("dlc")
    public String b1;
    @Nullable
    @C1913oR("ic")
    private Boolean b2;
    @C1913oR("is_greater_than_max_allowed_banner_size")
    public boolean c;
    @C1913oR("rm")
    public int c0;
    @Nullable
    @C1913oR("mv")
    public String c1;
    @Nullable
    @C1913oR("isi")
    public Boolean c2;
    @Nullable
    @C1913oR("rafmt")
    public String d;
    @C1913oR("riv")
    public int d0;
    @Nullable
    @C1913oR("submodel")
    public String d1;
    @Nullable
    @C1913oR("max_shd_s")
    public Integer d2;
    @Nullable
    @C1913oR("inline_adaptive_slot")
    public Boolean e;
    @C1913oR("android_app_volume")
    public float e0;
    @Nullable
    @C1913oR("is_bstar")
    public Boolean e1;
    @Nullable
    @C1913oR("max_w")
    public Integer e2;
    @Nullable
    @C1913oR("format")
    public String f;
    @C1913oR("android_app_muted")
    public boolean f0;
    @Nullable
    @C1913oR("build_api_level")
    public Integer f1;
    @Nullable
    @C1913oR("max_h")
    public Integer f2;
    @Nullable
    @C1913oR("fluid")
    public String g;
    @NotNull
    @C1913oR("device")
    public final C0984al g0;
    @Nullable
    @C1913oR("carrier")
    public String g1;
    @Nullable
    @C1913oR("pcr")
    public Boolean g2;
    @Nullable
    @C1913oR("sz")
    public String h;
    @C1913oR("cldut")
    public long h0;
    @Nullable
    @C1913oR("cnt")
    public Integer h1;
    @Nullable
    @C1913oR("cpr")
    public Boolean h2;
    @C1913oR("u_sd")
    public float i;
    @Nullable
    @C1913oR("fwd_cld")
    public String i0;
    @Nullable
    @C1913oR("gnt")
    public Integer i1;
    @C1913oR("sw")
    public int j;
    @Nullable
    @C1913oR("fwd_cld_obj")
    public C1412gz j0;
    @Nullable
    @C1913oR("pt")
    public Integer j1;
    @C1913oR("sh")
    public int k;
    @Nullable
    @C1913oR("fwd_common_cld")
    public String k0;
    @Nullable
    @C1913oR("eid")
    public String k1;
    @C1913oR("u_w")
    public int l;
    @Nullable
    @C1913oR("fwd_common_cld_obj")
    public C2565yz l0;
    @Nullable
    @C1913oR("support_transparent_background")
    public Boolean l1;
    @C1913oR("u_h")
    public int m;
    @NotNull
    @C1913oR("shared_pref")
    public Bundle m0;
    @Nullable
    @C1913oR("session_id")
    public String m1;
    @Nullable
    @C1913oR("u_so")
    public String n;
    @Nullable
    @C1913oR("gct")
    public String n0;
    @Nullable
    @C1913oR("ad_unit_quality_signals")
    public U1 n1;
    @Nullable
    @C1913oR("slotname")
    public String o;
    @Nullable
    @C1913oR("de")
    public String o0;
    @Nullable
    @C1913oR("extras")
    public Bundle o1;
    @Nullable
    @C1913oR("rbv")
    public Boolean p;
    @Nullable
    @C1913oR("collect_response_logs")
    public Boolean p0;
    @Nullable
    @C1913oR("native_version")
    public Integer p1;
    @Nullable
    @C1913oR("rbi")
    public Boolean q;
    @C1913oR("test_mode")
    public int q0;
    @Nullable
    @C1913oR("native_templates")
    public List<String> q1;
    @C1913oR("start_signals_timestamp")
    public long r;
    @C1913oR("linked_device")
    public int r0;
    @Nullable
    @C1913oR("native_custom_templates")
    public List<String> r1;
    @Nullable
    @C1913oR("kw")
    public ArrayList<String> s;
    @Nullable
    @C1913oR("inspector_extras")
    public String s0;
    @Nullable
    @C1913oR("enable_native_media_orientation")
    public Boolean s1;
    @Nullable
    @C1913oR("sam_l")
    public Integer t;
    @Nullable
    @C1913oR("risd")
    public Integer t0;
    @Nullable
    @C1913oR("native_media_orientation")
    public String t1;
    @Nullable
    @C1913oR("sam_t")
    public Integer u;
    @Nullable
    @C1913oR("omid_v")
    public String u0;
    @Nullable
    @C1913oR("use_custom_mute")
    public Boolean u1;
    @Nullable
    @C1913oR("sam_r")
    public Integer v;
    @Nullable
    @C1913oR("client_omid_v")
    public String v0;
    @Nullable
    @C1913oR("ccg_on")
    public Boolean v1;
    @Nullable
    @C1913oR("sam_b")
    public Integer w;
    @Nullable
    @C1913oR("client_omid_p")
    public String w0;
    @Nullable
    @C1913oR("sccg_dir")
    public Integer w1;
    @Nullable
    @C1913oR("rc_tl")
    public Integer x;
    @NotNull
    @C1913oR("pn")
    public String x0;
    @Nullable
    @C1913oR("sccg_tap")
    public Boolean x1;
    @Nullable
    @C1913oR("rc_tr")
    public Integer y;
    @Nullable
    @C1913oR("vc")
    public Integer y0;
    @Nullable
    @C1913oR("video")
    public R00 y1;
    @Nullable
    @C1913oR("rc_bl")
    public Integer z;
    @Nullable
    @C1913oR("an")
    public String z0;
    @Nullable
    @C1913oR("disable_image_loading")
    public Boolean z1;

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: dT.<init>():void, dex: classes.dex in method: dT.<init>():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: dT.<init>():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public C1191dT() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: dT.<init>():void, dex: classes.dex in method: dT.<init>():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: dT.<init>():void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: dT.a(java.lang.Long):void, dex: classes.dex in method: dT.a(java.lang.Long):void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: dT.a(java.lang.Long):void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void a(java.lang.Long r1) {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: dT.a(java.lang.Long):void, dex: classes.dex in method: dT.a(java.lang.Long):void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: dT.a(java.lang.Long):void");
    }

    /* DevToolsApp ERROR: Method load error
        g.d.a.b.DevToolsAppDecodeE: Load method exception: bogus element_width: 0000 in method: dT.b():void, dex: classes.dex in method: dT.b():void, dex: classes.dex
        	at O4.o.y(SourceFile:95)
        	at O4.b.v(SourceFile:19)
        	at n1.c.u(SourceFile:19)
        	at n1.c.u(SourceFile:83)
        	at C4.c.run(SourceFile:73)
        Caused by: g.d.a.b.DevToolsAppDecodeE: bogus element_width: 0000 in method: dT.b():void, dex: classes.dex
        	at v0.s.u(SourceFile:75)
        	at O4.o.y(SourceFile:40)
        	... 4 more
        Caused by: com.android.dex.DexException: bogus element_width: 0000
        	at com.android.dx.io.instructions.InstructionCodec$36.h(SourceFile:59)
        	at v0.s.u(SourceFile:53)
        	... 5 more
        */
    public final void b() {
        /*
        // Can't load method instructions: Load method exception: bogus element_width: 0000 in method: dT.b():void, dex: classes.dex in method: dT.b():void, dex: classes.dex
        */
        throw new UnsupportedOperationException("Method not decompiled: dT.b():void");
    }
}
