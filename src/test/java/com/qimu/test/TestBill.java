package com.qimu.test;

import com.qimu.controller.BillController;
import com.qimu.pojo.Bill;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring.测试环境的配置文件
@ContextConfiguration(locations = {"classpath:springmvc-config.xml", "classpath:spring-config.xml"})
public class TestBill {
    @Autowired
    private BillController billController;

    /**
     * 动态获取账单
     */
    @Test
    public void dynamicGetAllBill() {
        Bill bill = new Bill();
        bill.setBillCode("BILL2016_001");
        bill.setProductName("洗发水、护发素");
        List<Bill> allUser = billController.dynamicGetAllBill(bill);
        allUser.forEach(System.out::println);
    }

    /**
     * 动态添加账单
     */
    @Test
    public void dynamicAddBill() {
        Bill bill = new Bill();
        bill.setBillCode("BILL2016_019");
        bill.setProductName("脉动、护发素");
        Integer integer = billController.dynamicAddBill(bill);
        System.out.println(integer > 0 ? "添加成功" : "添加失败");
        System.out.println("当前提供者id为" + bill.getId());
    }

    /**
     * 按Id动态更新账单
     */
    @Test
    public void dynamicUpdateBillById() {
        Bill bill = new Bill();
        bill.setId(21);
        bill.setProductName("脉动");
        Integer integer = billController.dynamicUpdateBillById(bill);
        System.out.println(integer > 0 ? "修改成功" : "修改失败");
    }

    /**
     * 按Id动态删除账单
     */
    @Test
    public void dynamicDeleteBillById() {
        Integer[] ids = new Integer[]{20,21};
        Integer integer = billController.dynamicDeleteBillById(ids);
        System.out.println(integer > 0 ? "删除成功" : "删除失败");
    }
}
