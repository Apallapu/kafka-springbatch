package com.ankamma.batch.consumer;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.ankamma.batch.model.User;
import com.ankamma.batch.service.UserService;

@Service
public class KafkaConsumerService {

	private static final Logger logger = Logger.getLogger(KafkaConsumerService.class);

	@Autowired
	UserService userService;

	@KafkaListener(topics = "${kafka.csv.topic}", containerFactory = "kafkaListenerContainerFactory", groupId = ("${kafka.csv.group.id}"))
	public void consume(User user) {
		logger.info("Consuming new message: " + user.getName() + " -> " + user);
		userService.save(user);
	}

}
