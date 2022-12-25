public class Main {
    public static void main(String[] args) {

        var timepiece = 640;
        var employees = timepiece / 8;
        System.out.println("Всего работников в компании - " + employees + " человек.");
        employees = employees + 94;
        var timepiecePerEmployee = timepiece / employees;
        System.out.println("Если в компании работает " + employees + " человек, то всего " + timepiecePerEmployee + " часов работы может быть поделено между сотрудниками.");


    }
}