package com.vingo.deviceparser.message.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vingo.deviceparser.message.dao.entity.MessageEntity;
import com.vingo.deviceparser.message.dao.repository.MessageRepository;
import com.vingo.deviceparser.message.dto.MessageDTO;
import com.vingo.deviceparser.message.mapper.MessageMapper;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class MessageServiceImpl implements MessageService {
	private final MessageRepository repository;
	private final MessageMapper mapper;

	@Override
	public List<MessageDTO> getAllMessage() {
		List<MessageEntity> messageEntities = repository.findAll();
		return mapper.toDTOList(messageEntities);
	}

}
