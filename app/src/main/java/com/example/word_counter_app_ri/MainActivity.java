package com.example.word_counter_app_ri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.example.word_counter_app_ri.utils.TextCounter;
import com.example.word_counter_app_ri.utils.WordsCounter;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Spinner spCountingOption;
    EditText edPhraseInput;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.spCountingOption = findViewById(R.id.spCountingOption);
        this.edPhraseInput = findViewById(R.id.edPhraseInput);
        this.tvResult = findViewById(R.id.tvResult);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.counter_options, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        this.spCountingOption.setAdapter(adapter);
    }

    public void onBtnClick(View view) {
        if  (TextUtils.isEmpty(edPhraseInput.getText().toString())) {
            Toast.makeText(this,"Text is empty!", Toast.LENGTH_LONG).show();
        }
        else {
            if (spCountingOption.getSelectedItem().toString().trim().equals("Chars")){
                String phrase = this.edPhraseInput.getText().toString();
                int charsCount = TextCounter.getCharsCount(phrase);
                String formattedResult = String.valueOf(charsCount);
                this.tvResult.setText(formattedResult);
            }
            else if (spCountingOption.getSelectedItem().toString().trim().equals("Words")){
                String word = this.edPhraseInput.getText().toString();
                int wordsCount = WordsCounter.getWordsCount(word);
                String formattedResult = String.valueOf(wordsCount);
                this.tvResult.setText(formattedResult);
            }
        }
    }
}