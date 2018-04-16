package id.web.annisa.projectpop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import static android.icu.lang.UCharacter.GraphemeClusterBreak.V;

public class BookingActivity extends AppCompatActivity {
    private ImageView gambar;
    private Button booking;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_booking);
        //layout booking
        gambar = (ImageView) findViewById(R.id.imageView);
        booking = (Button) findViewById(R.id.button);

        //Intent intent = getIntent();
        //String mgambar = intent.getStringExtra("gambar");
        //gambar.setText(gambar);

        booking.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
               // Intent next = new Intent(BookingActivity.this, TransaksiActivity.class);
            }
        });

    }
}