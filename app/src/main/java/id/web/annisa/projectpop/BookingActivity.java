package id.web.annisa.projectpop;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

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
                // Build the alert dialog.
                AlertDialog.Builder myAlertBuilder = new AlertDialog.Builder(BookingActivity.this);
                // Set the dialog title.
                myAlertBuilder.setTitle(R.string.alert_title);
                // Set the dialog message.
                myAlertBuilder.setMessage(R.string.alert_message);
                // Add the buttons.
                myAlertBuilder.setPositiveButton(R.string.ok, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked OK button.
                        Toast.makeText(getApplicationContext(), R.string.pressed_ok,
                                Toast.LENGTH_SHORT).show();
                        //Menuju ke class Transaksi
                        // Intent next = new Intent(BookingActivity.this, TransaksiActivity.class);
                    }
                });
                myAlertBuilder.setNegativeButton(R.string.cancel, new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int which) {
                        // User clicked the CANCEL button.
                        Toast.makeText(getApplicationContext(), R.string.pressed_cancel,
                                Toast.LENGTH_SHORT).show();
                    }
                });

                // Create and show the AlertDialog.
                myAlertBuilder.show();

            }
        });

    }
}