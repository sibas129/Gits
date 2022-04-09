package com.tranasactions.transactiontask.repository;

import com.tranasactions.transactiontask.model.Group;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Integer> {
}
