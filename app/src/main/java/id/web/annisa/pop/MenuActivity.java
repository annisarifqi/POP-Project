package id.web.annisa.pop;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onFavorite(View view) {
        Intent intent = new Intent(this, Favorite.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
    }

    public void onAccount(View view) {
        Intent intent = new Intent(this, Account.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
    }

    public void onHelp(View view) {
        Intent intent = new Intent(this, Help.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
    }

    public void onGedung(View view) {
        Intent intent = new Intent(this, MainActivity.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
    }
}
