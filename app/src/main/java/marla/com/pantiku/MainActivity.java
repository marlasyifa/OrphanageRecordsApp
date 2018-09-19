package marla.com.pantiku;


import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity  {
    Button btn_cari, btn_tentang, btn_keluar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_cari = (Button) findViewById(R.id.button);
        btn_tentang = (Button) findViewById(R.id.button2);
        btn_keluar = (Button) findViewById(R.id.button3);

        btn_cari.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cari = new Intent(getApplicationContext(), MainGambar.class);
                startActivity(cari);
            }
        });
        btn_tentang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.button2:
                        AlertDialog.Builder info = new AlertDialog.Builder(MainActivity.this);
                        info.setMessage("Aplikasi ini dibuat oleh Marla Nur Assyifa - 56414412 - 3IA04").setCancelable(false).setPositiveButton("Lanjut", new AlertDialog.OnClickListener() {
                            public void onClick(DialogInterface dialog, int id) {
                                dialog.cancel();
                            }
                        });
                        AlertDialog dialog = info.create();
                        dialog.setTitle("Tentang Aplikasi");
                        dialog.show();
                        TextView textView =
                                (TextView) dialog.findViewById(android.R.id.message);
                }
            }
        });


        btn_keluar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick (View view) {
                AlertDialog.Builder alertexit = new AlertDialog.Builder(MainActivity.this);
                alertexit.setMessage("Apa Anda ingin Keluar?");
                alertexit.setPositiveButton("Ya", new DialogInterface.OnClickListener() {
                    @Override
                            public void onClick(DialogInterface dialogInterface, int id) {
                               finish();
                            }
                        });
                alertexit.setNegativeButton("Tidak", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                              dialogInterface.dismiss();
                            }
                        });
                AlertDialog a = alertexit.create();
                a.setTitle("Keluar");
                a.show();
            }
        });
    }
}


