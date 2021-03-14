package com.example.toolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.my_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId())
        {
            case R.id.home:
                Toast.makeText(this, " You clicked on Home",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.save:
                Toast.makeText(this, "You clicked on Save",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.print:
                Toast.makeText(this, "You clicked on Print",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.download:
                Toast.makeText(this, "You clicked on Download",Toast.LENGTH_SHORT).show();
                return true;
            default:
        }
        return super.onOptionsItemSelected(item);
    }
}