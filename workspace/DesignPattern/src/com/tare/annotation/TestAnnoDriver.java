package com.tare.annotation;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class TestAnnoDriver {

	public static void main(String[] args) {
		Method methods[] = new Test().getClass().getDeclaredMethods(); 
		
		for (int i = 0; i < methods.length; i++) {
			String methodName = methods[i].getName(); 
			System.out.println(methodName);
			if (methods[i].isAnnotationPresent(TestAnno.class)
					&& methodName.startsWith("do")) {
				
				Annotation annos[] = methods[i].getDeclaredAnnotations();
				for (int j=0; j<annos.length; j++) {
					System.out.println(annos[j].toString()); 
				}
			}
		}
		
	}
	
}
