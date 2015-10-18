package hackerRank.amitmula;

import org.joda.time.DateTime;

import java.util.Arrays;

public class BusStnProblem {

	DateTime[] arrival = {
		new DateTime(2015, 8, 15, 9, 00, 23),
		new DateTime(2015, 8, 15, 9, 40, 23),
		new DateTime(2015, 8, 15, 9, 50, 23),
		new DateTime(2015, 8, 15, 11, 00, 23),
		new DateTime(2015, 8, 15, 15, 00, 23),
		new DateTime(2015, 8, 15, 18, 00, 23)
	};

	DateTime[] departure = {
		new DateTime(2015, 8, 15, 9, 10, 23),
		new DateTime(2015, 8, 15, 12, 00, 23),
		new DateTime(2015, 8, 15, 11, 20, 23),
		new DateTime(2015, 8, 15, 11, 30, 23),
		new DateTime(2015, 8, 15, 19, 00, 23),
		new DateTime(2015, 8, 16, 20, 00, 23)
	};

	
	int countStations() {
		Arrays.sort(arrival);
		Arrays.sort(departure);
		int min = 1;
		int i = 1, j = 0;
		int count = 1;
		int n = arrival.length;
		while(i < n && j < n) {
			if(arrival[i].isBefore(departure[j])) {
				i++;
				count++;
				if(min < count) min = count;
			}else {
				count--;
				j++;
			}
		}
		return min;
	}
	
	public static void main(String[] args) {
		BusStnProblem prob = new BusStnProblem();
		System.out.println(prob.countStations());
	}

}
