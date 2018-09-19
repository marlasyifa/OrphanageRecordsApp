package marla.com.pantiku;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    protected Cursor cursor;
    Database dbHelper;
    Button btn_next;
    TextView text1, text2, text3, text4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        dbHelper = new Database(this);
        text1 = (TextView) findViewById(R.id.txt_nama);
        text2 = (TextView) findViewById(R.id.txt_alamat);
        text3 = (TextView) findViewById(R.id.txt_telp);
        text4 = (TextView) findViewById(R.id.txt_norek);


        SQLiteDatabase db = dbHelper.getReadableDatabase();
        cursor = db.rawQuery("SELECT * FROM panti WHERE nama_panti = '" +
                getIntent().getStringExtra("nama_panti") + "'", null);
        cursor.moveToFirst();
        if (cursor.getCount() > 0) {
            cursor.moveToPosition(0);
            text1.setText(cursor.getString(0).toString());
            text2.setText(cursor.getString(1).toString());
            text3.setText(cursor.getString(2).toString());
            text4.setText(cursor.getString(3).toString());

        }

        btn_next = (Button) findViewById(R.id.button);
        btn_next.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent lanjut = new Intent(getApplicationContext(),Konfirmasi1.class);
                lanjut.putExtra("nama_panti",text1.getText().toString());
                lanjut.putExtra("alamat_panti",text2.getText().toString());
                lanjut.putExtra("nohp_panti",text3.getText().toString());
                lanjut.putExtra("norek_panti", text4.getText().toString());
                startActivity(lanjut);
            }
        });

    }
}