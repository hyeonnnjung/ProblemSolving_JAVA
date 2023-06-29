import java.util.Scanner;

public class BOJ_10828 {

    public static int stack[];
    public static int count = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int N = input.nextInt();
        stack = new int[N];

        for(int i = 0; i < N; i++){
            String str = input.next();

            switch(str){
                case "push":
                    push(input.nextInt());
                    break;
                case "pop":
                    sb.append(pop()).append('\n');
                    break;
                case "size":
                    sb.append(size()).append('\n');
                    break;
                case "empty":
                    sb.append(empty()).append('\n');
                    break;
                case "top":
                    sb.append(top()).append('\n');
                    break;
            }
        }
        System.out.println(sb);
    }


    public static void push(int num){
        stack[count] = num;
        count++;
    }

    public static int pop(){
        if(count == 0){
            return -1;
        }
        else{
            int num = stack[count - 1];
            count--;
            return num;
        }
    }

    public static int size(){
        return count;
    }

    public static int empty(){
        if(count == 0){
            return 1;
        }
        else{
            return 0;
        }
    }

    public static int top(){
        if(count == 0){
            return -1;
        }
        else{
            return stack[count - 1];
        }
    }
}
