package com.kd.toasterlibrary;

import android.content.Context;
import android.widget.Toast;

public class Toasterr {
    public static void  show(Context context,String message){
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
