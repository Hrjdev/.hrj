public class HarmonicAverage {
    public static void main(String[] args){
        int[] numbers = {2,4,6,5,4,3,7,8,9,7,4,10,23,34,65};
        double harmonicAv = numbers.length / harmonicSeries(numbers);
        System.out.println("The harmonic average of the array is : "+harmonicAv);
    }
    public static double harmonicSeries(int[] arr){
        double sum=0;
        for (int i : arr){
            sum+= (1.0/i);
        }return sum;
    }
}
