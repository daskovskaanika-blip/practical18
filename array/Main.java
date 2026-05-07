package array;

public class Main {

    public static void main(String[] args) {

        ArrayListSimple list = new ArrayListSimple();

        list.add(22);
        list.add(15);
        list.add(67);

        System.out.println("після додавання:");
        list.print();

        list.addIndex(1, 7);

        System.out.println("після вставки:");
        list.print();

        list.remove(2);

        System.out.println("після видалення:");
        list.print();

        System.out.println("елемент: " + list.get(1));

        System.out.println("кількість елементів: " + list.getSize());

        System.out.println("Розмір буфера: " + list.getCapacity());
    }
}