package Ch02;


import java.util.Scanner;

/**
 * Created by Sang Jun Park on 9/2/2023.
 * Github : http://github.com/SangJun-GitHub
 */
public class Main1874 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayStack stack = new ArrayStack(n);
        StringBuilder sb = new StringBuilder();

        int index = 0;
        boolean pass = true;
        while( n-- > 0){
            int value = scanner.nextInt();

            if(value > index){
                for(int i = index + 1; i <= value; i++){
                    stack.push(i);
                    sb.append('+').append('\n');
                }
                stack.pop();
                index = value;
            } else if(stack.peek() == value) {
                stack.pop();
                sb.append('-').append('\n');
            }else if(stack.peek() != value){
                pass = false;
            }

        }


        if(pass) {
            System.out.println(sb);
        }else{
            sb.delete(0, sb.length());
            sb.append("NO").append('\n');
            System.out.println(sb);
        }
    }
    interface Stack {
        boolean isEmpty();
        boolean isFull();
        void push(int num);
        int pop();
        int peek();
        void clear();
    }
    static class ArrayStack implements Stack{
        private int top;
        private final int stackSize;
        private int[] stackArr;

        public ArrayStack(int stackSize){
            top = -1;
            this.stackSize = stackSize;
            stackArr = new int[this.stackSize];
        }

        public boolean isEmpty(){
            return (top == -1);
        }

        public boolean isFull(){
            return (top == this.stackSize);
        }

        public void push(int num){
            if(isFull()){
                System.out.println("Stack is full");
            }else {
                stackArr[++top] = num;
            }
        }

        public int pop(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return 0;
            }else{
                return stackArr[top--];
            }
        }
        public int peek(){
            if(isEmpty()){
                System.out.println("Stack is empty");
                return 0;
            }else {
                return stackArr[top];
            }
        }

        public void clear(){
            top = -1;
            stackArr = new int[this.stackSize];
        }
    }
}
