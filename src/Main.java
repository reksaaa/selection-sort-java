public class Main {
    public static void main(String[] args) {

       int[] angkaAcak = {20, 35, -15, 7, 55, 1, -22};

       for (int lastIndex = angkaAcak.length - 1; lastIndex > 0;
            lastIndex--){
           int largest = 0;
           for (int i = 1; i <= lastIndex; i++){
               if(angkaAcak[i] > angkaAcak[largest]){
                   largest = i;
               }
           }
           swap(angkaAcak, largest, lastIndex);
       }
       for(int i = 0; i< angkaAcak.length; i++){
           System.out.println(angkaAcak[i]);
       }
    }
    public  static  void swap (int[] array, int i, int j){
        if(i==j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] =  temp;
    }
}