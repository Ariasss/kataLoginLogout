package com.example.arias.myapplication;

import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText userEditText = (EditText)findViewById(R.id.editText2);
        final EditText passwordEditText = (EditText)findViewById(R.id.editText);
        final Button Login = (Button)findViewById(R.id.Login);
        Login.setOnClickListener(this);

        userEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length()!=0 && passwordEditText.getText().length()!=0){
                    Login.setEnabled(true);
                }
            }
        });

        passwordEditText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                if (editable.length()!=0 && passwordEditText.getText().length()!=0){
                    Login.setEnabled(true);
                }
            }
        });


    }

    @Override
    public void onClick(View v) {
        APIClient apiclient = new APIClient(new Clock());
        EditText userEditText = (EditText)findViewById(R.id.editText2);
        final EditText passwordEditText = (EditText)findViewById(R.id.editText);
        boolean result = apiclient.login(userEditText.getText().toString(), passwordEditText.getText().toString());

        if (result){
            final Button button2 = (Button)findViewById(R.id.button2);
            button2.setVisibility(View.VISIBLE);
            userEditText.setVisibility(View.INVISIBLE);
            passwordEditText.setVisibility(View.INVISIBLE);
           /* button2.
        } else {
        final TextView errorMessage = (TextView)findViewById(R.id.errorMessage);
        errorMessage.setVisibility(View.VISIBLE);*/
    }

    }
}
