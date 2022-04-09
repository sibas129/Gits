package com.tranasactions.transactiontask.service;

import com.tranasactions.transactiontask.model.Group;
import com.tranasactions.transactiontask.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    @Transactional(readOnly = true)
    public Group findById(Integer id){
        return groupRepository.getOne(id);
    }

    @Transactional(readOnly = true)
    public List<Group> findAll(){
        return groupRepository.findAll();
    }

    @Transactional
    public Group saveGroup(Group group){
        return groupRepository.save(group);
    }

    @Transactional
    public void deleteById(Integer id){
        groupRepository.deleteById(id);
    }
}
