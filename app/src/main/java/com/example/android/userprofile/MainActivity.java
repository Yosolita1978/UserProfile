package com.example.android.userprofile;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the TextView text for my name
        TextView userName = (TextView) findViewById(R.id.name);
        userName.setText("Cristina Rodriguez");

        // Set the TextView text for my countries
        TextView userCountry = (TextView) findViewById(R.id.country);
        userCountry.setText("Colombia and Mexico");

        // Set the TextView text for my birthday
        TextView userBirthday = (TextView) findViewById(R.id.birthday);
        userBirthday.setText("December 10th");

        // Set the TextView text for my email
        TextView userEmail = (TextView) findViewById(R.id.email);
        userEmail.setText("yosola@gmail.com");

        // Set the ImageView for my avatar
        ImageView userProfile = (ImageView) findViewById(R.id.profile_picture);
        userProfile.setImageResource(R.drawable.avatarme);

    }
}
