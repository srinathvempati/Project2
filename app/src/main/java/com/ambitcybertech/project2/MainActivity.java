package com.ambitcybertech.project2;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void buttoncalling(View view) {
        String button;
        button = ((Button) view).getText().toString();

        if (button.equals("Sign up")) {
            Intent intent = new Intent(MainActivity.this, Signup.class);
            startActivity(intent);
        } else if (button.equals("Email Address")) {
            Intent intent = new Intent(this, MailAddress.class);
            startActivity(intent);
        }
        else if (button.equals("Mobile Number")) {
            Intent intent = new Intent(this, Mobilenum.class);
            startActivity(intent);
        }
        else if (button.equals("Login")) {
            Intent intent = new Intent(this, Login.class);
            startActivity(intent);
        }
    }
}