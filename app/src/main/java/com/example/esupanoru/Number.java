package com.example.esupanoru;

import java.util.HashMap;

    class Number implements structure{
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
        public String getCategoryName() {
            return this.categoryName;
        }

        public void checkCount(boolean sum) {
            if (sum == true){
                System.out.println("size:" + japanese.size());
                System.out.println("count:" + this.count);
                if (this.count<japanese.size()-1){
                    this.count++;
                }
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
        public String getJapanese(int num) {return japanese.get(count);}

        @Override
        public String getSpanish(int num) {
            return spanish.get(count);
        }
}
