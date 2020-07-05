package com.glowingsoft.sixkalmas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class Kalma_Astaghfar extends AppCompatActivity {
    private ImageView back;
    private Button play,share;
    private TextView kalma_name,kalma,kalma_urdu_trns,kalma_english_trns;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalma__astaghfar);
        back = (ImageView) findViewById(R.id.back);


        play =(Button) findViewById(R.id.play_btn);
        final MediaPlayer mp = MediaPlayer.create(Kalma_Astaghfar.this,R.raw.fifthk);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mp.isPlaying()){
                    mp.pause();
                    play.setBackgroundResource(R.drawable.play);
                }else {
                    mp.start();
                    play.setBackgroundResource(R.drawable.pause);
                }
            }
        });
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.stop();
                finish();

            }
        });

        kalma_name = (TextView) findViewById(R.id.kalma_name_txt);
        kalma= (TextView) findViewById(R.id.kalma_astaghfar);
        kalma_urdu_trns=(TextView) findViewById(R.id.kalma_urdu_trns);
        kalma_english_trns=(TextView) findViewById(R.id.kalma_english_trns);

        final String kalma1 = kalma_name.getText().toString().trim();
        final String kal_1 = kalma.getText().toString().trim();
        final String kal_urdu = kalma_urdu_trns.getText().toString().trim();
        final String kal_english = kalma_english_trns.getText().toString().trim();

        share =(Button) findViewById(R.id.share);
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent share = new Intent(Intent.ACTION_SEND);
                share.setData(Uri.parse("Share Recipes"));
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT,kalma1+"\n\n\n"+kal_1+"\n\n\n"+kal_urdu+"\n\n\n"+ kal_english);
                share.putExtra(Intent.EXTRA_SUBJECT,kalma1);
                Intent choose =Intent.createChooser(share,"Launch");
                startActivity(choose);
            }
        });

    }
}
