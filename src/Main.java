public class Main {
    public static void main(String[] args) {
        Gryffindor harry = new Gryffindor("Гарри Поттер", 80,76,90,89,71);
        Gryffindor hermione = new Gryffindor("Uермиона Грейнджер", 92,79,69,38,68);
        Gryffindor ron = new Gryffindor("Рон Уизли", 57,68,47,69,48);
        Slytherin drako = new Slytherin("Драко Малфой", 69,48,69,84,69,48);
        Slytherin graham = new Slytherin("Монтегрю", 68,46,43,36,78,23);
        Slytherin gregori = new Slytherin("Грегори", 68,56,34,13,78,46);
        Hufflepuff zaharia = new Hufflepuff("Захария", 54,87,35,23,64);
        Hufflepuff sedrick = new Hufflepuff("Седрик", 53,75,78,25,46);
        Hufflepuff finch = new Hufflepuff("Финч", 43,65,78,35,24);
        Ravenclaw chang = new Ravenclaw("Чанг",67,35,24,76,35);
        Ravenclaw padma = new Ravenclaw("Падма", 46,75,25,87,45);
        Ravenclaw marcus = new Ravenclaw("Маркус", 56,78,24,76,34);

        hermione.comparison(harry);
        marcus.comparisonPower(drako);
        System.out.println(ron.toString());


    }
}