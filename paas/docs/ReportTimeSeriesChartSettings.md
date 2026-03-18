
# ReportTimeSeriesChartSettings

`org.thingsboard.client.model.ReportTimeSeriesChartSettings`

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
| **showTitle** | **Boolean** |  | [optional] |
| **title** | **String** |  | [optional] |
| **titleFont** | **Font** |  | [optional] |
| **titleColor** | **String** |  | [optional] |
| **titleAlignment** | **TextAlignment** |  | [optional] |
| **thresholds** | **List\<TimeSeriesChartThreshold\>** |  | [optional] |
| **stack** | **Boolean** |  | [optional] |
| **grid** | **TimeSeriesChartGridSettings** |  | [optional] |
| **yAxes** | **Map\<String, TimeSeriesChartYAxisSettings\>** |  | [optional] |
| **xAxis** | **TimeSeriesChartXAxisSettings** |  | [optional] |
| **barWidthSettings** | **TimeSeriesChartBarWidthSettings** |  | [optional] |
| **noAggregationBarWidthSettings** | **TimeSeriesChartNoAggregationBarWidthSettings** |  | [optional] |
| **states** | **List\<TimeSeriesChartStateSettings\>** |  | [optional] |
| **comparisonEnabled** | **Boolean** |  | [optional] |
| **timeForComparison** | **ComparisonDuration** |  | [optional] |
| **comparisonCustomIntervalValue** | **Long** |  | [optional] |
| **comparisonXAxis** | **TimeSeriesChartXAxisSettings** |  | [optional] |
| **showLegend** | **Boolean** |  | [optional] |
| **legendColumnTitleFont** | **Font** |  | [optional] |
| **legendColumnTitleColor** | **String** |  | [optional] |
| **legendLabelFont** | **Font** |  | [optional] |
| **legendLabelColor** | **String** |  | [optional] |
| **legendValueFont** | **Font** |  | [optional] |
| **legendValueColor** | **String** |  | [optional] |
| **legendConfig** | **LegendConfig** |  | [optional] |
| **xaxis** | **TimeSeriesChartXAxisSettings** |  | [optional] |
| **yaxes** | **Map\<String, TimeSeriesChartYAxisSettings\>** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

