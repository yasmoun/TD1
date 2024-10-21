package iset.dsi.td_ex4;

import android.os.Bundle;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private EditText editText1;
    private EditText editText2;
    private CheckBox checkBox;
    private Button buttonConcat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText1 = findViewById(R.id.editText1);
        editText2 = findViewById(R.id.editText2);
        checkBox = findViewById(R.id.checkBox);
        buttonConcat = findViewById(R.id.button);

        buttonConcat.setOnClickListener(this::concat);
    }

    public void concat(View view) {
        String text1 = editText1.getText().toString();
        String text2 = editText2.getText().toString();

        if (text1.isEmpty() || text2.isEmpty()) {
            Toast.makeText(this, "Champs vide", Toast.LENGTH_SHORT).show();
        } else {
            String concatenatedText = text1 + (checkBox.isChecked() ? " " : "") + text2;

            Toast.makeText(this, concatenatedText, Toast.LENGTH_SHORT).show();
        }
    }
}