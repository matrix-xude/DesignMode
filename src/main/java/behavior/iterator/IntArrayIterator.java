package behavior.iterator;

/**
 * int[]的具体迭代器
 */
public class IntArrayIterator implements Iterator<Integer> {

    private int[] arr;
    // 迭代器的当前位置
    private int index = 0;

    public IntArrayIterator(int[] arr) {
        this.arr = arr;
    }

    @Override
    public Integer getNext() {
        return arr[index++];
    }

    @Override
    public boolean hasNext() {
        return index < arr.length;
    }
}
