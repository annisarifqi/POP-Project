package id.web.annisa.pop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class DaftarGedung extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_daftar_gedung);
    }

    public void Daftar(View view) {
        Intent intent = new Intent(this, MainActivity.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
        Toast.makeText(this, "Anda berhasil menyimpan daftar gedung", Toast.LENGTH_SHORT).show();
    }
}
