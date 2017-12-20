package tesco.com.org.datastructures.stack.test;

import static org.junit.Assert.*;

import org.junit.Test;

import tesco.com.org.datastructrures.stack.domain.Stack;
import tesco.com.org.datastructrures.stack.domain.StackImpl;

public class StackTest {
@Test	
public void shouldPushElementToEmptyStack() throws Exception{
	Stack stack=new StackImpl();
	stack.push(5);
	assertEquals(stack.pop(),5);
}
@Test	
public void shouldPushElementToStackWhenThereIsAnElementAlreadyPresent() throws Exception{
	Stack stack=new StackImpl();
	stack.push(5);
	stack.push(3);
	assertEquals(stack.pop(),3);
}
@Test(expected = Exception.class)
public void shouldThrowStackOverflowErrorWhenMoreThanFiveItemsArePushed() throws Exception{
	Stack stack=new StackImpl();
	stack.push(5);
	stack.push(3);
	stack.push(5);
	stack.push(3);
	stack.push(5);
	stack.push(7);
}
@Test	
public void shouldPushElementToStackOfSizeThreeWhenTheStackIsEmpty() throws Exception{
	Stack stack=new StackImpl(3);
	stack.push(5);
	assertEquals(stack.pop(),5);
}
@Test
public void shouldPushElementToStackOfSizeThreeWhenTheStackIsEmptyAndThereIsAnElementAlreadyPresent() throws Exception{
	Stack stack=new StackImpl(3);
	stack.push(5);
	stack.push(3);
	assertEquals(stack.pop(),3);
}
@Test(expected = Exception.class)
public void shouldThrowStackOverflowErrorWhenMoreThanThreeItemsArePushed() throws Exception{
	Stack stack=new StackImpl(3);
	stack.push(10);
	stack.push(20);
	stack.push(30);
	stack.push(40);	
}
@Test(expected = Exception.class)
public void shouldThrowStackUnderflowErrorWhenPopIsPerformedWhenStackIsEmpty() throws Exception{
	Stack stack=new StackImpl(3);
	stack.pop();	
}
@Test
public void shouldPushHeterogenousItems() throws Exception{
	Stack stack=new StackImpl(3);
	stack.push("Hi");
	stack.push(2);
	stack.push(2.345678);
	assertEquals(stack.pop(),2.345678);
	assertEquals(stack.pop(),2);
	assertEquals(stack.pop(),"Hi");
}
}
