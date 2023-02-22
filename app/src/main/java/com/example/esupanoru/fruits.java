package com.example.esupanoru;

import java.util.HashMap;

class Fruits implements structure {
        int count;
        String categoryName;
        HashMap<Integer,String> japanese = new HashMap<Integer,String>(5);
        HashMap<Integer,String> spanish = new HashMap<Integer,String>(5);

        public Fruits(){
            this.count=0;
            this.categoryName="フルーツ";

            japanese.put(0,"りんご");
            japanese.put(1,"みかん");
            japanese.put(2,"いちご");
            japanese.put(3,"パイナップル");
            japanese.put(4,"スイカ");

            spanish.put(0, "Manzana");
            spanish.put(1,"Naranja");
            spanish.put(2,"Fresa");
            spanish.put(3,"Piña");
            spanish.put(4,"Sandia");
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
        public int getSpanishSize(){
            return this.spanish.size();
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


