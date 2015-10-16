package com.example.jason9075.androidfactorypatternexample.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class DialogForClassA implements MyDialog {

    public DialogForClassA () {

    }

    public Dialog buildDialog(final Context context) {
        return new AlertDialog.Builder(context)
                .setTitle("付款方式")
                .setMessage("請問要使用下列何種付款方式？")
                .setPositiveButton("信用卡", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "你選了 信用卡", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("ATM", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "你選了 ATM", Toast.LENGTH_SHORT).show();
                    }
                })
                .setNeutralButton("超商繳費", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "你選了 超商繳費", Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }

}
