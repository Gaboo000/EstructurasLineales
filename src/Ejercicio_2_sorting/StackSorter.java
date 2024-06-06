package Ejercicio_2_sorting;
import java.util.Stack;

public class StackSorter {
    public void sortStack(Stack<Integer> stack){
        Stack<Integer> stack1 = new Stack<>();
        while (!stack1.isEmpty()) {

            int temp = stack.pop();

            while (!stack1.isEmpty() && stack1.peek() > temp){
                stack.push(stack1.pop());
            }

            //
            stack1.push(temp);      
        }

        while (!stack1.isEmpty()) {
            stack.push(stack1.pop());
        }







    }

    
}
