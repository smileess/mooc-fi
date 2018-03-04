
public class Main {

    public static void main(String[] args) {
        int[] t = {15, 14, 13, 5, 6};
        System.out.println(build(t));
    }

    public static String build(int[] t) {
        StringBuilder sb = new StringBuilder();
        
        sb.append("{" + "\n");
        
        for (int i = 0; i < t.length; i++) {
            
            if ((i + 4) % 4 == 0) {
                sb.append(" ");
            }
            
            if ((i + 1) % 4 != 0) {
                sb.append(t[i] + ", ");
            } else {
                sb.append(t[i] + ", " + "\n");
                if (i == sb.length() - 1) {
                    
                }
            }
        }
        
        if (t.length % 4 != 0) {
            sb.delete(sb.length() - 2, sb.length() - 1);
            sb.append("\n");
        } else {
            sb.delete(sb.length() - 3, sb.length() - 1);
        }
        
        sb.append("}");
        
        return sb.toString();
        
        
    }
}
