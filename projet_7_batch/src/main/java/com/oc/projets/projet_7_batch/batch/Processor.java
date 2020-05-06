package com.oc.projets.projet_7_batch.batch;

import org.springframework.batch.item.ItemProcessor;
import org.springframework.mail.SimpleMailMessage;

import com.oc.projets.projet_7_batch.model.Emprunt;

public class Processor implements ItemProcessor<Emprunt, SimpleMailMessage> {

	@Override
	public SimpleMailMessage process(Emprunt item) throws Exception {
		// TODO Auto-generated method stub
		SimpleMailMessage msg = new SimpleMailMessage();
		//msg.setTo("romaindemellier@gmail.com");
		msg.setTo(item.getUsager().getEmail());
		msg.setSubject("Livre à retourner : " + item.getExemplaire().getLivre().getTitre());
		msg.setText("Bonjour " + item.getUsager().getPrenom() + ' ' + item.getUsager().getNom() + ",\n" + 
				"Vous avez emprunté le livre : " + item.getExemplaire().getLivre().getTitre() + ".\n" + 
				" Vous deviez le rendre le : " + item.getDateRetour() + ".\n" +
				"Nous vous demandons de nous retourner le livre dans les plus brefs délais.");
		return msg;
	}

}
