import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;
public class FindFrequencyofElements
{
	public static void main(String[] args) {
		int[] dizi = {10, 20, 20, 10, 10, 20, 5, 20};
		Map<Integer, Integer> frekansMap = new HashMap<>();
		
		for (int element : dizi){
		    if (frekansMap.containsKey(element)){
		        frekansMap.put(element,frekansMap.get(element)+1);
		    }else{
		        frekansMap.put(element,1);
		    }
		}
		System.out.println("Dizi : "+Arrays.toString(dizi));
		System.out.println("Tekrar Sayıları");
		
		for (Map.Entry<Integer, Integer> kayit : frekansMap.entrySet()) {
            System.out.println(kayit.getKey() + " sayısı " + kayit.getValue() + " kere tekrar etti.");
        }
	}
}
