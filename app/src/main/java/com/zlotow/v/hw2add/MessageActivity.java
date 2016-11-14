package com.zlotow.v.hw2add;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MessageActivity extends AppCompatActivity implements View.OnClickListener {
    EditText EnterYourMessage;
    Button SendMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_message);

        EnterYourMessage = (EditText) findViewById(R.id.EnterYourMessage);
        SendMessage = (Button) findViewById(R.id.SendMessage);
        SendMessage.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        Intent intent = new Intent();
        intent.putExtra("Message", EnterYourMessage.getText().toString());
        setResult(RESULT_OK, intent);
        finish();
    }
}
