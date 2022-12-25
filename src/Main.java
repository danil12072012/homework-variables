public class Main {
    public static void main(String[] args) {

        var firstBoxer = 78.2 ;
        var secondBoxer = 82.7 ;

        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println("Разница между весами бойцов " + differenceWeight + " кг.");
        var difference = (firstBoxer + secondBoxer) % firstBoxer;
        System.out.println("Разница между весами боксеров " + difference + " кг.");


    }
}