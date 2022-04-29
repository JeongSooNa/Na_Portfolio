package statistics_project;

import java.util.ArrayList;
import java.util.List;

public class StatisticsMain {
	public static void main(String[] args) {
		List<Float> list = new ArrayList<Float>();
		list.add(1f);
		list.add(2f);
		list.add(3f);
		list.add(4f);
		list.add(5f);
		list.add(6f);
		list.add(7f);
		list.add(8f);
		list.add(9f);
		list.add(10f);
		StaticsSummaryLogic stat = new StaticsSummaryLogic();
		
		System.out.println("[Summary]");
		System.out.println("min : "+stat.min(list));
		System.out.println("max : "+stat.max(list));
		System.out.println("sum : "+stat.sum(list));
		System.out.println("average : "+stat.avg(list));
		System.out.println("median : "+stat.med(list));
		System.out.println("standard error : "+stat.std(list));
		System.out.println("variance : "+stat.var(list));
		System.out.println("q1 : "+stat.q1(list));
		System.out.println("q3 : "+stat.q3(list));
		System.out.println("interquartile range : "+stat.iqr(list));
		
	}
}
