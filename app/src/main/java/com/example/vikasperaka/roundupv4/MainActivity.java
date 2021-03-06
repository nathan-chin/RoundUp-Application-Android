package com.example.vikasperaka.roundupv4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button create;
    private Button join;
    private Button result;
    private Button help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        create = (Button)findViewById(R.id.createRoundUp_button);
        join = (Button)findViewById(R.id.joinRoundUp_button);
        result = (Button)findViewById(R.id.results_button);
        help = (Button)findViewById(R.id.help_button);

        //options to create, join, and see results
        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), com.example.vikasperaka.roundupv4.CreateEvent.class));
            }
        });

        join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), JoinEvent.class));
            }
        });

        result.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Results.class));
            }
        });

        help.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //startActivity(new Intent(getApplicationContext(), ));
            }
        });

    }
}
