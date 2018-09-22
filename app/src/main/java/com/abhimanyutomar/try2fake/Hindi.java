package com.abhimanyutomar.try2fake;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

public class Hindi extends AppCompatActivity {
    MediaPlayer mp1;
    Intent intentM;
    Button b;
    int count=0;
    boolean kc;
    public void playPhrase(View view){
        TextView p=(TextView)findViewById(R.id.textViewPhrase);
        count+=1;
        //If media player is playing something then stop, release and play the sound attached to the pressed button.
        if(mp1!=null){
            mp1.reset();
            mp1.release();
        }
        //Get Current Button and play sound associated with the button pressed
        b= (Button) view;
        switch (b.getId()){
            case R.id.button1:
                // mp.reset();
                p.setText("Phrase: How are you?");
                mp1=MediaPlayer.create(this,R.raw.howru);
                mp1.start();

                break;
            case R.id.button2:

                p.setText("Phrase: I am fine.");
                mp1=MediaPlayer.create(this,R.raw.iamfine);
                mp1.start();
                break;
            case R.id.button3:

                p.setText("Phrase: Listen!");
                mp1=MediaPlayer.create(this,R.raw.listen);
                mp1.start();
                break;
            case R.id.button4:

                p.setText("Phrase: Lets go!");
                mp1=MediaPlayer.create(this,R.raw.letsgo);
                mp1.start();
                break;
            case R.id.button5:

                p.setText("Phrase: Sorry!");
                mp1=MediaPlayer.create(this,R.raw.sorry);
                mp1.start();
                break;
            case R.id.button6:

                p.setText("Phrae: My name is");
                mp1=MediaPlayer.create(this,R.raw.mynameis);
                mp1.start();
                break;
            case R.id.button7:

                p.setText("Phrase: ok");
                mp1=MediaPlayer.create(this,R.raw.ok);
                mp1.start();
                break;
            case R.id.button8:

                p.setText("Phrase: HurryUp!");
                mp1=MediaPlayer.create(this,R.raw.hurryup);
                mp1.start();
                break;
            case R.id.button9:

                p.setText("Phrase: Hi/Hello");
                mp1=MediaPlayer.create(this,R.raw.namaste);
                mp1.start();
                break;
            case R.id.button10:

                p.setText("Phrase: Bad");
                mp1=MediaPlayer.create(this,R.raw.bad);
                mp1.start();
                break;
            case R.id.button11:

                p.setText("Phrase: Good!");
                mp1=MediaPlayer.create(this,R.raw.good);
                mp1.start();
                break;
            case R.id.button12:

                p.setText("Phrase: Great!");
                mp1=MediaPlayer.create(this,R.raw.great);
                mp1.start();
                break;
            case R.id.button13:

                p.setText("Phrase: I am Hungry!");
                mp1=MediaPlayer.create(this,R.raw.hungry);
                mp1.start();
                break;
            case R.id.button14:

                p.setText("Phrase: I like it ");
                mp1=MediaPlayer.create(this,R.raw.ilike);
                mp1.start();
                break;
            case R.id.button15:

                p.setText("Phrase: I am thirsty!");
                mp1=MediaPlayer.create(this,R.raw.thirsty);
                mp1.start();
                break;
            case R.id.button16:

                p.setText("Phrase: What is your name?");
                mp1=MediaPlayer.create(this,R.raw.whatsyourname);
                mp1.start();
                break;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hindi);
        kc=false;
        //new spinner
        Spinner spinner=(Spinner)findViewById(R.id.spinner);
        //list to attach ro spinner
        ArrayList<String> arrayList=new ArrayList<String>();
        arrayList.add("         Button Directory   ");
        arrayList.add("     1:  How are you?");
        arrayList.add("     2:  I am fine");
        arrayList.add("     3:  Listen!");
        arrayList.add("     4:  Lets go!");
        arrayList.add("     5:  Sorry!");
        arrayList.add("     6:  My Name is");
        arrayList.add("     7:  Ok");
        arrayList.add("     8:  Hurry Up!");
        arrayList.add("     9:  Hi/Hello");
        arrayList.add("     10: Bad!");
        arrayList.add("     11: Good!");
        arrayList.add("     12: Great!");
        arrayList.add("     13: I am Hungry");
        arrayList.add("     14: I like it! ");
        arrayList.add("     15: I am thirsty!");
        arrayList.add("     16: I am fine!");
        //Adapter for spinner
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,R.layout.spinner_item,arrayList);
        arrayAdapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
        //set arrayadapter to spinner
        spinner.setAdapter(arrayAdapter);
    }

    //Override back button on android
    @Override
    public void onBackPressed()
    {
        //Goto homescreen on back button press and release media player
        intentM = new Intent(this,MainActivity.class);
        startActivity(intentM);
        if(mp1!=null){
        mp1.release();
        mp1=null;}
    }
}
