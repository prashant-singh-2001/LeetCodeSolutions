package level_Easy;

public class AverageSalaryExecludingMaximumAndMinimumSalary {
	public double average(int[] salary) {
		double average = 0;
		int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
		for (int i : salary) {
			max = max > i ? max : i;
			min = min < i ? min : i;
		}
		for (int i : salary) {
			if (i != max && i != min)
				average += i;
		}
		average = average / (double) (salary.length - 2);
		return average;
	}
}
