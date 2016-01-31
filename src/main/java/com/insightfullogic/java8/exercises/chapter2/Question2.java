package com.insightfullogic.java8.exercises.chapter2;

import java.text.SimpleDateFormat;

import javax.swing.text.DateFormatter;

public class Question2 {

	// JavaDoc of ThreadLocal:
	// https://docs.oracle.com/javase/8/docs/api/java/lang/ThreadLocal.html

	public static ThreadLocal<DateFormatter> formatter = ThreadLocal.withInitial(() -> new DateFormatter(new SimpleDateFormat("dd-MMM-yyyy")));

}
