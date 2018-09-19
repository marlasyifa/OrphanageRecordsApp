package marla.com.pantiku;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by Taufiq on 6/5/2017.
 */

public class Database extends SQLiteOpenHelper {
    private static final String DATABASE_NAME="Data_Panti.db";
    private static final int DATABASE_VERSION = 1;
    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String sql = "create table panti(nama_panti text not null, alamat text not null, no_telp char null, no_rek char null);";
        Log.d("Data", "onCreate: " + sql);
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Ar Ridho', 'Kampung Kandang, RT. 1/2, Duren Seribu, Sawangan, Pengasinan, Sawangan, Kota Depok, Jawa Barat 16518', '089621035648', '134-000-714-2929 a/n Marla Nur Assyifa');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Darul Ilmi', 'Jl. KH. Ahmad Dahlan, No. 24, Beji Timur, Beji, Kota Depok, Jawa Barat 16425', '085224132432', '134-000-421-3400 a/n Yuli Andrianti');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Wisma Karya Bakti', 'RT03 RW10 Kelurahan Kecamatan Bojongsari, Jl. Raya Curug, Curug, Bojongsari, Kota Depok, Jawa Barat 16517', '082211092141', '120-000-124-1079 a/n Opik Taopik');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan An Nur', 'Jl. Bumi Pancoran Mas No. 27, RT. 03 / RW. 12, Mampang, Pancoran Mas, Kota Depok, Jawa Barat 16433', '081316620436', '134-001-130-5231 a/n Marsa Al Musyaffa');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Fajar Baru', 'Jalan Tiga Berlian Raya Blok A4 No.4, Mekarsari, Cimanggis, Mekarsari, Cimanggis, Kota Depok, Jawa Barat 16452', '081299041650', '034-888-9016 a/n Falah Akbar');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Yayasan Putri Bungsu', 'Jl. Sumur Bandung 1, Harjamukti, Cimanggis, Kota Depok, Jawa Barat 16454', '083812105012', '044-575-1042 a/n Marla Nur Assyifa');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Al Muhajirin', 'Jl. Waru Jaya No.9A, Mekar Jaya, Sukmajaya, Kota Depok, Jawa Barat 16411', '082298911937', '101-000-7036-138 a/n Selvy Yuni Astuti');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Karena Doa', 'Jl. H. Sulaeman No. 56, Bedahan, Sawangan, Kota Depok, Jawa Barat 16519', '081210196982', '502-238-3870 a/n Marla Nur Assyifa');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Wisma Tuna Ganda Palsigunung', 'Jl. Raya Bogor, Pekayon, Cimanggis, Kota Depok, Jawa Barat 16451', '082295108658', '166-000180-2131 a/n Galuh Arum Sekarini');";
        db.execSQL(sql);
        sql = "INSERT INTO panti (nama_panti, alamat, no_telp, no_rek) VALUES ('Panti Asuhan Yatim dan Dhuafa Nurul Ikhlas', 'Jl. Leuwinanggung, RT.01/RW.03, Leuwinanggung, Tapos, Kota Depok, Jawa Barat 16456 ', '085797449722', '138-001-451-9214 a/n Falah Akbar');";
        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

    }
}


