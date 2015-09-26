package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public String message;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

//Toast function taken from user Elenasys's comment on http://stackoverflow.com/questions/3500197/how-to-display-toast-in-android query

    public void Capstone(View View) {
        Toast.makeText(getApplicationContext(), "This button will launch my Capstone app",
                Toast.LENGTH_SHORT).show();
}
    public void xyz(View View) {
        Toast.makeText(getApplicationContext(), "This button will launch my XYZ Reader app",
                Toast.LENGTH_SHORT).show();
    }
    public void Build(View View) {
        Toast.makeText(getApplicationContext(), "This button will launch my Build It Larger app",
                Toast.LENGTH_SHORT).show();
    }
    public void Library(View View) {
        Toast.makeText(getApplicationContext(), "This button will launch my Library app",
                Toast.LENGTH_SHORT).show();
    }
    public void Soccer(View View) {
        Toast.makeText(getApplicationContext(), "This button will launch my Soccer app",
                Toast.LENGTH_SHORT).show();
    }
    public void Spotify(View View) {
        Toast.makeText(getApplicationContext(), "This button will launch my Spotify Streamer app",
                Toast.LENGTH_SHORT).show();
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
