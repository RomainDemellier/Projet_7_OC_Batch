package com.oc.projets.projet_7_batch.batch;

import java.util.List;

import org.springframework.batch.item.ItemWriter;
import org.springframework.mail.SimpleMailMessage;

public class Writer implements ItemWriter<SimpleMailMessage> {

	@Override
	public void write(List<? extends SimpleMailMessage> items) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
