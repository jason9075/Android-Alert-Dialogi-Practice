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
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("付款方式")
                        .setMessage("請問要使用下列何種付款方式？")
                        .setPositiveButton("信用卡", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "你選了 信用卡", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNegativeButton("ATM", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "你選了 ATM", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .setNeutralButton("超商繳費", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "你選了 超商繳費", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
            case R.id.alertdialog2:
                final String[] lunch = {
                        "一次付完", "分12個月", "分9個月", "分6個月", "分3個月"
                };
                new AlertDialog.Builder(MainActivity.this)
                        .setItems(lunch, new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "你選了" + lunch[which], Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
            case R.id.alertdialog3:
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("無法連線伺服器")
                        .setPositiveButton("好吧！", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialog, int which) {
                                Toast.makeText(getApplicationContext(), "網路連線不穩定", Toast.LENGTH_SHORT).show();
                            }
                        })
                        .show();
                break;
        }
    }
}
