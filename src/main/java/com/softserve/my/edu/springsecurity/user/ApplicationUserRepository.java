package com.softserve.my.edu.springsecurity.user;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ApplicationUserRepository extends JpaRepository<ApplicationUser, Long> {

	ApplicationUser findByUsername(String name);
}
