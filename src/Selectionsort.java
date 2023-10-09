public class Selectionsort{

    public static int[] unsorted = {1, 3, 3, 6, 4, 1};

    public static void main(String[] args) {
        int[] sorted = selectionsort(unsorted);

        for (int Element: sorted) {
            System.out.println(Element);
        }
    }

    public static int[] selectionsort(int[] list){

        for (int i = 0; i < list.length-1; i++) {

            for (int j = i + 1; j < list.length; j++) {

                if (list[j] < list[i]){
                    int temp = list[i];
                    list[i] = list[j];
                    list[j] = temp;
                }
            }
        }
        return list;
    }
}