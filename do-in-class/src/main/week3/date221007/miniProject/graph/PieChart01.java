package main.week3.date221007.miniProject.graph;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.PieChart;
import org.knowm.xchart.PieChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

/**
 * Pie Chart with 4 Slices
 *
 * <p>Demonstrates the following:
 *
 * <ul>
 *   <li>Pie Chart
 *   <li>ChartBuilderPie
 *   <li>Setting Non-circular to match container aspect ratio
 *   <li>Legend outside south, with Horizontal Legend Layout
 */
public class PieChart01 implements ExampleChart<PieChart> {

    public static void main(String[] args) throws IOException {

        ExampleChart<PieChart> exampleChart = new PieChart01();
        PieChart chart = exampleChart.getChart();
        new SwingWrapper<>(chart).displayChart();
    }

    @Override
    public PieChart getChart() {

        // Create Chart
        PieChart chart =
                new PieChartBuilder().width(1500).height(1000).title(getClass().getSimpleName()).build();

        // Customize Chart
        chart.getStyler().setCircular(false);
        chart.getStyler().setLegendPosition(Styler.LegendPosition.OutsideS);
        chart.getStyler().setLegendLayout(Styler.LegendLayout.Horizontal);

        // Series
        try {
            BufferedReader reader = new BufferedReader(new FileReader("move_from_seoul_counts.csv"));
            String s = reader.readLine();
            String[] ss = s.split(" ");
            for (String s1 : ss) {
                chart.addSeries(s1.split(",")[0], Integer.parseInt(s1.split(",")[1]));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return chart;
    }

    @Override
    public CategoryChart getChart(List<Integer> x, List<Integer> y) {
        return null;
    }

    @Override
    public String getExampleChartName() {

        return getClass().getSimpleName() + " - Pie Chart with 4 Slices";
    }
}
