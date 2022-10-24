package com.mikirinkode.evogame.service;

import com.mikirinkode.evogame.form.GameForm;
import com.mikirinkode.evogame.model.GameModel;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface GameSvc {
    GameModel create(GameForm form);

    List<GameModel> getAll();

    ResponseEntity<Object> findById(Long id);

    ResponseEntity<Object> updateById(GameForm form, Long id);

    ResponseEntity<Object> deleteById(Long id);
}
