package iset.dsi.td_ex4;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity2 extends AppCompatActivity {

    EditText editText;
    TextView res;
    Button btn1, btn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        editText = findViewById(R.id.editText);
        res = findViewById(R.id.textViewResult);
        btn1 = findViewById(R.id.btnGenerate);
        btn2 = findViewById(R.id.btnClear);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText("");
                res.setText("");
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = editText.getText().toString();
                if (!input.isEmpty()) {
                    int taille = Integer.parseInt(input);
                    res.setText(generateRandomWord(taille));
                } else {
                    res.setText("entrez une taille");
                }
            }
        });
    }

    private String generateRandomWord(int taille) {
        StringBuilder word = new StringBuilder(taille);
        Random random = new Random();
        for (int i = 0; i < taille; i++) {
            char c = (char)(random.nextInt(26) + 97);
            word.append(c);
        }
        return word.toString();
    }
}