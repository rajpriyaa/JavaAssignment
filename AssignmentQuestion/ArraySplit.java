package AssignmentQuestion;

public class ArraySplit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Integer[] arr = new Integer[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        Arrays.sort(arr, Collections.reverseOrder());

        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        int sum1 = 0, sum2 = 0;

        for (Integer num : arr) {
            if (sum1 <= sum2) {
                list1.add(num);
                sum1 += num;
            } else {
                list2.add(num);
                sum2 += num;
            }
        }

        List<Integer> list = new ArrayList<>(list1);
        list.addAll(list2);

        System.out.println("Sorted Array: " + list);
//        we can print the sum diff between the list tpp using Math.abs.
//        System.out.println("Absolute Difference: " + Math.abs(sum1 - sum2));
    }
}
