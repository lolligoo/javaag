import edu.princeton.cs.algs4.Stack;
import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdOut;

public class Parentheses {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        while(!StdIn.isEmpty()){
            String item = StdIn.readString();
            if("(".equals(item) || "[".equals(item) || "{".equals(item) ){
                st.push(item);
            }
            if(!st.isEmpty()){
                if(")".equals(item)){
                    if(!"(".equals(st.pop())){
                        StdOut.println("false");
                        return;
                    }
                }
                if("]".equals(item)){
                    if(!"[".equals(st.pop())){
                        StdOut.println("false");
                        return;
                    }
                }
                if("}".equals(item)){
                    if(!"{".equals(st.pop())){
                        StdOut.println("false");
                        return;
                    }
                }
            }
        }
        StdOut.println("true");
    }
}
