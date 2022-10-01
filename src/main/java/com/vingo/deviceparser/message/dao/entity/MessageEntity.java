package com.vingo.deviceparser.message.dao.entity;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Document("messages")
public class MessageEntity {
	
	@Id
	private String id;
	private String message;
	private Date createdDate;
}
