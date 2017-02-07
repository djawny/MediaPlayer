package com.sdaacademy.jawny.daniel.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {

    private MediaPlayer dubStep;
    private SeekBar volumeBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        volumeBar = (SeekBar) findViewById(R.id.volumeBar);
        dubStep = MediaPlayer.create(getApplicationContext(), R.raw.bensound_dubstep);
        volumeBar.setOnSeekBarChangeListener(this);
    }

    public void buttonClicked(View view) {
        switch (view.getId()) {
            case R.id.playButton:
                if (!dubStep.isPlaying())
                    dubStep.start();
                break;
            case R.id.pauseButton:
                if (dubStep.isPlaying())
                    dubStep.pause();
                break;
        }
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        float volume = progress / 100f;
        dubStep.setVolume(volume, volume);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {
    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {
    }
}
