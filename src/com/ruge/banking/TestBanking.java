package com.ruge.banking;

/**
 * \* Created with IntelliJ IDEA.
 * \* User: 武健
 * \* Date: 2018/2/2
 * \* Time: 22:39
 * \* To change this template use File | Settings | File Templates.
 * \* Description:银行测试类
 * \
 */
public class TestBanking {

    public static void main(String[] args) {
        Cusomer cusomer = new Cusomer();
        cusomer.setName("张三");
        Account account = new Account();
        account.setId(1);
        account.setBalance(500.00);
        System.out.println("初始账户" + account.getBalance());
        AccountOperation accountOperation = new AccountOperation();
        accountOperation.withdraw(account, 150.00);
        accountOperation.deposit(account, 22.50);
        accountOperation.withdraw(account, 47.62);
        account.getBalance();
        System.out.println("账户余额" + account.getBalance());
        cusomer.setAccountid(account.getId());
        System.out.println( "" + cusomer.getName() + account.getBalance());



        Bank bank [] = new Bank[4];
        bank[0] = new Bank("刘德华");
        bank[1] = new Bank("张学友");
        bank[2] = new Bank("郭富城");
        bank[3] = new Bank("黎明");
        for (int i = 0; i <bank.length ; i++) {
            System.out.println(bank[i]);
        }
    }
}