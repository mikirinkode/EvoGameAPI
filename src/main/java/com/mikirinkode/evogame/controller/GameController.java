package com.mikirinkode.evogame.controller;

import com.mikirinkode.evogame.form.GameForm;
import com.mikirinkode.evogame.model.GameModel;
import com.mikirinkode.evogame.service.GameSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/game")
public class GameController {

    private final GameSvc gameSvc;

    @Autowired
    private GameController(GameSvc gameSvc){
        this.gameSvc = gameSvc;
    }

    @PostMapping
    public GameModel create(@RequestBody GameForm form) {
        return gameSvc.create(form);
    }

    @GetMapping
    public List<GameModel> getAll() {
        return gameSvc.getAll();
    }

    @GetMapping(value = "{id}")
    public ResponseEntity<Object> findById(@PathVariable Long id){
        return gameSvc.findById(id);
    }

    @PostMapping(value = "{id}/update")
    public ResponseEntity<Object> updateById(@RequestBody GameForm form, @PathVariable Long id){
        return gameSvc.updateById(form, id);
    }

    @DeleteMapping(value = "{id}")
    public ResponseEntity<Object> deleteById(@PathVariable Long id){
        return gameSvc.deleteById(id);
    }
}
