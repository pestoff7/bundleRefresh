package com.example.bundlerefresh;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    EditText login, password;
    TextView res;
    String s;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        res = findViewById(R.id.textAuth);
        login = findViewById(R.id.loginInput);
        password = findViewById(R.id.passwordInput);
        if (savedInstanceState != null && savedInstanceState.containsKey("str")){
            s = savedInstanceState.getString("str");
            res.setText(s);
        }
    }
    public void onClick(View v){
        s = login.getText().toString() + " " + password.getText().toString();
        res.setText(s);
    }

    @Override
    public void onSaveInstanceState(Bundle bundle){
        bundle.putString("str", s);
        super.onSaveInstanceState(bundle);
    }
}