public class Main {
    public static void main(String[] args) {

        var firstBoxer = 78.2 ;
        var secondBoxer = 82.7 ;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println("Общий вес боксеров " + totalWeight + " кг.");
        var differenceWeight = firstBoxer - secondBoxer;
        System.out.println("Разница между весами бойцов " + Math.abs(differenceWeight) + " кг.");

    }
}