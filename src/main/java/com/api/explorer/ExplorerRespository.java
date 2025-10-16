package com.api.explorer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface ExplorerRespository extends JpaRepository<Users,Integer> {
    @Query("SELECT u FROM Users u WHERE u.username=:username")
    Users getUser(@Param("username") String username);
}
