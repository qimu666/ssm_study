package com.qimu.test;

import com.qimu.controller.ProviderController;
import com.qimu.pojo.Provider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring.测试环境的配置文件
@ContextConfiguration(locations = {"classpath:springmvc-config.xml", "classpath:spring-config.xml"})
public class TestProvider {
    @Autowired
    private ProviderController providerController;

    /**
     * 动态获取提供商
     */
    @Test
    public void dynamicGetProvider() {
        Provider provider = new Provider();
        provider.setProCode("BJ_GYS001");
        List<Provider> allUser = providerController.dynamicGetAllProvider(provider);
        allUser.forEach(System.out::println);
    }

    /**
     * 动态添加提供商
     */
    @Test
    public void dynamicAddProvider() {
        Provider provider = new Provider();
        provider.setProCode("BJ_GYS001");
        Integer integer = providerController.dynamicAddProvider(provider);
        System.out.println(integer > 0 ? "添加成功" : "添加失败");
        System.out.println("当前提供者id为" + provider.getId());
    }

    /**
     * 按Id动态更新提供商
     */
    @Test
    public void dynamicUpdateProviderById() {
        Provider provider = new Provider();
        provider.setId(16);
        provider.setProName("兴化佳美调味品厂");
        Integer integer = providerController.dynamicUpdateProviderById(provider);
        System.out.println(integer > 0 ? "修改成功" : "修改失败");
    }

    /**
     * 按Id动态删除提供商
     */
    @Test
    public void dynamicDeleteProviderById() {
        Integer[] ids = new Integer[]{15, 16};
        Integer integer = providerController.dynamicDeleteProviderById(ids);
        System.out.println(integer > 0 ? "删除成功" : "删除失败");
    }

    /**
     * 按提供商查找货物
     */
    @Test
    public void findBillByProvider() {
        List<Provider> billByProvider = providerController.findBillByProvider();
        billByProvider.forEach(System.out::println);
    }
}
