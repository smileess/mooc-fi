public class Main {
    public static void main(String[] args) {
        // write testcode here
        
        Counter p = new Counter(25, true);
        
        
        p.decrease();
        System.out.println(p.getAmount());
        
        p.increase(6);
        System.out.println(p.getAmount());
        
        p.decrease(100);
        
        System.out.println(p.getAmount());
        
        System.out.println(p.getAmount());
    }
}
