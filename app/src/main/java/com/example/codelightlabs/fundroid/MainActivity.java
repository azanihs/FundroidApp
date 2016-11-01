package com.example.codelightlabs.fundroid;

import android.graphics.Color;
import android.net.LinkAddress;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.gms.appindexing.Action;
import com.google.android.gms.appindexing.AppIndex;
import com.google.android.gms.appindexing.Thing;
import com.google.android.gms.common.api.GoogleApiClient;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView name;
    private LinearLayout layout;
    private ImageView gambar;
    private Button tombol;
    private ArrayList<FunOb> foList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = (LinearLayout) findViewById(R.id.activity_main);
        gambar = (ImageView) findViewById(R.id.logo);
        name = (TextView) findViewById(R.id.textView4);
        tombol = (Button) findViewById(R.id.button);

        //get object funlist
        FunObjectList fo = new FunObjectList();
        foList = fo.getFunList();

        tombol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rnumber = new Random();
                int idx = rnumber.nextInt(3);
                gambar.setImageResource(foList.get(idx).getImage());
                layout.setBackgroundColor(Color.parseColor(foList.get(idx).getBackroundCol()));
                name.setText(foList.get(idx).getFeatureText());
            }
        });

    }




}
