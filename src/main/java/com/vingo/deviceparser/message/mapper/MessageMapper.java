package com.vingo.deviceparser.message.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.vingo.deviceparser.message.api.output.MessageOutput;
import com.vingo.deviceparser.message.dao.entity.MessageEntity;
import com.vingo.deviceparser.message.dto.MessageDTO;

@Mapper(componentModel="spring")
public abstract class MessageMapper {

	public abstract MessageDTO toDTO(MessageEntity message);
	
	public abstract MessageOutput toDTO(MessageDTO message);
	
	public abstract List<MessageDTO> toDTOList(List<MessageEntity> messages);

	public abstract List<MessageOutput> toDTOListOutput(List<MessageDTO> messages);
}
