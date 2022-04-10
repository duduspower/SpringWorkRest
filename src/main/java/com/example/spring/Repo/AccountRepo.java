package com.example.spring.Repo;

import com.example.spring.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface AccountRepo extends JpaRepository<Account,Integer> {
}
