package Practical_01;

class Stack{
    private int[] stackArray;
    private int top;
    private int maxSize;

    Stack(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;
    }

    public boolean isStackEmpty(){
        return top == -1;
    }

    public boolean isStackFull(){
        return top == maxSize - 1 ;
    }

    public void push(int value){
        if (isStackFull()){
            System.out.println("Stack is full");
        }

        stackArray[++top] = value;
    }

    public int pop(){
        if (isStackEmpty()){
            System.out.println("Stack is empty");
        }
        return stackArray[top--];
    }

    public int size(){
        return top + 1;
    }

}

class Stack1{
    private char[] stackArray;
    private int top;
    private int maxSize;

    Stack1(int size){
        maxSize = size;
        stackArray = new char[maxSize];
        top = -1;
    }

    public boolean isStackEmpty(){
        return top == -1;
    }

    public boolean isStackFull(){
        return top == maxSize - 1 ;
    }

    public void push(char value){
        if (isStackFull()){
            System.out.println("Stack is full");
        }

        stackArray[++top] = value;

    }

    public char pop(){
        if (isStackEmpty()){
            System.out.println("Stack is empty");
        }

        return stackArray[top--];
    }

    public int size(){
        return top + 1;
    }

    public char top(){
        return stackArray[top];
    }

}


public class Q1 {
    public static void main(String[] args) {
//        String str = "Department of Statistics and Computer Science";
//
//        System.out.println(str);
//        str = reverseString(str);
//        System.out.println(str);

//        String str = "madam";
//        System.out.println(isPalindrome(str));

//        String str = "DIALOGUE";
//        order(str);

//        int decimal = 5;
//        toBinary(decimal);
//        toOctal(decimal);

    }

    public static void Q6(){
        Stack stack = new Stack(10);
        stack.push(3);
    }

    public static void toBinary(int num){
        Stack stack = new Stack(100);

        int i = 0;
        while (num > 0){
            stack.push(num % 2);
            num = num / 2;
            i++;
        }

        while (!stack.isStackEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void toOctal(int num){
        Stack stack = new Stack(100);

        int i = 0;
        while (num > 0){
            stack.push(num % 8);
            num = num / 8;
            i++;
        }

        while (!stack.isStackEmpty()){
            System.out.print(stack.pop());
        }
        System.out.println();
    }

    public static void order(String str){
        Stack1 s1 = new Stack1(str.length());
        Stack1 s2 = new Stack1(str.length());

        for (int i = 0; i < str.length(); i++) {
            char element = str.charAt(i);
            if (element == 'A' ||
                element == 'E' ||
                element == 'I' ||
                element == 'O' ||
                element == 'U')
            {
                s1.push(element);
            }
        }

        while (!s1.isStackEmpty()){
            char temp = s1.pop();
            while (!s2.isStackEmpty() && s2.top() > temp){
                s1.push(s2.pop());
            }
            s2.push(temp);
        }

        while (!s2.isStackEmpty()){
            System.out.print(s2.pop());
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str){
        Stack2 s1 = new Stack2(20);

        char[] chars = str.toCharArray();
        for (char c : chars){
            s1.push(c);
        }

        for (int i = 0; i < s1.size(); i++) {
            chars[i] = (char) s1.pop();
        }

        String newStr = new String(chars);

        return str.equals(newStr);
    }

    public static String reverse(String str){

        Stack2 s1 = new Stack2(20);

        char[] chars = str.toCharArray();
        for (char c : chars){
            s1.push(c);
        }

        for (int i = 0; i < str.length(); i++) {
            chars[i] = (char) s1.pop();
        }

        return new String(chars);

    }

    public static String reverseString(String str){
        Stack s1 = new Stack(100);

        String[] words = str.split("\\s+");
        for (String word : words){
            //s1.push(word);
        }

        String reversed = "";
        while (!s1.isStackEmpty()){
            reversed += s1.pop();
            if (s1.size() > 0){
                reversed += " ";
            }
        }

        return reversed;
    }

}
