package com.chris.iqs.passbyvalue;

/**
 * 按值传递
 *
 * @author zhangh
 * @date 2022/03/07
 */
public class PassByValue {

    private static void pass(int a, String s, User user) {
        a = 1;
        s = "yes";
        user.setUsername("other");
        user.setPassword("654321");
        System.out.println("pass:");
        System.out.println("a:" + a);
        System.out.println("s:" + s);
        System.out.println(user.toString());
    }

    public static void main(String[] args) {
        int a = 0;
        String s = "no";
        User user = new User("chris", "123456");

        pass(a, s, user);

        System.out.println("main:");
        System.out.println("a:" + a);
        System.out.println("s:" + s);
        System.out.println(user.toString());
    }
}
