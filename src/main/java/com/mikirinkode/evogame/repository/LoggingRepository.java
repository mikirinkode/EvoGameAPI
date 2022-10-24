package com.mikirinkode.evogame.repository;

import com.mikirinkode.evogame.model.LoggingModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoggingRepository extends MongoRepository<LoggingModel, String> {

}