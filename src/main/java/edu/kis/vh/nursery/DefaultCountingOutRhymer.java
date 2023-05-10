package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    private static final int MAX_SIZE = 12;
    private static final int EMPTY = -1;
    private static final int FULL = 11;


    private final int[] numbers = new int[MAX_SIZE];

    public static int getMaxSize() {
        return MAX_SIZE;
    }

    public static int getEMPTY() {
        return EMPTY;
    }

    public static int getFULL() {
        return FULL;
    }


    public int getTotal() {
        return total;
    }

    private int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {

        return total == EMPTY;


    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
            return EMPTY;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return EMPTY;
        return numbers[total--];
    }

    public int[] getNumbers() {
        return numbers;
    }
}
