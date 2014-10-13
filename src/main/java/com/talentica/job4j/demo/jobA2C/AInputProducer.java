package com.talentica.job4j.demo.jobA2C;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.talentica.job4j.api.InputProducer;
import com.talentica.job4j.demo.model.A;

public class AInputProducer implements InputProducer<A> {
	private static final Logger logger = LoggerFactory.getLogger(AInputProducer.class);
	private int num=100000;

	public A produceInput() {
		A a = null;
		if(num>0){
			num--;
			a = new A();
			a.setId(num);
			a.setName("A name"+num);
			a.setDescription("A description"+num);
		}else{
			num=1000;
		}
		logger.debug("Produced A >> "+a);
		return a;
	}
}
