import java.util.*;
public class Freq{
	public static void main(String[] args){
		Map<String, Integer> m = new LinkedHashMap<String, Integer>();

		for(String key : args){
			Integer freq = m.get(key);
			m.put(key, (freq == null) ? 1 : freq+1);
		}
		System.out.println(m.size() + " distinct words");
		System.out.println(m);
	}
}