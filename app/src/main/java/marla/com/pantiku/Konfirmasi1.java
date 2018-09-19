package marla.com.pantiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Konfirmasi1 extends AppCompatActivity {
    TextView namapanti, alamatpanti, norekpanti;
    EditText edt_nama, edt_alamat,edt_nominal;
    Button next;
    String NAMAPANTI, ALAMATPANTI, NOREKPANTI;
    Bundle DataExtra;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konfirmasi1);

        edt_nama = (EditText) findViewById(R.id.editnama);
        edt_alamat = (EditText) findViewById(R.id.editalamat);
        edt_nominal = (EditText) findViewById(R.id.editnominal);
        next = (Button) findViewById(R.id.konfirmasidonasi);
        namapanti = (TextView) findViewById(R.id.textisipanti);
        alamatpanti = (TextView) findViewById(R.id.textisialamat);
        norekpanti = (TextView) findViewById(R.id.textisinorek);
        DataExtra = getIntent().getExtras();

        NAMAPANTI = DataExtra.getString("nama_panti");
        ALAMATPANTI = DataExtra.getString("alamat_panti");
        NOREKPANTI = DataExtra.getString("norek_panti");

        namapanti.setText(NAMAPANTI);
        alamatpanti.setText(ALAMATPANTI);
        norekpanti.setText(NOREKPANTI);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent informasi = new Intent(getApplicationContext(), Konfirmasi2.class);
                informasi.putExtra("nama_donatur", edt_nama.getText().toString());
                informasi.putExtra("alamat_donatur", edt_alamat.getText().toString());
                informasi.putExtra("nominal_donatur", edt_nominal.getText().toString());
                informasi.putExtra("nama_panti", namapanti.getText().toString());
                informasi.putExtra("alamat_panti", alamatpanti.getText().toString());
                informasi.putExtra("norek_panti", norekpanti.getText().toString());
                startActivity(informasi);
            }
        });
    }
}


