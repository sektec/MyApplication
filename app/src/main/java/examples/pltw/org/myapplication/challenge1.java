package examples.pltw.org.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class challenge1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);

        Button button  = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView1);

    }

    public void changeText (View view){
        TextView textView1 = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        TextView textView3 = findViewById(R.id.textView3);

        EditText text1 = findViewById(R.id.entry1);
        EditText text2 = findViewById(R.id.entry2);
        EditText text3 = findViewById(R.id.entry3);

        textView1.setText(text1.getText().toString());
        textView2.setText(text2.getText().toString());
        textView3.setText(text3.getText().toString());
    }
}
