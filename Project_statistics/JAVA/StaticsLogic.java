package statistics_project;

import java.util.Arrays;

public class StaticsLogic {
	// 최솟값
	public double min(double array[]) {
		double min = array[0];
		for(int i=0;i<array.length;i++) {
			if(array[i]<min) min = array[i];
		}
		return min;
	}
	// 최댓값
	public double max(double array[]) {
		double max = 0;
		for(int i=0;i<array.length;i++) {
			if(array[i]>max) max = array[i];
		}
		return max;
	}
	// 합
	public double sum(double array[]) {
		double sum = 0;
		for(double i:array) sum += i;
		return sum;
	}
	// 평균
	public double avg(double array[]) {
		double sum = 0;
		for(double i:array) sum += i;
		return sum/array.length;
	}
	// 중위수
	public double cen(double array[]) {
		Arrays.sort(array);
		if(array.length%2 != 0) return array[array.length/2];
		else return (array[array.length/2]+array[(array.length/2)-1])/2;
	}
	// 표준편차
	public double std(double array[]) {
		double sum = 0;
		for(double i:array) sum += i;
		double avg = sum/array.length;
		double stdSum = 0;
		for(double i : array) {
			stdSum += (i-avg)*(i-avg);
		}
		return Math.sqrt(stdSum/(array.length-1));
	}
	// 분산
	public double var(double array[]) {
		double sum = 0;
		for(double i:array) sum += i;
		double avg = sum/array.length;
		double stdSum = 0;
		for(double i : array) {
			stdSum += (i-avg)*(i-avg);
		}
		return stdSum/(array.length-1);
	}
	// 1사분위수
	public double q1(double array[]) {
		int len = array.length;
		return 0;
	}
	// 3사분위수
	public double q3(double array[]) {
		
		return 0;
	}
}
