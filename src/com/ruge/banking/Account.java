package com.ruge.banking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 武健
 * \* Date: 2018/2/2
 * \* Time: 22:32
 * \* To change this template use File | Settings | File Templates.
 * \* Description: 账户类
 * \
 */
public class Account {
    /**
     * 账户id

     */
    private int id;
    /**
     * 银行账户当前余额
     */
    private double balance;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Account() {
    }

}