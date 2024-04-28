package Aston;

public class ShellSort {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,2,5,4,6,7,9,8,10};

        for (int x:array){
            System.out.print(x+" ");
        }
        KnuthStep s=new KnuthStep(array);
        shellSort(array,s);
        System.out.println();
        for (int x:array){
            System.out.print(x+" ");
        }
   }
    public static void shellSort(int[] array,StepGenerator stepGen){

        int step = stepGen.nextStep();
        for (; step > 0;) {
            for (int i = step; i < array.length; i++) {
                for (int j = i; j >= step && array[j] < array[j - step]; j -= step) {
                    int temp = array[j];
                    array[j] = array[j - step];
                    array[j - step] = temp;
                }
            }
            step = stepGen.nextStep();
        }

    }

}

//версия по Кнуту для установки значения шага
class KnuthStep implements StepGenerator{
    int i;
    public KnuthStep(int[] array) {
        for (; (Math.pow(3, i) - 1) / 2 < array.length / 3;) {
            i = i + 1;
        }
}
    @Override
    public int nextStep(){
        int step = (int) ((Math.pow(3, i) - 1) / 2);
        i = i - 1;
        return step;
    }
}
interface StepGenerator {
    public int nextStep();
}