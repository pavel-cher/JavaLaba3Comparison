package laba3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
/**
 * Данный клас позволяет оценить производительность коллекций ArrayList и LinkedList
 * @author Черныховский Павел
 *
 */
public class Comparison {
    
	/**
	 * Данный метод вычисляет производительность метода add коллекции ArrayList
	 */
	public static void timeAddEndArrayList()
	{
		 ArrayList<Integer> x = new ArrayList<>();
		 
		 Date currentTime = new Date();
		 
		 for (int i=0; i<=1000000;i++) 
		 {
			 x.add(i);
		 }
		 Date newTime = new Date();
		 long msDelay = newTime.getTime() - currentTime.getTime(); 
		
		 System.out.println("Время работы для ArrayList (в милисекундах). Вставка в конец  = " + msDelay + ". Метод выполнялся 1000000 раз. ");
		 
	}
	
	/**
	 * Данный метод вычисляет производительность метода add коллекции LinkedList
	 */
	public static void timeAddEndLinkedList()
	{
		LinkedList<Integer> x = new LinkedList<>();
		
		Date currentTime = new Date();
		
		for (int i=0; i<=1000000;i++) 
		{
			 x.add(i);
		}
		
		Date newTime = new Date();
		long msDelay = newTime.getTime() - currentTime.getTime(); 
		 
		System.out.println("Время работы для LinkedList (в милисекундах). Вставка в конец  = " + msDelay + ". Метод выполнялся 1000000 раз. ");
		 
	}
	
	/**
	 * Данный метод вычисляет производительность метода remove коллекции ArrayList
	 */
	public static void timeRemoveArrayList()
	{
		 ArrayList<Integer> x = new ArrayList<>();
		 
		 
		 for (int i=0; i<=1000000;i++) 
		 {
			 x.add(i);
		 }
		 

		 Date currentTime = new Date();
		 
		 for (int i=0; i<=1500;i++) 
		 {
			 x.remove(i);
		 }
		 
		 Date newTime = new Date();
		 long msDelay = newTime.getTime() - currentTime.getTime(); 
		
		 System.out.println("Время работы для ArrayList (в мс). Удаление  = " + msDelay + ". Метод выполнялся 1500 раз. ");
	}
	
	/**
	 * Данный метод вычисляет производительность метода remove коллекции LinkedList
	 */
	public static void timeRemoveLinkedList()
	{
        
		LinkedList<Integer> x = new LinkedList<>();
		
		for (int i=0; i<=1000000;i++) 
		 {
			 x.add(i);
		 }
		 

		 Date currentTime = new Date();
		 
		 for (int i=0; i<=1500;i++) 
		 {
			 x.remove(i);
		 }
		 
		 Date newTime = new Date();
		 long msDelay = newTime.getTime() - currentTime.getTime(); 
		
		 System.out.println("Время работы для LinkedList (в мс). Удаление  = " + msDelay + ". Метод выполнялся 1500 раз. ");
	}
	
	/**
	 * Данный метод вычисляет производительность метода get коллекции ArrayList
	 */
	public static void timeGetElementsArrayList()
	{
		 ArrayList<Integer> x = new ArrayList<>();
		 
		 
		 for (int i=0; i<=1000000;i++) 
		 {
			 x.add(i);
		 }
		 

		 Date currentTime = new Date();
		 
		 for (int i=50000; i<=70000;i++) 
		 {
			 x.get(i);
		 }
		 
		 Date newTime = new Date();
		 long msDelay = newTime.getTime() - currentTime.getTime(); 
		
		 System.out.println("Время работы для ArrayList (в мс). Извлечение  = " + msDelay + ". Метод выполнялся 20000 раз. ");
	}
	/**
	 * Данный метод вычисляет производительность метода get коллекции LinkedList
	 */
	public static void timeGetElementsLinkedList()
	{
        
		LinkedList<Integer> x = new LinkedList<>();
		
		for (int i=0; i<=1000000;i++) 
		 {
			 x.add(i);
		 }
		 

		 Date currentTime = new Date();
		 
		 for (int i=50000; i<=70000;i++) 
		 {
			 x.get(i);
		 }
		 
		 Date newTime = new Date();
		 long msDelay = newTime.getTime() - currentTime.getTime(); 
		
		 System.out.println("Время работы для LinkedList (в мс). Извлечение  = " + msDelay + ". Метод выполнялся 20000 раз. ");
	}
	
	/**
	 * Main метод
	 * @param args
	 */
	public static void main(String args[])
	
	{
		
		// Add
		System.out.println("ADD");
		timeAddEndArrayList();
		timeAddEndLinkedList();
		// Delete
		System.out.println("DELITE");
		timeRemoveArrayList();
		timeRemoveLinkedList();
		// Get 
		System.out.println("GET");
		timeGetElementsArrayList();
		timeGetElementsLinkedList();
		
	}
}
