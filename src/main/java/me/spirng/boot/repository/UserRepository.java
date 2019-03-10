package me.spirng.boot.repository;

import me.spirng.boot.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer>{

}
