public class Main {
    public static void main(String[] args) {
        // Задача 1
        int age = 20;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }

        // Задача 2
        int temperature = 3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки");
        }

        // Задача 3
        int speed = 75;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }

        // Задача 4
        int ageForEducation = 16;
        if (ageForEducation >= 2 && ageForEducation <= 6) {
            System.out.println("Если возраст человека равен " + ageForEducation + ", то ему нужно ходить в детский сад");
        } else if (ageForEducation >= 7 && ageForEducation <= 17) {
            System.out.println("Если возраст человека равен " + ageForEducation + ", то ему нужно ходить в школу");
        } else if (ageForEducation >= 18 && ageForEducation <= 24) {
            System.out.println("Если возраст человека равен " + ageForEducation + ", то ему нужно ходить в университет");
        } else if (ageForEducation > 24) {
            System.out.println("Задача 4: Если возраст человека равен " + ageForEducation + ", то ему нужно ходить на работу");
        } else {
            System.out.println("Если возраст человека равен " + ageForEducation + ", то ему нужно ходить на работу");
        }

        // Задача 5
        int childAge = 10;
        if (childAge < 5) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } else if (childAge >= 5 && childAge < 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }

        // Задача 6
        int passengers = 85;
        if (passengers < 60) {
            System.out.println("В вагоне есть сидячее место");
        } else if (passengers < 102) {
            System.out.println("В вагоне есть только стоячее место");
        } else {
            System.out.println("Вагон уже полностью забит");
        }

        // Задача 7
        int one = 15;
        int two = 25;
        int three = 10;

        if (one >= two && one >= three) {
            System.out.println("Наибольшее число: " + one);
        } else if (two >= three) {
            System.out.println("Наибольшее число: " + two);
        } else {
            System.out.println("Наибольшее число: " + three);
        }
    }
}