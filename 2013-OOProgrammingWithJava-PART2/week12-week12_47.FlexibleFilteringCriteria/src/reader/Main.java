package reader;

import reader.criteria.AtLeastOne;
import reader.criteria.ContainsWord;
import reader.criteria.Criterion;

public class Main {

    public static void main(String[] args) {
        Criterion criterion = new AtLeastOne(new ContainsWord("maito"), new ContainsWord("vesi") );
        System.out.println(criterion.complies("vesi vanhin voitehista"));
    }
}
