public class Bubblesort {

    public static int[] unsorted = {3, 5, 2, 6, 4, 1};

    public static void main(String[] args) {
        int[] sorted = bubblesort(unsorted);

        for (int Element: sorted) {
            System.out.println(Element);
        }
    }

    public static int[] bubblesort(int[] list){

        for(int i= 1; i< list.length+1; i++){

            for(int j=0; j<list.length-i; j++){

                if(list[j]>list[j+1]){
                    int temp = list[j];
                    list[j] = list[j+1];
                    list[j+1] = temp;
                }
            }
        }
        return list;
    }
}