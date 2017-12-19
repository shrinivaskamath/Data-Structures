package tesco.com.org.datastructrures.stack.domain;

public class StackImpl implements Stack{
	Object[] item;
	int top;
	int size;

	public StackImpl() {
		size = 5;
		item = new Object[size];
		top = -1;
	}

	public StackImpl(int size) {
		this.size=size;
		item = new Object[size];
		top = -1;
	}

	public void push(Object num) throws Exception {
		if (top >= size)
			throw new Exception("Stack overflow");
		else
			item[++top] = num;
	}
	public Object pop() throws Exception{
		if(top==-1)
			throw new Exception("Under flow");
		else
		return item[top--];
	}
}
