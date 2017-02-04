package com.sdaacademy.jawny.daniel.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer dubstep;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dubstep = MediaPlayer.create(this, R.raw.bensound_dubstep);
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.playButton:
                if (!dubstep.isPlaying())
                    dubstep.start();
                break;
            case R.id.pauseButton:
                if (dubstep.isPlaying())
                    dubstep.stop();
                break;
        }
    }
}
