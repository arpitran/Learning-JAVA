public class Main {
    public static void main(String[] args) {

        // Creating some dice:
        // -------------------
        System.out.println(Dice.sidesOfDice);
        Dice d = new Dice();
        Dice otherDice = new Dice();


        // Rolling two 6-sided dice:
        // -------------------
        System.out.println();
        System.out.println("Six Sides:");
        for (int i = 0; i < 10; i++) {
            System.out.println("First Die: " + d.roll());
            System.out.println("Second Die: " + otherDice.roll());
        }


        // Retrieving face value:
        // -------------------
        System.out.println();
        System.out.println("Face Value: " + d.getFaceValue());
        System.out.println("Face Value: " + otherDice.getFaceValue());


        // Changing die to 8-sides and rolling
        // -------------------
/*        Dice.changeNumSidesOfDice(8);
        System.out.println();
        System.out.println("Eight Sides:");
        for (int i = 0; i < 10; i++) {
            System.out.println("First Die: " + d.roll());
            System.out.println("Second Die: " + otherDice.roll());
        }*/

        // Retrieving face value:
        // -------------------
/*
        System.out.println();
        System.out.println("Face Value: " + d.getFaceValue());
        System.out.println("Face Value: " + otherDice.getFaceValue());
*/


        // Things that are wrong:
        // ---------------------
        // d.sidesOfDice
        // d.changeNumSidesOfDice(8);
        // Dice.roll();
        // Dice.faceValue;

    }
}
