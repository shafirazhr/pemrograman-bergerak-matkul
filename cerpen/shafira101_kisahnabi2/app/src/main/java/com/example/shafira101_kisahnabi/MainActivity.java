package com.example.shafira101_kisahnabi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {
    MediaPlayer audio;
    Button adam, idris, nuh, hud, saleh, ibrahim, ismail, ishaq, luth, yaqub, yusuf ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        adam = (Button) findViewById(R.id.adam);
        idris = (Button) findViewById(R.id.idris);
        nuh = (Button) findViewById(R.id.nuh);
        hud = (Button) findViewById(R.id.hud);
        saleh = (Button) findViewById(R.id.saleh);
        ibrahim = (Button) findViewById(R.id.ibrahim);
        ismail = (Button) findViewById(R.id.ismail);
        ishaq = (Button) findViewById(R.id.ishaq);
        luth = (Button) findViewById(R.id.luth);
        yaqub = (Button) findViewById(R.id.yaqub);
        yusuf = (Button) findViewById(R.id.yusuf);

        adam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaadam = new Intent(getApplicationContext(), nabiAdam.class);
                startActivity(bukaadam);
            }
        });
        idris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaidris = new Intent(getApplicationContext(), nabiIdris.class);
                startActivity(bukaidris);
            }
        });
        nuh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukanuh = new Intent(getApplicationContext(), nabiNuh.class);
                startActivity(bukanuh);
            }
        });
        hud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukahud = new Intent(getApplicationContext(), nabiHud.class);
                startActivity(bukahud);
            }
        });
        saleh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukasaleh = new Intent(getApplicationContext(), nabiSaleh.class);
                startActivity(bukasaleh);
            }
        });
        ibrahim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaibrahim = new Intent(getApplicationContext(), nabiIbrahim.class);
                startActivity(bukaibrahim);
            }
        });
        ismail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaismail = new Intent(getApplicationContext(), nabiIsmail.class);
                startActivity(bukaismail);
            }
        });
        ishaq.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaishaq = new Intent(getApplicationContext(), nabiIshaq.class);
                startActivity(bukaishaq);
            }
        });
        luth.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukaluth = new Intent(getApplicationContext(), nabiLuth.class);
                startActivity(bukaluth);
            }
        });
        yaqub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukayaqub = new Intent(getApplicationContext(), nabiYaqub.class);
                startActivity(bukayaqub);
            }
        });
        yusuf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bukayusuf = new Intent(getApplicationContext(), nabiYusuf.class);
                startActivity(bukayusuf);
            }
        });

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
        MainActivity.this.finish();
    }
}