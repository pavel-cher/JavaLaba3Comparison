package laba3;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
/**
 * ������ ���� ��������� ������� ������������������ ��������� ArrayList � LinkedList
 * @author ������������ �����
 *
 */
public class Comparison {
    
	/**
	 * ������ ����� ��������� ������������������ ������ add ��������� ArrayList
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
		
		 System.out.println("����� ������ ��� ArrayList (� ������������). ������� � �����  = " + msDelay + ". ����� ���������� 1000000 ���. ");
		 
	}
	
	/**
	 * ������ ����� ��������� ������������������ ������ add ��������� LinkedList
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
		 
		System.out.println("����� ������ ��� LinkedList (� ������������). ������� � �����  = " + msDelay + ". ����� ���������� 1000000 ���. ");
		 
	}
	
	/**
	 * ������ ����� ��������� ������������������ ������ remove ��������� ArrayList
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
		
		 System.out.println("����� ������ ��� ArrayList (� ��). ��������  = " + msDelay + ". ����� ���������� 1500 ���. ");
	}
	
	/**
	 * ������ ����� ��������� ������������������ ������ remove ��������� LinkedList
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
		
		 System.out.println("����� ������ ��� LinkedList (� ��). ��������  = " + msDelay + ". ����� ���������� 1500 ���. ");
	}
	
	/**
	 * ������ ����� ��������� ������������������ ������ get ��������� ArrayList
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
		
		 System.out.println("����� ������ ��� ArrayList (� ��). ����������  = " + msDelay + ". ����� ���������� 20000 ���. ");
	}
	/**
	 * ������ ����� ��������� ������������������ ������ get ��������� LinkedList
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
		
		 System.out.println("����� ������ ��� LinkedList (� ��). ����������  = " + msDelay + ". ����� ���������� 20000 ���. ");
	}
	
	/**
	 * Main �����
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
