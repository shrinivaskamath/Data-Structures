package tesco.com.datastructures.singlelinkedlist.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tesco.com.datastructures.singlelinkedlist.domain.SingleLinkedList;

public class SingleLinkedListTest {

@Test
public void shouldAddElementToTheListWhenItIsEmpty(){
	SingleLinkedList list=new SingleLinkedList();
	list.addEnd(2);
	assertEquals(list.count,1);
	assertEquals(list.get(0).intValue(),2);
}
@Test
public void shouldAddElementToTheListWhenItOneElementIsAlreadyPresent(){
	SingleLinkedList list=new SingleLinkedList();
	list.addEnd(2);
	list.addEnd(3);
	assertEquals(list.count,2);
	assertEquals(list.get(1).intValue(),3);
}
@Test
public void shouldAddElementMultipleElements(){
	SingleLinkedList list=new SingleLinkedList();
	list.addEnd(2);
	list.addEnd(3);
	list.addEnd(4);
	list.addEnd(6);
	list.addEnd(8);
	list.addEnd(10);
	assertEquals(list.count,6);
	assertEquals(list.get(0).intValue(),2);
	assertEquals(list.get(1).intValue(),3);
	assertEquals(list.get(2).intValue(),4);
	assertEquals(list.get(3).intValue(),6);
	assertEquals(list.get(4).intValue(),8);
	assertEquals(list.get(5).intValue(),10);
}
@Test
public void shouldDeleteLastElementWhenThereIsOnlyOneElementPresentInTheList(){
	SingleLinkedList list=new SingleLinkedList();
	list.addEnd(2);
	assertEquals(list.count,1);
	list.deleteLast();
	assertEquals(0,list.count);
	assertEquals(null,list.get(0));
	
}
@Test
public void shouldPerformMultipleAddAndDeleteOperations(){
	SingleLinkedList list=new SingleLinkedList();
	list.addEnd(2);
	assertEquals(list.count,1);
	list.deleteLast();
	assertEquals(0,list.count);
	assertEquals(null,list.get(0));
	
}
}
