package org.naresh.javariders;


import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;
/**
 * This is sample meta data receiver
 * @author Naresh
 *
 */
@Service(value="metaDataReceiver")
public class MetaDataReceiver implements MessageListener{

	
	public void onMessage(Message message) {
		// TODO Auto-generated method stub
		System.out.println("metatdata UUID  "+message.getMessageProperties().getMessageId());
	}
}
