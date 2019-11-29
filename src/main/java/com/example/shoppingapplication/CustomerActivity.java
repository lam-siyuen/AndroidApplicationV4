package com.example.shoppingapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CustomerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customer);

        Button viewCartButton = (Button)findViewById(R.id.viewCartButton);
        viewCartButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent = new Intent(getApplicationContext(), CustomerCartActivity.class);
                startActivity(startIntent);
            }
        });

        Button browseShopButton = (Button)findViewById(R.id.browseShopButton);
        browseShopButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent startIntent2 = new Intent(getApplicationContext(), CustomerShopActivity.class);
                startActivity(startIntent2);
            }
        });

        Button logOutButton = findViewById(R.id.logOutButton);
        logOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
         }
            });

//        Button goToLoginButton = (Button)findViewById(R.id.goToLoginButton);
//        goToLoginButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent startIntent3 = new Intent(getApplicationContext(), LoginActivity.class);
//                startActivity(startIntent3);
//            }
//        });
    }


}
