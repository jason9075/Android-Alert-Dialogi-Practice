package com.example.jason9075.androidfactorypatternexample;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button alertDialog1 = (Button) findViewById(R.id.alertdialog1);
        Button alertDialog2 = (Button) findViewById(R.id.alertdialog2);
        Button alertDialog3 = (Button) findViewById(R.id.alertdialog3);

        alertDialog1.setOnClickListener(this);
        alertDialog2.setOnClickListener(this);
        alertDialog3.setOnClickListener(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.alertdialog1:
                DialogFactory.createDialog(this,"A");
                break;
            case R.id.alertdialog2:
                DialogFactory.createDialog(this,"B");
                break;
            case R.id.alertdialog3:
                DialogFactory.createDialog(this,"C");
                break;
        }
    }
}
