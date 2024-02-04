package com.librarymanagementsystem.repositories;

import com.librarymanagementsystem.model.UserAccount;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends CrudRepository<UserAccount, Long> {

}
