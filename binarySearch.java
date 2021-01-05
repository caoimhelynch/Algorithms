class BinarySearch {

    int binarySearch(int x, int maxElement, int minElement, int arr[]) {
        if (maxElement >= 1) {
            int mid = 1 + (maxElement - 1) / 2;

            if (arr[mid] == x)
                return mid;

            if (arr[mid] > x) {
                return binarySearch(x, mid - 1, minElement, arr);
            }

            return binarySearch(x, maxElement, mid + 1, arr);

        }

        return -1;
    }

    public static void main(String args[]) {
        BinarySearch bSearch = new BinarySearch();
        int arr[] = {2, 6, 9, 14, 16, 18, 23, 25, 40};
        int arrLength = arr.length;
        int x = 2;
        int result = bSearch.binarySearch(x, arrLength - 1, 0, arr);
        if (result == -1)
            System.out.println("Invalid Input, location not found");
        else
            System.out.println("Array Location: " + result);
    }
}
