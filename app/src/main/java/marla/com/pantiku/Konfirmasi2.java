package marla.com.pantiku;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class Konfirmasi2 extends AppCompatActivity {
    TextView namadonatur, alamatdonatur, nominaldonatur, namapanti, alamatpanti, norekpanti, judul;
    Bundle data;
    Button kirim;
    String NAMADONATUR, ALAMATDONATUR, NOMINALDONATUR, NAMAPANTI, ALAMATPANTI, NOREKPANTI;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.konfirmasi2);

        namadonatur = (TextView) findViewById(R.id.namadonatur);
        alamatdonatur = (TextView) findViewById(R.id.alamatdonatur);
        nominaldonatur = (TextView) findViewById(R.id.nominaldonatur);
        namapanti = (TextView) findViewById(R.id.nama_panti);
        alamatpanti = (TextView) findViewById(R.id.alamat_panti);
        norekpanti = (TextView) findViewById(R.id.norek_panti);
        kirim = (Button) findViewById(R.id.kirim);
        judul = (TextView) findViewById(R.id.tittle);
        data = getIntent().getExtras();

        NAMADONATUR = data.getString("nama_donatur");
        ALAMATDONATUR = data.getString("alamat_donatur");
        NOMINALDONATUR = data.getString("nominal_donatur");
        NAMAPANTI = data.getString("nama_panti");
        ALAMATPANTI = data.getString("alamat_panti");
        NOREKPANTI = data.getString("norek_panti");

        namadonatur.setText(NAMADONATUR);
        alamatdonatur.setText(ALAMATDONATUR);
        nominaldonatur.setText(NOMINALDONATUR);
        namapanti.setText(NAMAPANTI);
        alamatpanti.setText(ALAMATPANTI);
        norekpanti.setText(NOREKPANTI);

        kirim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mengirim = new Intent(getApplicationContext(), ProsesKirim.class);
                mengirim.putExtra("judul",judul.getText().toString());
                mengirim.putExtra("nama_donatur",namadonatur.getText().toString());
                mengirim.putExtra("alamat_donatur",alamatdonatur.getText().toString());
                mengirim.putExtra("nominal_donatur",nominaldonatur.getText().toString());
                mengirim.putExtra("nama_panti",namapanti.getText().toString());
                mengirim.putExtra("norek_panti", norekpanti.getText().toString());
                startActivity(mengirim);
            }});

    }

}