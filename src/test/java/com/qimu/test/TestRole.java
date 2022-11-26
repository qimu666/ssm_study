package com.qimu.test;

import com.qimu.controller.RoleController;
import com.qimu.pojo.Role;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
//设置Spring.测试环境的配置文件
@ContextConfiguration(locations = {"classpath:springmvc-config.xml", "classpath:spring-config.xml"})
public class TestRole {
    @Autowired
    private RoleController roleController;

    /**
     * 动态获取角色信息
     */
    @Test
    public void dynamicGetUser() {
        Role role = new Role();
        role.setRoleCode("SMBMS_ADMIN");
        role.setRoleName("系统管理员");
        List<Role> allUser = roleController.getAllRole(role);
        allUser.forEach(System.out::println);
    }

    /**
     * 动态添加角色信息
     */
    @Test
    public void dynamicAddUser() {
        Role role = new Role();
        role.setRoleCode("SMBMS_DEAM");
        role.setRoleName("系统用户");
        role.setCreatedBy(1);
        Integer allUser = roleController.dynamicAddRole(role);
        System.out.println("当前主键id为：" + role.getId());
    }

    /**
     * 根据id动态修改角色信息
     */
    @Test
    public void dynamicUpdateRoleById() {
        Role role = new Role();
        role.setId(7);
        role.setRoleCode("System");
        role.setRoleName("管理员");
        Integer integer = roleController.dynamicUpdateRoleById(role);
        System.out.println(integer > 0 ? "修改成功" : "修改失败");
    }

    /**
     * 通过id动态删除角色信息
     */
    @Test
    public void dynamicDeleteRoleById() {
        Integer[] ids = new Integer[]{6, 7};
        Integer integer = roleController.dynamicDeleteRoleById(ids);
        System.out.println(integer > 0 ? "删除成功" : "删除失败");
    }
}
