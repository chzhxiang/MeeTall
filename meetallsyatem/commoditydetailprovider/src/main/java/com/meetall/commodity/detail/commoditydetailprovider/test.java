package com.meetall.commodity.detail.commoditydetailprovider;

public class test {
    public static void main(String[] args) {
/*        String[] a = new String[2];
        String b = "1";
        String c = "2";
        a[0] = b + ":" + c;
        a[1] = a[0];
        System.out.println(a[0] + a[1]);*/
        String ccc[] = {"0","1","2"};
        String bbb[] = {"0","1","2"};
        String all = "";
        String Start = "[";
        for (int i = 0;i <= ccc.length-1;i++){

            String a = ccc[i];
            String b = bbb[i];
            String douhao = ",";
            if (i==0){
                douhao = "";
            }
            all = all + douhao +  a + ":" + b ;
        }
        String last = Start + all + "]";
        System.out.println(last);


    }
}
