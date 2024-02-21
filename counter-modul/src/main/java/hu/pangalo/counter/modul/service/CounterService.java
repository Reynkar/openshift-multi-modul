package hu.pangalo.counter.modul.service;

import org.springframework.stereotype.Service;

@Service
public class CounterService {

	private Integer counter = 0;

	public Integer incrementCounter() {
		return ++counter;
	}
}
