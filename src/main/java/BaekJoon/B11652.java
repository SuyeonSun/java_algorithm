import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class B11652 {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		Long N = Long.parseLong(in.readLine());
		HashMap<Long, Integer> map = new HashMap<>();

		for (int i = 0; i < N; i++) {
			Long n = Long.parseLong(in.readLine());
			if (map.get(n) == null) {
				map.put(n, 1);
			} else {
				int c = map.get(n);
				map.put(n, c+1);
			}
		}

		Long key = 0L;
		int value = Integer.MIN_VALUE;
		for (Long k : map.keySet()) {
			if (map.get(k) > value) {
				key = k;
				value = map.get(k);
			} else if (map.get(k) == value) {
				key = Math.min(key, k);
			}
		}
		System.out.println(key);
	}
}
