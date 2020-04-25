package com.shrey.doc3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;

public class NFCActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfc);


        TextView txtclose;
        final VideoView videoView = findViewById(R.id.vv);


        videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+ "/"+ R.raw.qwerty));
        videoView.start();

        txtclose = findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                videoView.stopPlayback();
                Intent i = new Intent(NFCActivity.this,MainActivity.class);
                startActivity(i);
            }
        });


    }
}
