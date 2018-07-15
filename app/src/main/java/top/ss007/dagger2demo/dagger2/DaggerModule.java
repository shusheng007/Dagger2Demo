package top.ss007.dagger2demo.dagger2;

import dagger.Module;
import dagger.Provides;
import top.ss007.dagger2demo.beans.C;

/**
 * Copyright (C) 2018 shusheng007
 * 完全享有此软件的著作权，违者必究
 *
 * @author shusheng007
 * @version 1.0
 * @modifier
 * @createDate 2018/7/15 10:47
 * @description
 */
@Module
public class DaggerModule
{
    //此处为了尽量简单，其实这边可以有很多种写法
    @Provides
    public C providerC(){
        return new C();
    }
}
