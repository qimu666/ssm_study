package com.qimu.controller;

import com.qimu.pojo.User;
import com.qimu.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/user")
public class IUserController {
    @Autowired
    private IUserService iUserService;

    @RequestMapping("/index")
    public String login() {
        return "login";
    }

    /**
     * 显示用户,因为用的动态sql所以支持模糊查询
     * @param model
     * @param user
     * @return
     */
    @RequestMapping(value = "/userList")
    public String getAll(Model model,User user) {
        List<User> users = iUserService.dynamicGetAllUser(user);
        model.addAttribute("list", users);
        return "user_list";
    }

    /**
     * 修改用户
     * @param user
     * @param model
     * @return
     */
    @RequestMapping("/update")
    public String update(User user, Model model) {
        User u = new User();
        u.setId(user.getId());
        List<User> users = iUserService.dynamicGetAllUser(u);
        if (!users.isEmpty()) {
            model.addAttribute("user", users.get(0));
        }
        return "doUpdateAndSave";
    }

    /**
     * 添加用户
     * @return
     */
    @RequestMapping("/add")
    public String add() {
        return "doUpdateAndSave";
    }

    /**
     * 执行修改或添加用户信息
     * @param user
     * @return
     */
    @RequestMapping(value = "doUpdateAndSave")
    public String doUpdateAndSave(User user) {
        if (user != null && user.getId() != null) {
            iUserService.dynamicUpdateUserById(user);
        } else {
            iUserService.dynamicAddUser(user);
        }
        return "redirect:/user/userList";
    }

    /**
     * 删除用户
     * @param id
     * @return
     */
    @RequestMapping("/delete")
    public String delete(Integer[] id) {
        if (id != null && id.length > 0) {
            iUserService.dynamicDeleteUserById(id);
        }
        return "redirect:/user/userList";
    }


    public List<User> selectAll() {
        return iUserService.selectAll();
    }

    public List<User> dynamicGetAllUser(User user) {
        return iUserService.dynamicGetAllUser(user);
    }

    public Integer dynamicAddUser(User user) {
        return iUserService.dynamicAddUser(user);
    }

    public Integer dynamicUpdateUserById(User user) {
        return iUserService.dynamicUpdateUserById(user);
    }

    public Integer dynamicDeleteUserById(Integer[] id) {
        return iUserService.dynamicDeleteUserById(id);
    }

    public List<User> findUserAndRole() {
        return iUserService.findUserAndRole();
    }
}
