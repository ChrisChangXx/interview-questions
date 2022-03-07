# Java是值传递还是引用传递？

## 值传递和引用传递概念：
> 值传递：在调用函数时将实际参数 **复制** 一份传递到函数中，这样在函数中如果对参数进行修改，将不会影响到实际参数。
>
> 引用传递：在调用函数时将实际参数的地址 **直接** 传递到函数中，那么在函数中对参数所进行的修改，将影响到实际参数。

## 代码测试
```java
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
```

> pass:
> a:1
> s:yes
> User{username='other', password='654321'}
> main:
> a:0
> s:no
> User{username='other', password='654321'}

## 结论
> Java中其实还是值传递的，传递的值是内存地址；只不过对于对象参数，值的内容是对象的引用。

