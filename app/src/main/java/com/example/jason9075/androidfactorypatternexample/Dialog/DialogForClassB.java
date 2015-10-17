package com.example.jason9075.androidfactorypatternexample.Dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.widget.Toast;

public class DialogForClassB extends MyDialog {

    public Dialog buildDialog(final Context context) {
        final String[] lunch = {
                "一次付完", "分12個月", "分9個月", "分6個月", "分3個月"
        };
        return new AlertDialog.Builder(context)
                .setItems(lunch, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(context, "你選了" + lunch[which], Toast.LENGTH_SHORT).show();
                    }
                })
                .show();
    }
}
