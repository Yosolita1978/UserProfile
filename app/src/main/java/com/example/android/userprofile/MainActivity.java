package com.example.android.userprofile;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Set the TextView text for my name
        TextView userName = (TextView) findViewById(R.id.name);
        userName.setText("Cristina Rodriguez");
        userName.setTextSize(32);
        userName.setTextColor(Color.WHITE);

        // Set the TextView text for my address
        TextView userAddress = (TextView) findViewById(R.id.address);
        userAddress.setText("Seattle, WA");
        userAddress.setTextSize(15);
        userAddress.setTextColor(Color.WHITE);

        // Set the ImageView for my avatar
        ImageView userProfile = (ImageView) findViewById(R.id.profile_picture);
        userProfile.setImageResource(R.drawable.avatarme);


        //Set the Visibility of the info_view
        View infoView = findViewById(R.id.options_info);
        infoView.setVisibility(View.VISIBLE);

        View contactView = findViewById(R.id.options_contact);
        contactView.setVisibility(View.GONE);

        //Setting the Info Button

        final Button infoUser = (Button) findViewById(R.id.info_button);
        infoUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Set the Visibility of the info_view
                View infoView = findViewById(R.id.options_info);
                infoView.setVisibility(View.VISIBLE);

                //Set the Visibility of the contact_info
                View contactView = findViewById(R.id.options_contact);
                contactView.setVisibility(View.GONE);
            }
        });

        final Button contactUser = (Button) findViewById(R.id.contact_button);
        contactUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Set the Visibility of the info_view
                View infoView = findViewById(R.id.options_info);
                infoView.setVisibility(View.GONE);

                //Set the Visibility of the contact_info
                View contactView = findViewById(R.id.options_contact);
                contactView.setVisibility(View.VISIBLE);
            }
        });

    }

    /**
     * This method is called when the email button is clicked.
     */
    public void send_email(View view){

        String stringUserName = getString(R.string.name);


        Intent intent = new Intent(Intent.ACTION_SENDTO, Uri.fromParts(
                "mailto","yosola@gmail.com", null));
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Contact to " + stringUserName);
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }

    }

    /**
     * This method is called when the url button is clicked.
     */
    public void send_url(View view){

        String url = getString(R.string.landing);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

    /**
     * This method is called when the url button is clicked.
     */
    public void open_twitter(View view){

        String url = getString(R.string.urltwitter);
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(url));
        startActivity(i);

    }

}
