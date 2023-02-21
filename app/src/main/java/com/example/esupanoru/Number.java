package com.example.esupanoru;

import java.util.HashMap;

    class Number extends structure{
        int count;
        String categoryName;
        HashMap<Integer,String> japanese = new HashMap<Integer,String>(10);
        HashMap<Integer,String> spanish = new HashMap<Integer,String>(10);

        public Number(){
            this.count=0;
            this.categoryName="数字";

            japanese.put(0,"1");
            japanese.put(1,"2");
            japanese.put(2,"3");
            japanese.put(3,"4");
            japanese.put(4,"5");
            japanese.put(5,"6");
            japanese.put(6,"7");
            japanese.put(7,"8");
            japanese.put(8,"9");
            japanese.put(9,"10");


            spanish.put(0,"uno");
            spanish.put(1,"dos");
            spanish.put(2,"tres");
            spanish.put(3,"cuatro");
            spanish.put(4,"cinco");
            spanish.put(5, "seis");
            spanish.put(6,"siete");
            spanish.put(7,"ocho");
            spanish.put(8,"nueve");
            spanish.put(9,"diez");
        }

        @Override
        String getCategoryName() {
            return this.categoryName;
        }

        public void getCount(boolean sum) {
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
