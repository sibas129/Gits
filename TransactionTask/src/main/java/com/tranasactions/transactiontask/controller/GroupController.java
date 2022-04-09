package com.tranasactions.transactiontask.controller;

import com.tranasactions.transactiontask.model.Group;
import com.tranasactions.transactiontask.service.GroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class GroupController {

    private final GroupService groupService;

    @Autowired
    public GroupController(GroupService groupService) {
        this.groupService = groupService;
    }

    @GetMapping("/groups")
    @ResponseBody
    public List<Group> findAll(){
        return groupService.findAll();
    }

    @GetMapping("/group-create")
    public String createGroupForm(Group group){
        return "group-create";
    }

    @PostMapping("/group-create")
    public String createGroup(Group group){
        groupService.saveGroup(group);
        return "redirect:/groups";
    }

    @GetMapping("group-delete/{id}")
    public String deleteGroup(@PathVariable("id") Integer id){
        groupService.deleteById(id);
        return "redirect:/groups";
    }

    @GetMapping("/group-update/{id}")
    public String updateGroupForm(@PathVariable("id") Integer id, Model model){
        Group group = groupService.findById(id);
        model.addAttribute("group", group);
        return "group-update";
    }

    @PostMapping("/group-update")
    public String updateGroup(Group group){
        groupService.saveGroup(group);
        return "redirect:/groups";
    }
}
