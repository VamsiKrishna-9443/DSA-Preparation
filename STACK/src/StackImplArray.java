class StackImplArray {
    int[] stack;
    int top;
    int size;

    public StackImplArray(int size)
    {
        this.size = size;
        stack = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }
    public boolean isFull()
    {
        return top == size - 1;
    }

    public void push(int data)
    {
        if(isFull())
        {
            System.out.println("Stack Overflow");
        }
        stack[++top] = data;
    }

    public int pop()
    {
        if(isEmpty())
        {
            System.out.println("Stack Underflow");
            return -1;
        }
        return stack[top--];
    }

    public int top()
    {
        if(isEmpty())
        {
            System.out.println("Stack is Empty");
            return -1;
        }
        return stack[top];
    }
    public void display()
    {
        if(isEmpty())
        {
            System.out.println("stcak is empty");
        }
        for(int i = top ; i >= 0;i--)
        {
            System.out.println(stack[i] + " ");
        }
    }
    public static void main(String[] args) {
        StackImplArray s = new StackImplArray(5);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);

        s.display();
        System.out.println("Top :" + s.top());
        System.out.println("Pop :" + s.pop());

        s.display();

    }
}