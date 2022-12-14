package com.vingo.deviceparser.message.dto;

import java.util.Date;

import com.vingo.deviceparser.common.dto.BaseDTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MessageDTO extends BaseDTO {
	private String id;
	private String message;
	private Date createdDate;
}
