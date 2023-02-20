package com.example.esupanoru;

import java.util.HashMap;
import java.util.*;

public abstract class structure{
    abstract String getCategoryName();
    abstract String getJapanese(int num);
    abstract String getSpanish(int num);

}

class Fruits extends structure{
    int count;
    String categoryName;
    HashMap<Integer,String> japanese = new HashMap<Integer,String>(5);
    HashMap<Integer,String> spanish = new HashMap<Integer,String>(5);

    public Fruits(){
        this.count=0;
        this.categoryName="フルーツ";

        japanese.put(0,"りんご");
        japanese.put(1,"みかん");

        spanish.put(0, "apple");
        spanish.put(1,"orange");
    }
    String getCategoryName() {
       return this.categoryName;
    }
    public void getCount(boolean sum){
        if (sum == true){
            if (this.count<japanese.size()-1){ this.count++;}
            if (this.count== japanese.size()-1) {this.count=0;}
        }else {
            if (this.count>0) this.count--;
        }
//        getJapanese(count);
//        getSpanish(count);

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