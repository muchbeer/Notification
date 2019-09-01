package raum.muchbeer.notification;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button sendNotification;
    EditText sendTitle;
    EditText sendContent;

    private final String LOG_TAG = getClass().getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sendNotification = (Button) findViewById(R.id.btn_Notification);
        sendTitle =(EditText) findViewById(R.id.edt_Title);
        sendContent = (EditText) findViewById(R.id.edt_Content);

        sendNotification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showReminderNotification();
            }
        });
    }

    private void showReminderNotification() {

        String noteTitle = sendTitle.getText().toString();
        String noteText = sendContent.getText().toString();
      //  int noteId = (int)ContentUris.parseId(mNoteUri);
        NoteReminderNotification.notify(this, noteTitle, noteText);
        sendTitle.setText("");
        sendContent.setText("");
    }
}
