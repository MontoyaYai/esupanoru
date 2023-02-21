package com.example.esupanoru;

import java.util.HashMap;

    class Number extends structure{
        int count;
        String categoryName;
        HashMap<Integer,String> japanese = new HashMap<Integer,String>(5);
        HashMap<Integer,String> spanish = new HashMap<Integer,String>(5);

        public Number(){
            this.count=0;
            this.categoryName="数字";

            japanese.put(0,"1");
            japanese.put(1,"2");
            japanese.put(2,"3");
            japanese.put(3,"4");
            japanese.put(4,"5");

            spanish.put(0, "uno");
            spanish.put(1,"dos");
            spanish.put(2,"tres");
            spanish.put(3,"cuatro");
            spanish.put(4,"cinco");
        }

        @Override
        String getCategoryName() {
            return this.categoryName;
        }

        public void getCount(boolean sum) {
            if (sum == true) {
                if (this.count < japanese.size() - 1) {
                    this.count++;
                }
                if (this.count == japanese.size()) {
                    this.count = 0;
                }
            } else {
                if (this.count > 0) this.count--;
            }
        }

        @Override
        String getJapanese(int num) {
            return null;
        }

        @Override
        String getSpanish(int num) {
            return null;
        }
}
