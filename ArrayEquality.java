import java.util.Arrays;

class ArrayEquality {
    public static void main( String args[] ) {
        int [] arr1 = new int [] {5, 10, -12, 15, 14};
        int [] arr2 = new int [] {5, 10, -12, 15, 14};
        System.out.println(Arrays.equals(arr1, arr2));
    }
}