package com.example.demo.controller;

import java.nio.file.ProviderMismatchException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {
	
	@GetMapping
	public ResponseEntity<List<String>> greet() throws CustomException {
		throw new CustomException("Error while fetching data");
	}
	
	
	private List<Integer> primeNumbers() {
		List<Integer> list=new ArrayList<>();
		int i=1;
		while(list.size()<=10) {
			if(isPrime(i)) {
				list.add(i);
			}
			i++;
		}
		return list;
	}
	
	private boolean isPrime(int i) {
		if(i<4) {
			return true;
		}
		int mid=i/2;
		for(int j=2;j<=mid;j++) {
			if(i%j==0) {
				return false;
			}
		}
		return true;
	}
	
}
