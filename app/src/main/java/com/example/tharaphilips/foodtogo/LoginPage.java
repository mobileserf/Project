package com.example.tharaphilips.foodtogo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EdgeEffect;
import android.widget.EditText;

/**
 * Created by Thara Philips on 8/25/2016.
 */
public class LoginPage extends AppCompatActivity implements View.OnClickListener {
    Button loginFacebook, loginInstagram, loginTwitter, loginSubmit;
    EditText userName, password;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_page);
        loginFacebook = (Button) findViewById(R.id.login_fb);
        loginInstagram = (Button) findViewById(R.id.login_instagram);
        loginTwitter = (Button) findViewById(R.id.login_twitter);
        loginSubmit = (Button) findViewById(R.id.login_submit);
        userName = (EditText) findViewById(R.id.user_name);
        password = (EditText) findViewById(R.id.user_password);
        loginSubmit.setOnClickListener(this);
    }
    @Override
    public void onClick(View view) {
        if(view == loginSubmit){
          //  if(userName.getText().equals("Thara") && password.getText().equals("project")){
                Intent intent = new Intent(this , AppMainPage.class);
                startActivity(intent);
         //   }
        }
    }
}
