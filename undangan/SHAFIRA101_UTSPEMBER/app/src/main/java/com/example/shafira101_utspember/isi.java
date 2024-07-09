package com.example.shafira101_utspember;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ToggleButton;

public class isi extends AppCompatActivity {
    MediaPlayer audio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isi);
        audio = MediaPlayer.create(this, R.raw.sound);
        audio.setLooping(true);
        audio.setVolume(1, 1);
        audio.start();
    }
    public void onToggleClicked(View view){
        boolean on= ((ToggleButton) view).isChecked();

        if(on){
            audio.setVolume(0,0);
        }else {
            audio.setVolume(1,1);
        }
    }
    public void onBackPressed(){
        audio.stop();
        isi.this.finish();
    }
}