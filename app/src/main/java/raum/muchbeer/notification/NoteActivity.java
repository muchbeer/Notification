package raum.muchbeer.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class NoteActivity extends AppCompatActivity {


    public static final String TITLE_ID = "raum.muchbeer.notification.TITLE" ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_note);

        Intent intent = getIntent();
        String title_captured = intent.getStringExtra(TITLE_ID);

        TextView txtDisplay = (TextView) findViewById(R.id.txtDisplay);

        txtDisplay.setText(title_captured);
        txtDisplay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "Am so sure you are getting certificate ", Toast.LENGTH_LONG).show();

            }
        });
    }
}
