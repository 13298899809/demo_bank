package com.ruge.banking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 武健
 * \* Date: 2018/2/2
 * \* Time: 22:41
 * \* To change this template use File | Settings | File Templates.
 * \* Description:账户操作
 * \
 */
public class AccountOperation {
    /**
     * 存款
     * @param account
     * @param num
     * @return
     */
    public double deposit(Account account ,double num) {
        account.setBalance(account.getBalance() + num);
        System.out.println("deposit当前账户余额"+account.getBalance());
        return account.getBalance();
    }

    /**
     * 取款
     * @param account
     * @param num
     * @return
     */
    public double withdraw(Account account ,double num) {
        if(account.getBalance()>num){
            System.out.println("取款失败成功");
            account.setBalance(account.getBalance() - num);
            System.out.println("withdraw当前账户余额"+account.getBalance());
            return account.getBalance();
        }else {
            System.out.println("取款失败,取款额度大于账户额度");
            return account.getBalance();
        }

    }
}