import java.util.Arrays;
import java.util.Stack;

public class Solution {
    public boolean isValidSerialization(String preorder) {

        String[] array = preorder.split(",");

        int n = array.length;
        if(n == 1){
            if(array[0].equals("#")){
                return true;
            }else return false;
        }
        Stack<String> stack = new Stack<>();
        for(int i = 0; i < n; i++){
            if(!array[i].equals("#")){
                stack.push(array[i]);
            }else if(array[i].equals("#")){
                if(stack.empty()){
                    return false;
                }else{
                    stack.push("#");
                }
            }
            if(stack.size() > 1 && stack.peek().equals("#")){
                String pop1 = stack.pop();
                String pop2 = stack.pop();

                while (pop1.equals("#") && pop2.equals("#")){
                    stack.pop();
                    if(stack.empty()){
                        if(i != n - 1){
                            return false;
                        }
                        break;
                    }
                    stack.push("#");
                    pop1 = stack.pop();
                    pop2 = stack.pop();
                }
                if(!pop1.equals("#") || !pop2.equals("#")) {
                    stack.push(pop2);
                    stack.push(pop1);
                }



            }



        }


        return stack.empty();
    }
}