package com.oc.projets.projet_7_batch.batch;

import java.net.URI;
import java.util.List;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.reactive.function.client.WebClient;

import com.oc.projets.projet_7_batch.model.Emprunt;

import io.micrometer.core.instrument.distribution.CountAtBucket;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public class Reader implements ItemReader<Emprunt> {

	private List<Emprunt> emprunts;
	
	private WebClient webClient;
	
	private int count = 0;
	
	public Reader() {
		// TODO Auto-generated constructor stub
		this.webClient = WebClient.create();
		
	}
	
	@Override
	public Emprunt read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		// TODO Auto-generated method stub
		//En local
//		 Flux<Emprunt> flux = this.webClient.get().uri("http://localhost:8080/api/emprunt/batch")
//				 			  .retrieve().bodyToFlux(Emprunt.class);
		
		//En déploiement
		 Flux<Emprunt> flux = this.webClient.get().uri("http://localhost:8080/projet_7-0.0.1-SNAPSHOT/api/emprunt/batch")
	 			  .retrieve().bodyToFlux(Emprunt.class);
		 this.emprunts = flux.collectList().block();

		if(count < this.emprunts.size()) {
			System.out.println("Dans le BATCH");
			System.out.println("Reader titre : " + this.emprunts.get(count).getLivre().getTitre());
			return this.emprunts.get(count++);
		} else {
			count = 0;
		}
		return null;
	}

}
