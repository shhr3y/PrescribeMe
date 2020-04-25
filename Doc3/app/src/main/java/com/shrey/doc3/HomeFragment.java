package com.shrey.doc3;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.shrey.doc3.R;

public class HomeFragment extends Fragment {

    public Dialog myDialog;
    public ImageButton btn;


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        btn = root.findViewById(R.id.add_priscrip);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Toast.makeText(getActivity(), "Clicked", Toast.LENGTH_SHORT).show();
                //ShowPopup(v);
                Intent i = new Intent(getActivity(),NFCActivity.class);
                startActivity(i);
            }
        });


        return root;
    }

    public void ShowPopup(View v) {
        TextView txtclose;
        final ImageView videoView = v.findViewById(R.id.imageView);
        myDialog.setContentView(R.layout.custompopup);


        txtclose = myDialog.findViewById(R.id.txtclose);
        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();


//        TextView txtclose;
//        final VideoView videoView = v.findViewById(R.id.videoView);
//        myDialog.setContentView(R.layout.custompopup);
//
//        videoView.setVideoURI(Uri.parse("android.resource://"+ getActivity().getPackageName()+ "/"+ R.raw.qwerty));
//        videoView.start();
//
//        txtclose = myDialog.findViewById(R.id.txtclose);
//        txtclose.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                videoView.stopPlayback();
//                myDialog.dismiss();
//            }
//        });
//        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
//        myDialog.show();
    }
}