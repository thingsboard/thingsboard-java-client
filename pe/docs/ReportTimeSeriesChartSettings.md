
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
| **stack** | **Boolean** |  | [optional] |
| **comparisonEnabled** | **Boolean** |  | [optional] |
| **timeForComparison** | **ComparisonDuration** |  | [optional] |
| **comparisonCustomIntervalValue** | **Long** |  | [optional] |
| **showLegend** | **Boolean** |  | [optional] |
| **legendColumnTitleFont** | **Font** |  | [optional] |
| **legendColumnTitleColor** | **String** |  | [optional] |
| **legendLabelFont** | **Font** |  | [optional] |
| **legendLabelColor** | **String** |  | [optional] |
| **legendValueFont** | **Font** |  | [optional] |
| **legendValueColor** | **String** |  | [optional] |
| **xaxis** | **TimeSeriesChartXAxisSettings** |  | [optional] |
| **yaxes** | **Map\<String, TimeSeriesChartYAxisSettings\>** |  | [optional] |
| **thresholds** | **List\<TimeSeriesChartThreshold\>** |  | [optional] |
| **grid** | **TimeSeriesChartGridSettings** |  | [optional] |
| **yAxes** | **Map\<String, TimeSeriesChartYAxisSettings\>** |  | [optional] |
| **xAxis** | **TimeSeriesChartXAxisSettings** |  | [optional] |
| **barWidthSettings** | **TimeSeriesChartBarWidthSettings** |  | [optional] |
| **noAggregationBarWidthSettings** | **TimeSeriesChartNoAggregationBarWidthSettings** |  | [optional] |
| **states** | **List\<TimeSeriesChartStateSettings\>** |  | [optional] |
| **comparisonXAxis** | **TimeSeriesChartXAxisSettings** |  | [optional] |
| **legendConfig** | **LegendConfig** |  | [optional] |



---

### Conventions

- **Package:** `org.thingsboard.client.model`
- **Getter pattern:** `get<PropertyName>()` — e.g., `getId()`, `getName()`
- **Setter pattern:** `set<PropertyName>(value)` — e.g., `setId(value)`, `setName(value)`
- **Null fields:** Getters return `null` for unset optional fields; they do not throw exceptions

