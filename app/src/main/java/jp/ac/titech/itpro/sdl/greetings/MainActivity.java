package jp.ac.titech.itpro.sdl.greetings;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.util.Log;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView outputView;
    private EditText inputName;
    private Button okButton;
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate");
        setContentView(R.layout.activity_main);

        outputView = (TextView)findViewById(R.id.output_view);
        inputName = (EditText)findViewById(R.id.input_name);
        okButton = (Button)findViewById(R.id.ok_button);
        okButton.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) { case R.id.ok_button:
        String name = inputName.getText().toString(); if (name != null && name.length() > 0)
        outputView.setText("Hello, " + name +
        "\nNice to see yoU!");
        break; }
        }
    @Override
    protected void onStart() { // 同様にして onResume, onRestart, onPause, onStop,
        super.onStart(); // onDestroy も実装すること.全て protected で,返値は
        Log.d(TAG, "onStart"); // void,引数はなしである.
    }

    @Override
    protected void onResume(){
        super.onResume();
        Log.d(TAG, "onResume");
    }

    @Override
    protected void onPause(){
        super.onPause();
        Log.d(TAG, "onPause");
    }

    @Override
    protected void onStop(){
        super.onStop();
        Log.d(TAG, "onStop");
    }

    @Override
    protected void onDestroy(){
        super.onDestroy();
        Log.d(TAG, "onDestroy");
    }



}
