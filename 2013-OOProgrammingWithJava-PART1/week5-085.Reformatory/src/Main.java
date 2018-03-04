
public class Main {

    public static void main(String[] args) {
        // write here test code 
        
        Reformatory r = new Reformatory();
        
        Person brian = new Person("Brian", 1, 110, 7);
        
        System.out.println(r.weight(brian));
        
        r.feed(brian);
        r.feed(brian);
        
        r.feed(brian);
        
        System.out.println(r.weight(brian));
        
        System.out.println(r.totalWeightsMeasured());
        
    }
}
