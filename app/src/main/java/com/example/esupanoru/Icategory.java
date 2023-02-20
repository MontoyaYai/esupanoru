package com.example.esupanoru;

import android.os.CpuUsageInfo;

import java.util.ArrayList;
import java.util.HashMap;

public interface Icategory {
    
    String  categoryName = null;
    //各ワードのリスト
    HashMap<String,Integer> japanese = new HashMap<String ,Integer>();
    HashMap<String,Integer> spanish = new HashMap<String ,Integer>();
    //
    public String getJapanese(int num);
    public String getSpanish(int num);
    
    
}
