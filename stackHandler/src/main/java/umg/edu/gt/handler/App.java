package umg.edu.gt.handler;

import umg.edu.gt.datastructure.SymbolValidator;

public class App {

    public static void main(String[] args) {

        SymbolValidator validator = new SymbolValidator();

        String valid = "(a+b) * [c-d]";
        String invalid = "([)]";

        System.out.println(valid + " -> " + validator.isValid(valid));
        System.out.println(invalid + " -> " + validator.isValid(invalid));
    }
}