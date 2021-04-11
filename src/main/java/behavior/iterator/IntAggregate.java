package behavior.iterator;

/**
 * 具体聚合数据
 */
public class IntAggregate implements Aggregate<Integer> {

    /**
     * 需要对外提供遍历的数据，但是不想暴露内部是数组结构（即不想暴露内部结构）
     * 此处只是为了展示迭代器模式，没有add remove方法
     */
    private int[] arr = new int[]{5, 11, 7, 3};

    @Override
    public Iterator<Integer> getIterator() {
        return new IntArrayIterator(arr);
    }
}
