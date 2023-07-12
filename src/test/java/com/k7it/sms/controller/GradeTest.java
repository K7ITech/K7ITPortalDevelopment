package com.k7it.sms.controller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class GradeTest {

	@Test
	void gradeF() {
		Grade grade = new Grade();
		assertEquals('F',grade.determineLetterGreade(59));
	}
	
	@Test
	void gradeD() {
		Grade grade = new Grade();
		assertEquals('D',grade.determineLetterGreade(69));
	}
	
	@Test
	void gradeC() {
		Grade grade = new Grade();
		assertEquals('C',grade.determineLetterGreade(79));
		
	}
	
	@Test
	void gradeB() {
		Grade grade = new Grade();
		assertEquals('B',grade.determineLetterGreade(89));
	}
	
	@Test
	void gradeA() {
		Grade grade = new Grade();
		assertEquals('A',grade.determineLetterGreade(99));
	}
	
	@Test
	void exceptionCase() {
		Grade grade = new Grade();
		assertThrows(IllegalArgumentException.class, ()->{
			grade.determineLetterGreade(-1);
		});
	}
	
	//assertThrows without lambda expression
	@Test
	void exceptionCase1() {
	    Grade grade = new Grade();
	    assertThrows(IllegalArgumentException.class, new Executable() {
	        @Override
	        public void execute() throws Throwable {
	            grade.determineLetterGreade(-2);
	        }
	    });
	    
	}    

}
