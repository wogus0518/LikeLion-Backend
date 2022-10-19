package main.week3.date221007.miniProject.graph;


import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.internal.chartpart.Chart;

import java.util.List;

public interface ExampleChart<C extends Chart<?, ?>> {

    C getChart();

    CategoryChart getChart(List<Integer> x, List<Integer> y);

    String getExampleChartName();
}
