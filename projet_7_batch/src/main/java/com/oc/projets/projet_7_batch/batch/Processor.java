package com.oc.projets.projet_7_batch.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.mail.SimpleMailMessage;

import com.oc.projets.projet_7_batch.model.Emprunt;

public class Processor implements ItemProcessor<Emprunt, SimpleMailMessage> {

	@Override
	public SimpleMailMessage process(Emprunt item) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
