package statistics_project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StaticsLogic {
	// 최솟값
	public float min(List<Float> array) {
		float min = array.get(0);
		for(int i=0;i<array.size();i++) {
			if(array.get(i)<min) min = array.get(i);
		}
		return min;
	}
	// 최댓값
	public float max(List<Float> array) {
		float max = array.get(0);
		for(int i=0;i<array.size();i++) {
			if(array.get(i)>max) max = array.get(i);
		}
		return max;
	}
	// 합
	public float sum(List<Float> array) {
		float sum = 0;
		for(float i:array) sum += i;
		return sum;
	}
	// 평균
	public float avg(List<Float> array) {
		float sum = 0;
		for(float i:array) sum += i;
		return sum/array.size();
	}
	// 중위수
	public float cen(List<Float> array) {
		Collections.sort(array);
		int len = array.size();
		if(len%2==0) return (array.get(len/2)+array.get((len/2)-1))/2;
		else return array.get(len/2);
	}
	// 표준편차
	public float std(List<Float> array) {
		float sum = 0;
		for(float i:array) sum += i;
		float avg = sum/array.size();
		float stdSum = 0;
		for(float i : array) {
			stdSum += (i-avg)*(i-avg);
		}
		return (float)(Math.sqrt(stdSum/(array.size()-1)));
	}
	// 분산
	public float var(List<Float> array) {
		float sum = 0;
		for(float i:array) sum += i;
		float avg = sum/array.size();
		float stdSum = 0;
		for(float i : array) {
			stdSum += (i-avg)*(i-avg);
		}
		return stdSum/(array.size()-1);
	}
	// 1사분위수
	public float q1(List<Float> array) {
		Collections.sort(array);
		int len = array.size();
		if(len%4 == 1) return array.get((len-1)/2/2);
		if(len%4 == 2) return ((float)(array.get((len-2)/2/2)*0.25)+(float)(array.get(((len-2)/2/2)+1)*0.75))/2;
		if(len%4 == 3) return (array.get((len-3)/2/2)+array.get(((len-3)/2/2)+1))/2;
		if(len%4 == 0) return ((float)(array.get((len)/2/2)*0.75)+(float)(array.get(((len)/2/2)-1)*0.25))/2;
		return 0;
	}
	// 3사분위수
	public float q3(List<Float> array) {
		Collections.sort(array);
		int len = array.size();
		if(len%4 == 1) return array.get(3*(len/4));
		if(len%4 == 2) return ((float)(array.get(3*(len/4))*0.75)+(float)(array.get((3*(len/4))+1)*0.25))/2;
		if(len%4 == 3) return (array.get(((len/4)*3)+1)+array.get(((len/4)*3)+2))/2;
		if(len%4 == 0) return ((float)(array.get(3*(len/4))*0.75)+(float)(array.get((3*(len/4))-1)*0.25))/2;
		return 0;
	}
	// 사분위수 범위
	public float iqr(List<Float> list) {
		return q3(list)-q1(list);
	}
	// 이상치 추출
	public List<Float> outlier(List<Float> list) {
		List<Float> outlier = new ArrayList<Float>();
		for(Float i : list) {
			if(i > (q3(list)+(iqr(list)*3)) || i < (q1(list)-(iqr(list)*3))) {
				outlier.add(i);
			};
		}
		return outlier;
	}
	// 이상치를 제외한 List 추출
	public List<Float> removeOutlier(List<Float> list){
		List<Float> outlierIndex = new ArrayList<Float>();
		for(int i=0;i<list.size();i++) {
			if(i > (q3(list)+(iqr(list)*3)) || i < (q1(list)-(iqr(list)*3))) {
				outlierIndex.add(i);
			};
		}
		return null;
	}
	// List가 주어지고, 유의확률이 주어질 때 검정 결과(Boolean)
	// List가 주어지고, 유의확률이 주어질 때 참이 될 수 있는 표본 수
	// 표폰의 왜도, 첨도
	// 정규성 검정
	// List 두 개가 주어질 떄 상관계수, 상관분석
}
