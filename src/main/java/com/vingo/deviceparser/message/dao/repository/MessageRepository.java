package com.vingo.deviceparser.message.dao.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.vingo.deviceparser.message.dao.entity.MessageEntity;

@Repository
public interface MessageRepository extends MongoRepository<MessageEntity, String>  {

}
