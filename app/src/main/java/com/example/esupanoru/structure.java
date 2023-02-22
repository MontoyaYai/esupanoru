package com.example.esupanoru;

import java.util.HashMap;

interface structure{
    HashMap<Integer,String> japanese = new HashMap<Integer,String>();
    HashMap<Integer,String> spanish = new HashMap<Integer,String>();
    int count=0;
    String getCategoryName();
    String getJapanese(int num);
    String getSpanish(int num);
    void checkCount(boolean sum);
    int getCount();
    int getJapaneseSize();
    int getSpanishSize();
    HashMap getSpanishHash();
    HashMap getJapaneseHash();

}

