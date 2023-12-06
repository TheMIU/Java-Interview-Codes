import java.util.*;

public class IntersectionAndUnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 2, 3, 6, 9, 12, 15 };
        int[] arr2 = { 1, 2, 3, 4, 5, 11, 12, 13, 14 };

        System.out.println("Array 1      : " + Arrays.toString(arr1));
        System.out.println("Array 2      : " + Arrays.toString(arr2));

        System.out.println("Intersection : " + Arrays.toString(getIntersection(arr1, arr2)));
        System.out.println("Union        : " + Arrays.toString(getUnion(arr1, arr2)));
        System.out.println("Difference   : " + Arrays.toString(getDifference(arr1, arr2)));
    }

    // get Intersection
    private static int[] getIntersection(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        Set<Integer> intersectionSet = new HashSet<>();

        for (int num : arr1) {
            set.add(num);
        }

        for (int num : arr2) {
            if (set.contains(num)) {
                intersectionSet.add(num);
            }
        }

        int[] intersection = new int[intersectionSet.size()];
        int index = 0;
        for (int num : intersectionSet) {
            intersection[index++] = num;
        }

        return intersection;
    }

    // get Union
    private static int[] getUnion(int[] arr1, int[] arr2) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr1) {
            set.add(num);
        }
        for (int num : arr2) {
            set.add(num);
        }

        int[] union = new int[set.size()];
        int index = 0;
        for (int num : set) {
            union[index++] = num;
        }

        return union;
    }

    // get Difference
    private static int[] getDifference(int[] arr1, int[] arr2) {
        List<Integer> differenceList = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (int num : arr2) {
            set.add(num);
        }

        for (int num : arr1) {
            if (!set.contains(num)) {
                differenceList.add(num);
            }
        }

        return differenceList.stream().mapToInt(i -> i).toArray();
    }
}
