package id.web.annisa.pop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void SignUp(View view) {
        Intent intent = new Intent(this, SignUpActivity.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
    }

    public void Login(View view) {
        Intent intent = new Intent(this, MainActivity.class); //disesuaikan sama layout buat yang cari gedung
        // nama class nya apa (diganti aja)
        startActivity(intent);
    }
}
