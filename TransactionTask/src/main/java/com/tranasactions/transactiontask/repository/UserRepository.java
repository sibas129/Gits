package com.tranasactions.transactiontask.repository;

import com.tranasactions.transactiontask.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
