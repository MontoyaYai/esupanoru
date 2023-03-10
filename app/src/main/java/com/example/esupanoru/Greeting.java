package com.example.esupanoru;

import java.util.HashMap;

public class Greeting implements structure {
    int count;
    String categoryName;
    HashMap<Integer,String> japanese = new HashMap<Integer,String>(5);
    HashMap<Integer,String> spanish = new HashMap<Integer,String>(5);

    public Greeting(){
        this.count=0;
        this.categoryName="フルーツ";

        japanese.put(0,"お元気ですか？");
        japanese.put(1,"はい、元気です！");
        japanese.put(2,"おはようございます");
        japanese.put(3,"こんにちは");
        japanese.put(4,"こんばんは");

        spanish.put(0, "Como estas?");
        spanish.put(1,"Bien, Gracias");
        spanish.put(2,"Buenos días");
        spanish.put(3,"Buenas tardes");
        spanish.put(4,"Buenas noches");
    }
    public String getCategoryName() {
        return this.categoryName;
    }
    public void checkCount(boolean sum){
        if (sum == true){
            if (this.count<japanese.size()-1){ this.count++;}
            else this.count=0;
//            if (this.count== japanese.size()) {this.count=0;}
        }else {
            if (this.count>0) this.count--;
            else this.count=japanese.size()-1;
        }
    }

    @Override
    public int getCount() { return this.count; }

    @Override
    public int getJapaneseSize() {
        return this.japanese.size();
    }

    @Override
    public int getSpanishSize() {
        return this.spanish.size();
    }

    @Override
    public HashMap getSpanishHash() {
        return this.spanish;
    }

    @Override
    public HashMap getJapaneseHash() {
        return this.japanese;
    }

    @Override
    public String getJapanese(int num) {
        return japanese.get(count);
    }

    @Override
    public String getSpanish(int num) {
        return spanish.get(count);
    }
}
