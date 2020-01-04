package org.nagesh.demo.repo;

import org.nagesh.demo.modal.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
