package top.ss007.dagger2demo.beans;

import javax.inject.Inject;

/**
 * Copyright (C) 2018 shusheng007
 * 完全享有此软件的著作权，违者必究
 *
 * @author shusheng007
 * @version 1.0
 * @modifier
 * @createDate 2018/7/15 10:53
 * @description
 */
public class B
{
    @Inject
    public B(){}

    public void birthSon(){
        System.out.println("我王二狗的儿子王不二降临人世了！");
    }
}
