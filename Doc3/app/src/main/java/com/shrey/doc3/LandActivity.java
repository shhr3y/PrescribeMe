package com.shrey.doc3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;

public class LandActivity extends AppCompatActivity {
    public ImageButton start;
    public ImageView logo,tag,name,mountain;
    public Dialog myDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_land);

        start = findViewById(R.id.startButton);
        logo = findViewById(R.id.logo);
        tag = findViewById(R.id.tag);
        name = findViewById(R.id.app_name);
        mountain = findViewById(R.id.mountain);
        final Dialog myDialog = new Dialog(this);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

//                    TextView txtclose;
//                    final VideoView videoView = findViewById(R.id.videoView);
//                    myDialog.setContentView(R.layout.custompopup);
//
//                    videoView.setVideoURI(Uri.parse("android.resource://"+ getPackageName()+ "/"+ R.raw.qwerty));
//                    videoView.start();
//
//                    txtclose = myDialog.findViewById(R.id.txtclose);
//                    txtclose.setOnClickListener(new View.OnClickListener() {
//                        @Override
//                        public void onClick(View v) {
//                            videoView.stopPlayback();
//                            myDialog.dismiss();
//                        }
//                    });
//                    myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//                    myDialog.show();
                Intent intent = new Intent( LandActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });
    }
}
