package com.ly1240;

import com.ly1240.domain.Account;

public class TestMathd {
    public static void main(String[] args) {
        Account account = new Account();
        account.setName("nh");
        System.out.println(account.getName());
        for (int i = 0; i < 20; i++) {
            System.out.println(i);
        }
    }
}
