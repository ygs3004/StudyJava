package tbrainExample02;

public class Numbers {

	int[] num;

	Numbers(int[] num) {
		this.num = num;
	}

	int getTotal() {
		int total = 0;
		for (int nums : num) {
			total += nums;
		}
		return total;
	}

	int getAverage() {
		int avg = 0;
		avg = getTotal() / num.length;
		return avg;
	}
}