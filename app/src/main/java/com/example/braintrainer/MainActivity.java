package com.example.braintrainer;

        import androidx.appcompat.app.AppCompatActivity;

        import android.content.Intent;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;

public class MainActivity extends AppCompatActivity {


Button b;
Intent i;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b=(Button)findViewById(R.id.button);


        i = new Intent(MainActivity.this, Main2Activity.class);
        
       b.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               startActivity(i);
           }
       });


    }

}
