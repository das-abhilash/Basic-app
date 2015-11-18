package com.example.abhilash.project0;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

}
    public void Click_Spotify (View  view ){
        Toast.makeText(getApplicationContext(),"This Button will Launch my 'Spotify Streamer'  app",Toast.LENGTH_SHORT ).show();
    }
    public void Click_Scores (View  view ){
        Toast.makeText(getApplicationContext(),"This Button will Launch my 'Scores App' '  app",Toast.LENGTH_SHORT ).show();
    }
    public void Click_Library (View  view ){
        Toast.makeText(getApplicationContext(),"This Button will Launch my 'Library App' '  app",Toast.LENGTH_SHORT ).show();
    }
    public void Click_Build (View  view ){
        Toast.makeText(getApplicationContext(),"This Button will Launch my 'Build it Bigger'  app",Toast.LENGTH_SHORT ).show();
    }
    public void Click_XYZ (View  view ){
        Toast.makeText(getApplicationContext(),"This Button will Launch my 'XYZ Reader'  app",Toast.LENGTH_SHORT ).show();
    }
    public void Click_CAPSTONE (View  view ){
        Toast.makeText(getApplicationContext(),"This Button will Launch my 'CAPSTONE: my own app'  app",Toast.LENGTH_SHORT ).show();
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

