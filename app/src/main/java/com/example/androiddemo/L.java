package com.example.androiddemo;

import android.util.Log;

/** * Created by liqian on 2021/5/18. */

public class L {
    private  static  final  String TAG="Imooc_okhttp";
    private  static  boolean debug=true;
    public  static  void  e(String msg){
        if(debug){
            Log.e(TAG,msg);//打印日志信息
        }
    }
}
