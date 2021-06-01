package com.askhat.gantelya;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer mplayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        mplayer=MediaPlayer.create(this,R.raw.mainmusic);
        mplayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mp) {
                mplayer.start();
            }
        }

        );


    }

    public void onClickExit(View view)
    {System.exit(0);}
    public void onClickStart(View view)
    {
        Intent intent=new Intent(this,StartGame.class);
        startActivity(intent);
    }
    public void onClickSetting(View view)
    {
    }
    public void onoffButton(View view)
    {
        boolean on=((ToggleButton)view).isChecked();
        if(on){mplayer.start();}
        else{mplayer.pause();}
    }

}