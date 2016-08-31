package com.example.tharaphilips.foodtogo;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

public class WelcomePage extends AppCompatActivity implements View.OnClickListener{
    ImageView homeScreenImage;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.welcome_page);
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if( view == login){
            Intent intent = new Intent(this , LoginPage.class);
            startActivity(intent);
        }
    }
}
