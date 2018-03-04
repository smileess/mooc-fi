package dictionary;

public class Main {
    public static void main(String[] args) {
        // Test your dictionary here
        
        PersonalMultipleEntryDictionary d = new PersonalMultipleEntryDictionary();
        
        d.add("hello", "mary");
        
        d.add("hello", "milo");
        
        d.remove("hello");
        
        System.out.println(d.translate("hello"));
    }
}
