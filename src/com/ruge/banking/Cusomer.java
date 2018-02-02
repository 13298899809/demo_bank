package com.ruge.banking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 武健
 * \* Date: 2018/2/2
 * \* Time: 23:03
 * \* To change this template use File | Settings | File Templates.
 * \* Description:人员类
 * \
 */
public class Cusomer {
    private String name;
    private int accountid;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("雇员是:"+name);
        this.name = name;
    }

    public void setAccountid(int accountid) {
        this.accountid = accountid;
    }

    public int getAccountid() {
        return accountid;
    }

    public Cusomer() {
    }
}