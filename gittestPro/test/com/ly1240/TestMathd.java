package com.ly1240;

import com.ly1240.domain.Account;

public class TestMathd {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("nh");
        System.out.println(account.getName());
       test();
    }

    public static void test(){
        int i = 0;
        while (true){

            if(i==5){

                break;
            }
            i++;
            System.out.println(i);
        }
    }
}
