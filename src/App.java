public class App {
    public static void main(String[] args) throws Exception {
        
        int Fn;
        int Fn1 = 0;
        int Fn2 = 1;

        for (int i = 0; i < 10; i++) {
            
            Fn = Fn1 + Fn2;
            Fn2 = Fn1;
            Fn1 = Fn;
            System.out.println(Fn);
        }
    }
}
