package com.ruge.banking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 武健
 * \* Date: 2018/2/2
 * \* Time: 23:24
 * \* To change this template use File | Settings | File Templates.
 * \* Description:银行
 * \
 */
public class Bank {
    private String cusomer;

    public String getCusomer() {
        return cusomer;
    }

    public void setCusomer(String cusomer) {
        this.cusomer = cusomer;
    }

    public Bank(String cusomer) {
        this.cusomer = cusomer;
    }

    public Bank() {
    }

    @Override
    public String toString() {
        return "Bank{" +
                "cusomer='" + cusomer + '\'' +
                '}';
    }
}