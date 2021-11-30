package br.com.isedsonadriano.spring.consumer.service;

import br.com.isedsonadriano.spring.consumer.dto.Message;

public interface ConsumerService {

    public void action(Message message) throws Exception;
}
