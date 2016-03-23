package org.naresh.javariders;


import java.io.FileOutputStream;

import org.springframework.amqp.core.Message;
import org.springframework.amqp.core.MessageListener;
import org.springframework.stereotype.Service;


@Service(value="receiver")
public class Receiver implements MessageListener{

	public void onMessage(Message message)
	{

		System.out.println(" pcr_update UUID "+message.getMessageProperties().getMessageId());
		
		FileOutputStream fileOuputStream;
		try {
			fileOuputStream = new FileOutputStream("D:/Test/"+message.getMessageProperties().getHeaders().get("fileName"));
			fileOuputStream.write(message.getBody());
			fileOuputStream.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	    
	
		
	}
}
