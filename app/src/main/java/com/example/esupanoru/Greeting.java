package com.example.esupanoru;

import java.util.HashMap;

public class Greeting extends structure {
    int count;
    String categoryName;
    HashMap<Integer,String> japanese = new HashMap<Integer,String>(5);
    HashMap<Integer,String> spanish = new HashMap<Integer,String>(5);

    public Greeting(){
        this.count=0;
        this.categoryName="フルーツ";

        japanese.put(0,"こんにちは");
        japanese.put(1,"お元気ですか？");
        japanese.put(2,"おはようございます");
        japanese.put(3,"こんにちは");
        japanese.put(4,"こんばんは");

        spanish.put(0, "Hola");
        spanish.put(1,"Como estas?");
        spanish.put(2,"Buenos días");
        spanish.put(3,"Buenas tardes");
        spanish.put(4,"Buenas noches");
    }
    String getCategoryName() {
        return this.categoryName;
    }
    public void getCount(boolean sum){
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
    String getJapanese(int num) {
        return japanese.get(count);
    }

    @Override
    String getSpanish(int num) {
        return spanish.get(count);
    }
}
