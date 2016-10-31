package com.hsfl.mme.mme_game;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity
{
    public final static String EXTRA_MESSAGE = "com.hsfl.mme.mme_game.MESSAGE";

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
    }

    public void startGameActivity(View view)
    {
        Intent intent = new Intent(this, GameActivity.class);
        //intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
