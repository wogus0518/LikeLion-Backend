package week3.date221007.miniProject.graph;

import org.knowm.xchart.CategoryChart;
import org.knowm.xchart.CategoryChartBuilder;
import org.knowm.xchart.SwingWrapper;
import org.knowm.xchart.style.Styler.LegendPosition;
import week3.date221007.miniProject.context.ReadLineContext;
import week3.date221007.miniProject.domain.HeightInfo;
import week3.date221007.miniProject.parser.PatientHeightParser;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Basic Bar Chart
 *
 * <p>Demonstrates the following:
 *
 * <ul>
 *   <li>Integer categories as List
 *   <li>All positive values
 *   <li>Single series
 *   <li>Place legend at Inside-NW position
 *   <li>Bar Chart Annotations
 */
public class PatientHeightBarChart implements ExampleChart<CategoryChart> {

    public static void main(String[] args) throws IOException {
        final String filename = "resources/patient_height_statistics.txt";
        ReadLineContext<HeightInfo> readLineContext = new ReadLineContext<>(new PatientHeightParser());
        List<HeightInfo> heightInfos = readLineContext.readByLine(filename);
        List<Integer> xAxis = new ArrayList<>();
        List<Integer> yAxis = new ArrayList<>();

        for (HeightInfo heightInfo : heightInfos) {
            xAxis.add(heightInfo.getHeight());
            yAxis.add(heightInfo.getCounts());
        }

        ExampleChart<CategoryChart> exampleChart = new PatientHeightBarChart();
        CategoryChart chart = exampleChart.getChart(xAxis, yAxis);
        new SwingWrapper<>(chart).displayChart();
    }

    @Override
    public CategoryChart getChart() {
        return null;
    }

    @Override
    public CategoryChart getChart(List<Integer> x, List<Integer> y) {

        // Create Chart
        CategoryChart chart =
                new CategoryChartBuilder()
                        .width(1500)
                        .height(600)
                        .title(getClass().getSimpleName())
                        .xAxisTitle("키(cm)")
                        .yAxisTitle("사람 수(명)")
                        .build();

        // Customize Chart
        chart.getStyler().setLegendPosition(LegendPosition.InsideNW);
        chart.getStyler().setLabelsVisible(false);
        chart.getStyler().setPlotGridLinesVisible(false);

        // Series
        chart.addSeries("환자 키 분포", x, y);

        return chart;
    }

    @Override
    public String getExampleChartName() {

        return getClass().getSimpleName() + " - Patient's Height Bar Chart";
    }
}
