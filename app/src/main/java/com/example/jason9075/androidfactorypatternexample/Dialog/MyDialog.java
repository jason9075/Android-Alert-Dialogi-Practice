package com.example.jason9075.androidfactorypatternexample.Dialog;

import android.app.Dialog;
import android.content.Context;

public abstract class MyDialog{
    public abstract Dialog buildDialog(Context context);
}