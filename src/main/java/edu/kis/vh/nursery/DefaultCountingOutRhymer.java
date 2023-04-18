package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {
    public static final int MAX_SIZE = 12;
    public static final int EMPTY = -1;
    public static final int FULL = 11;
    final int RETURN_VALUE = -1;

<<<<<<< HEAD
    private final int[] numbers = new int[MAX_SIZE];
=======
    public static final int INT = -1;
    public static final int INT1 = 12;
    
    private int[] numbers = new int[INT1];
>>>>>>> b02da8fd14599f090d0dfb8cb856f471e1dc5af9

    public int total = EMPTY;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
<<<<<<< HEAD
        return total == EMPTY;
=======
        return total == INT;
>>>>>>> b02da8fd14599f090d0dfb8cb856f471e1dc5af9
    }

    public boolean isFull() {
        return total == FULL;
    }

    protected int peekaboo() {
        if (callCheck())
<<<<<<< HEAD
            return RETURN_VALUE;
=======
            return INT;
>>>>>>> b02da8fd14599f090d0dfb8cb856f471e1dc5af9
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
<<<<<<< HEAD
            return RETURN_VALUE;
=======
            return INT;
>>>>>>> b02da8fd14599f090d0dfb8cb856f471e1dc5af9
        return numbers[total--];
    }

}
