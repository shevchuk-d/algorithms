package array;

import java.util.stream.IntStream;

public class ArrayCRUD {

    private int initialSize;
    private int[] arr;

    public ArrayCRUD(int initialSize){
        this.initialSize = initialSize;
        this.arr = new int[initialSize];
        IntStream.range(0, initialSize)
                .forEach(i -> this.arr[i] = (int) (Math.random() * initialSize) + initialSize);
    }

    public static void main(String[] args) {
        ArrayCRUD array = new ArrayCRUD(10);
        System.out.println(array.toString());
    }

    public int[] getArr() {
        return arr;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++){
            sb.append("| ").append(i).append(" | ")
                    .append(arr[i]).append(" |").append("\n");
        }
        return sb.toString();
    }

    public void deleteByIndex(int i){

    }

    public int[] linearSearch(int item) {
        return new int[item];
    }

    public int getByIndex(int i) {
        if (i < arr.length) return arr[i];
        throw new IllegalArgumentException("Index should be less than arrays size");
    }
}
