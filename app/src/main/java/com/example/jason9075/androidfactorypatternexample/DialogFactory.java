package com.example.jason9075.androidfactorypatternexample;

import android.app.Dialog;
import android.content.Context;

import com.example.jason9075.androidfactorypatternexample.Dialog.DialogForClassA;
import com.example.jason9075.androidfactorypatternexample.Dialog.DialogForClassB;
import com.example.jason9075.androidfactorypatternexample.Dialog.DialogForClassC;

public class DialogFactory {

    public static Dialog createDialog(Context context, String className){
        switch (className) {
            case "A":
                return new DialogForClassA().buildDialog(context);
            case "B":
                return new DialogForClassB().buildDialog(context);
            case "C":
                return new DialogForClassC().buildDialog(context);
        }
        return null;
    }

}
