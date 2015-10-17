package com.example.jason9075.androidfactorypatternexample.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class DialogForClassC extends MyDialog {

    public Dialog buildDialog(final Context context) {
        return new AlertDialog.Builder(context)
                .setTitle("無法連線伺服器")
                .setPositiveButton("好吧！", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "網路連線不穩定", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
