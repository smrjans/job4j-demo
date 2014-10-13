package com.talentica.job4j.demo.jobB2C;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.InputProducer;
import com.talentica.job4j.demo.model.B;

public class BInputProducer implements InputProducer<B> {
	private static final Logger logger = LoggerFactory.getLogger(BInputProducer.class);
	private int num=100000;

	public B produceInput() {
		B b = null;
		if(num>0){
			num--;
			b = new B();
			b.setId(num);
			b.setName("B name"+num);
			b.setDescription("B description"+num);
		}else{
			num=1000;
		}
		logger.debug("Produced B >> "+b);
		return b;
	}

}
