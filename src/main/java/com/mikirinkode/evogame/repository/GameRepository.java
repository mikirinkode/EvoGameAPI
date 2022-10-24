package com.mikirinkode.evogame.repository;

import com.mikirinkode.evogame.model.GameModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
@Transactional
public interface GameRepository extends JpaRepository<GameModel, Long> {

    @Modifying
    @Query(value = "update game set is_deleted = :flag where id = :id", nativeQuery = true)
    void deleteOne(@Param("flag") boolean flatDeleted, @Param("id") Long id);
}
