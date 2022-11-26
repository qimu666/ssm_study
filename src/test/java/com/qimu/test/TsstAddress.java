package com.qimu.test;

import com.qimu.controller.AddressController;
import com.qimu.pojo.Address;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring.测试环境的配置文件
@ContextConfiguration(locations = {"classpath:springmvc-config.xml", "classpath:spring-config.xml"})
public class TsstAddress {
    @Autowired
    private AddressController addressController;

    /**
     * 动态获取地址
     */
    @Test
    public void dynamicGetAddress() {
        Address address = new Address();
        address.setContact("王丽");
        address.setAddressDesc("北京市东城区东交民巷44号");
        List<Address> addresses = addressController.dynamicGetAllAddress(address);
        addresses.forEach(System.out::println);
    }

    /**
     * 动态添加地址
     */
    @Test
    public void dynamicAddAddress() {
        Address address = new Address();
        address.setContact("柒木");
        address.setAddressDesc("北京市朝阳区民巷44号");
        Integer integer = addressController.dynamicAddAddress(address);
        System.out.println(integer > 0 ? "添加成功" : "添加失败");
        System.out.println("当前提供者id为" + address.getId());
    }

    /**
     * 按Id动态更新地址
     */
    @Test
    public void dynamicUpdateAddressById() {
        Address address = new Address();
        address.setId(7);
        address.setPostCode("10086");
        Integer integer = addressController.dynamicUpdateAddressById(address);
        System.out.println(integer > 0 ? "修改成功" : "修改失败");
    }

    /**
     * 按Id动态删除地址
     */
    @Test
    public void dynamicDeleteAddressById() {
        Integer[] ids = new Integer[]{6, 7};
        Integer integer = addressController.dynamicDeleteAddressById(ids);
        System.out.println(integer > 0 ? "删除成功" : "删除失败");
    }
}
