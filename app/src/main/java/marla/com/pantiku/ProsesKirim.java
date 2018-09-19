package marla.com.pantiku;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.telephony.SmsManager;
import android.widget.TextView;
import android.widget.Toast;


public class ProsesKirim extends AppCompatActivity {
    TextView donatur, alamat_donatur, nominal_donatur, nama_p, norek_p, judul;
    Bundle data;
    String DONATUR, ALAMAT_DONATUR, NOMINAL_DONATUR, NAMA_P, NOREK_P, JUDUL;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.proses_kirim);

        judul = (TextView) findViewById(R.id.tittle);
        donatur = (TextView) findViewById(R.id.namadonatur);
        alamat_donatur = (TextView) findViewById(R.id.alamatdonatur);
        nominal_donatur = (TextView) findViewById(R.id.nominaldonatur);
        nama_p= (TextView) findViewById(R.id.nama_panti);
        norek_p= (TextView) findViewById(R.id.norek_panti);
        data = getIntent().getExtras();

        JUDUL = data.getString("judul");
        DONATUR = data.getString("nama_donatur");
        ALAMAT_DONATUR = data.getString("alamat_donatur");
        NOMINAL_DONATUR = data.getString("nominal_donatur");
        NAMA_P = data.getString("nama_panti");
        NOREK_P = data.getString("norek_panti");

        donatur.setText(DONATUR);
        judul.setText(JUDUL);
        alamat_donatur.setText(ALAMAT_DONATUR);
        nominal_donatur.setText(NOMINAL_DONATUR);
        nama_p.setText(NAMA_P);
        norek_p.setText(NOREK_P);



        sendSmsByManager( JUDUL + "\n" +
                "NAMA  : \n" + DONATUR + "\n" +
                "ALAMAT  : \n " + ALAMAT_DONATUR + "\n" +
                "NOMINAL  : \n "  + NOMINAL_DONATUR + "\n");
    }
    public void sendSmsByManager(String isipesan) {

        try {
            SmsManager smsManager = SmsManager.getDefault();
            smsManager.sendTextMessage(NOREK_P,null,isipesan, null, null);
            Toast.makeText(getApplicationContext(), "Konfirmasi Berhasil!, Terima Kasih Atas Donasinya...",
                    Toast.LENGTH_SHORT).show();
        } catch (Exception ex) {
            Toast.makeText(getApplicationContext(),"Konfirmasi Gagal!, Silahkan coba beberapa saat lagi!",
                    Toast.LENGTH_SHORT).show();
            ex.printStackTrace();
        }
    }
}
