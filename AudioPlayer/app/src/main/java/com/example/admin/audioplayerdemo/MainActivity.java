package com.example.admin.audioplayerdemo;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.content.Context;
import android.widget.Button;
import android.media.AudioManager;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.ImageView;
import android.widget.Toast;
import android.widget.SeekBar;
import java.io.IOException;

public class MainActivity extends Activity {
    private Button b1, b2, b3, b4;
    private ImageView iv1;
    private MediaPlayer mediaPlayer;
    private SeekBar volumeSeekbar;
    private AudioManager audioManager = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setVolumeControlStream(AudioManager.STREAM_MUSIC);
        iv1 = (ImageView) findViewById(R.id.iv1);
        iv1.setVisibility(View.VISIBLE);
        volumeSeekbar = (SeekBar) findViewById(R.id.seek);
        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        mediaPlayer = MediaPlayer.create(this, R.raw.song);
        initControls();


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Playing sound", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
                try {
                    mediaPlayer.prepare();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mediaPlayer.start();
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Pausing sound", Toast.LENGTH_SHORT).show();
                mediaPlayer.pause();
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Resuming sound", Toast.LENGTH_SHORT).show();
                mediaPlayer.start();
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "Stopped sound", Toast.LENGTH_SHORT).show();
                mediaPlayer.stop();
            }
        });

    }

    private void initControls() {
        try {
            volumeSeekbar = (SeekBar) findViewById(R.id.seek);
            audioManager = (AudioManager) getSystemService(Context.AUDIO_SERVICE);
            volumeSeekbar.setMax(audioManager
                    .getStreamMaxVolume(AudioManager.STREAM_MUSIC));
            volumeSeekbar.setProgress(audioManager
                    .getStreamVolume(AudioManager.STREAM_MUSIC));


            volumeSeekbar.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
                @Override
                public void onStopTrackingTouch(SeekBar arg0) {
                }

                @Override
                public void onStartTrackingTouch(SeekBar arg0) {
                }

                @Override
                public void onProgressChanged(SeekBar arg0, int progress, boolean arg2) {
                    audioManager.setStreamVolume(AudioManager.STREAM_MUSIC,
                            progress, 0);
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}