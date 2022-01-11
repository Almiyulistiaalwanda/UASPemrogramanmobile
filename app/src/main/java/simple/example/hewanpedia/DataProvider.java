package simple.example.hewanpedia;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

import simple.example.hewanpedia.model.Hewan;
import simple.example.hewanpedia.model.Kelinci;
import simple.example.hewanpedia.model.Rusa;
import simple.example.hewanpedia.model.Serigala;

public class DataProvider {
    private static List<Hewan> hewans = new ArrayList<>();

    private static List<Kelinci> initDataKelinci(Context ctx) {
        List<Kelinci> kelincis = new ArrayList<>();
        kelincis.add(new Kelinci(ctx.getString(R.string.kelinci_anggora_nama), ctx.getString(R.string.kelinci_anggora_asal),
                ctx.getString(R.string.kelinci_anggora_deskripsi), R.drawable.kelinci_1));
        kelincis.add(new Kelinci(ctx.getString(R.string.kelinci_lop_nama), ctx.getString(R.string.kelinci_lop_asal),
                ctx.getString(R.string.kelinci_lop_deskripsi), R.drawable.kelinci_2));
        kelincis.add(new Kelinci(ctx.getString(R.string.kelinci_rex_nama), ctx.getString(R.string.kelinci_rex_asal),
                ctx.getString(R.string.kelinci_rex_deskripsi), R.drawable.kelinci_3));
        kelincis.add(new Kelinci(ctx.getString(R.string.kelinci_netherland_dwarf_nama), ctx.getString(R.string.kelinci_netherland_dwarf_asal),
                ctx.getString(R.string.kelinci_netherland_dwarf_deskripsi), R.drawable.kelinci_4));
        kelincis.add(new Kelinci(ctx.getString(R.string.kelinci_dutch_nama), ctx.getString(R.string.kelinci_dutch_nama),
                ctx.getString(R.string.kelinci_dutch_asal), R.drawable.kelinci_5));
        kelincis.add(new Kelinci(ctx.getString(R.string.kelinci_lionhead_nama), ctx.getString(R.string.kelinci_lionhead_asal),
                ctx.getString(R.string.kelinci_lop_deskripsi), R.drawable.kelinci_6));
        return kelincis;
    }

    private static List<Serigala> initDataSerigala(Context ctx) {
        List<Serigala> serigalas = new ArrayList<>();
        serigalas.add(new Serigala(ctx.getString(R.string.serigala_arktik_nama), ctx.getString(R.string.serigala_arktik_asal),
                ctx.getString(R.string.serigala_arktik_deskripsi), R.drawable.serigala_1));
        serigalas.add(new Serigala(ctx.getString(R.string.serigala_arab_nama), ctx.getString(R.string.serigala_arab_asal),
                ctx.getString(R.string.serigala_arab_deskripsi), R.drawable.serigala_2));
        serigalas.add(new Serigala(ctx.getString(R.string.serigala_rusia_nama), ctx.getString(R.string.serigala_rusia_asal),
                ctx.getString(R.string.serigala_rusia_deskripsi), R.drawable.serigala_3));
        serigalas.add(new Serigala(ctx.getString(R.string.serigala_jepang_nama), ctx.getString(R.string.serigala_jepang_asal),
                ctx.getString(R.string.serigala_jepang_deskripsi), R.drawable.serigala_4));
        serigalas.add(new Serigala(ctx.getString(R.string.serigala_abu_abu_nama), ctx.getString(R.string.serigala_abu_abu_asal),
                ctx.getString(R.string.serigala_abu_abu_deskripsi), R.drawable.serigala_5));
        serigalas.add(new Serigala(ctx.getString(R.string.serigala_tundra_nama), ctx.getString(R.string.serigala_tundra_asal),
                ctx.getString(R.string.serigala_tundra_deskripsi), R.drawable.serigala_6));

        return serigalas;
    }
    private static List<Rusa> initDataRusa(Context ctx) {
        List<Rusa> rusass = new ArrayList<>();
        rusass.add(new Rusa(ctx.getString(R.string.rusa_totol_nama), ctx.getString(R.string.rusa_totol_asal),
                ctx.getString(R.string.rusa_totol_deskripsi), R.drawable.rusa_1));
        rusass.add(new Rusa(ctx.getString(R.string.rusa_bawean_nama), ctx.getString(R.string.rusa_bawean_asal),
                ctx.getString(R.string.rusa_bawean_deskripsi), R.drawable.rusa_2));
        rusass.add(new Rusa(ctx.getString(R.string.rusa_timor_nama), ctx.getString(R.string.rusa_timor_asal),
                ctx.getString(R.string.rusa_timor_deskripsi), R.drawable.rusa_3));
        rusass.add(new Rusa(ctx.getString(R.string.rusa_sambar_nama), ctx.getString(R.string.rusa_sambar_asal),
                ctx.getString(R.string.rusa_sambar_deskripsi), R.drawable.rusa_4));
        rusass.add(new Rusa(ctx.getString(R.string.kijang_kuning_nama), ctx.getString(R.string.kijang_kuning_asal),
                ctx.getString(R.string.kijang_kuning_deskripsi), R.drawable.rusa_5));
        rusass.add(new Rusa(ctx.getString(R.string.kijang_muncak_nama), ctx.getString(R.string.kijang_muncak_asal),
                ctx.getString(R.string.kijang_muncak_deskripsi), R.drawable.rusa_6));
        return rusass;
    }

    private static void initAllHewans(Context ctx) {
        hewans.addAll(initDataKelinci(ctx));
        hewans.addAll(initDataSerigala(ctx));
        hewans.addAll(initDataRusa(ctx));
    }

    public static List<Hewan> getAllHewan(Context ctx) {
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        return  hewans;
    }

    public static List<Hewan> getHewansByTipe(Context ctx, String jenis) {
        List<Hewan> hewansByType = new ArrayList<>();
        if (hewans.size() == 0) {
            initAllHewans(ctx);
        }
        for (Hewan h : hewans) {
            if (h.getJenis().equals(jenis)) {
                hewansByType.add(h);
            }
        }
        return hewansByType;
    }

}
