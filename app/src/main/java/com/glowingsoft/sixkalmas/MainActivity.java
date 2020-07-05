package com.glowingsoft.sixkalmas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    CardView kalma1,kalma2,kalma3,kalma4,kalma5,kalma6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        kalma1 =(CardView) findViewById(R.id.kalma1);
        kalma2 = (CardView) findViewById(R.id.kalma2);
        kalma3 =(CardView) findViewById(R.id.kalma3);
        kalma4 = (CardView) findViewById(R.id.kalma4);
        kalma5=(CardView) findViewById(R.id.kalma5);
        kalma6=(CardView) findViewById(R.id.kalma6);

        kalma1.setOnClickListener(this);
        kalma2.setOnClickListener(this);
        kalma3.setOnClickListener(this);
        kalma4.setOnClickListener(this);
        kalma5.setOnClickListener(this);
        kalma6.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.kalma1:
               Intent kal1 = new Intent(MainActivity.this,Kalma_tayyba.class);
               startActivity(kal1);
               break;
            case R.id.kalma2:
                Intent kal2 =new Intent(MainActivity.this,Kalma_Shahadat.class);
                startActivity(kal2);
                break;
            case R.id.kalma3:
                Intent kal3 =new Intent(MainActivity.this,Kalma_Tamjeed.class);
                startActivity(kal3);
                break;
            case R.id.kalma4:
                Intent kal4 =new Intent(MainActivity.this,Kalma_Tawhid.class);
                startActivity(kal4);
                break;
            case R.id.kalma5:
                Intent kal5 =new Intent(MainActivity.this,Kalma_Astaghfar.class);
                startActivity(kal5);
                break;
            case R.id.kalma6:
                Intent kal6 =new Intent(MainActivity.this,Kalma_Radde_Kufr.class);
                startActivity(kal6);
                break;

        }
    }
}
