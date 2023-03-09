public class Main {
    public static void main(String[] args) {
        num(5, 14);
    }
    public static int num(int a, int b){
        for(int c=b;a<=b;c--){
            if(b%2==0){
                System.out.println(b);
            }
            b--;
        }
        return a;
    }
}