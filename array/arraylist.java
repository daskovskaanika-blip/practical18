package array;

class ArrayListSimple {

    int[] arr = new int[10];
    int size = 0;

    void add(int value) {
        arr[size] = value;
        size++;
    }

    void addIndex(int index, int value) {

        if (index < 0 || index > size) {
            System.out.println("помилка індексу");
            return;
        }

        for (int i = size; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = value;
        size++;
    }

    void remove(int index) {

        if (index < 0 || index >= size) {
            System.out.println("помилка індексу");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }

        size--;
    }

    int get(int index) {

        if (index < 0 || index >= size) {
            System.out.println("помилка індексу");
            return -1;
        }

        return arr[index];
    }

    int getSize() {
        return size;
    }

    int getCapacity() {
        return arr.length;
    }

    void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    }
}