public class ExpressionsAndStatements {
    public static void main(String[] args) {

//        The whole line is STATEMENT! From dataType to semicolon (;)
        double kilometers = (100 * 1.609344);
//        This part "kilometers = (100 * 1.609344)" is expression.
//        STATEMENT = DataType (like double) + Expression + ;

        int highScore = 50;


        if (highScore == 50) { // "hishScore == 50" is EXPRESSION
            System.out.println("This is an expression"); //"This is an expression" is EXPRESSION
        } //Controlled flow STATEMENT
//          Method call IS also a STATEMENT (example --> System.out.println("This is an expression");



//        Exercise
        int score = 100;
        if (score > 99) {
            System.out.println("You got the high score!");
            score = 0;
        }

        /*
        Expressions are:
        * score = 100
        * score > 99
        * "You got the high score!"
        * score = 0
         */
    }
}
