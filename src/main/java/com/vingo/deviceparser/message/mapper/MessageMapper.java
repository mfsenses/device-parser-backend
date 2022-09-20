package com.vingo.deviceparser.message.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.vingo.deviceparser.message.dao.entity.Message;
import com.vingo.deviceparser.message.dto.MessageDTO;

@Mapper
public interface MessageMapper {

	MessageDTO toDTO(Message message);
	
	List<MessageDTO> toDTOList(List<Message> message);
}
