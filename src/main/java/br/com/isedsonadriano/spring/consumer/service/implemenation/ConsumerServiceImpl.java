package br.com.isedsonadriano.spring.consumer.service.implemenation;

import br.com.isedsonadriano.spring.consumer.dto.Message;
import br.com.isedsonadriano.spring.consumer.service.ConsumerService;
import org.springframework.stereotype.Service;

@Service
public class ConsumerServiceImpl implements ConsumerService {

    @Override
    public void action(Message message) throws  Exception{
        ///throw new Exception("haha");
        System.out.println(message.getText());
    }

}
