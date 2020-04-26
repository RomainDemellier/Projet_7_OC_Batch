package com.oc.projets.projet_7_batch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.JavaMailSenderImpl;

public class Writer implements ItemWriter<SimpleMailMessage> {

	private JavaMailSender javaMailSender;
	
	public Writer(JavaMailSender javaMailSender) {
		// TODO Auto-generated constructor stub
		this.javaMailSender = javaMailSender;
	}
	
	@Override
	public void write(List<? extends SimpleMailMessage> items) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Dans write");
		JavaMailSender javaMailSender = new JavaMailSenderImpl();
		for(SimpleMailMessage msg: items) {
			if(msg != null) {
				this.javaMailSender.send(msg);
			}
		}
	}

}
