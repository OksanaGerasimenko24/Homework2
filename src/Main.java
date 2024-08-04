public class Main {
    public static void main(String[] args) {
        // задача 1
        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);

        // задача 2
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);

        // задача 3
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        // задача 4
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7 ;
        System.out.println(friend);

        // задача 5
        var frog = 3.5;
        System.out.println(frog);
        frog = (frog * 10);
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        // задача 6
        var sport1 = 78.2;
        System.out.println(sport1);
        var sport2 = 82.7;
        System.out.println(sport2);
        var massa = sport1 + sport2;
        System.out.println("Общая масса спортсменов = " + massa);
        var difference = sport2 - sport1;
        System.out.println("Разница между массой спортсменов = " + difference);

        // задача 7
        var residual = sport2 % sport1;
        System.out.println("Остаток от деления = " + residual);

        // задача 8. первый пункт
        var totalHours = 640;
        var hours = 8;
        var employees = totalHours / hours;
        System.out.println("Всего работников в компании - " + employees + " человек.");

        // задача 8. второй пункт
        var totalEmployees = employees + 94;
        var workHours = totalEmployees * hours;
        System.out.println("Если в компании работает " + totalEmployees + " человек, то всего " + workHours + " часов работы может быть поделено между сотрудниками");

    }
}