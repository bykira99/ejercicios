import javax.swing.plaf.synth.SynthTextAreaUI;

public class Main {
    public static void main(String[] args) {
        num(5, 14);
    }
    public static int num(int a, int b) {
        while (a <= b) {
            System.out.println(a);
            a++;
        }
        return a;
    }
}