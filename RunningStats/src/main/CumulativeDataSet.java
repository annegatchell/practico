package src.main;

public class CumulativeDataSet{
  private int totalSamples;
  private double cumSumOfSamples; 
  private double cumSumOfSampleSquares; //eg. a^2 + b^2 + c^2

  public CumulativeDataSet(){
    totalSamples = 0;
    cumSumOfSamples = 0e0;
    cumSumOfSampleSquares = 0e0;
  }

  public <T extends Number> void addSampleToSet(T sampleToAdd){
    totalSamples++;
    cumSumOfSamples += sampleToAdd.doubleValue();
    cumSumOfSampleSquares += Math.pow(sampleToAdd.doubleValue(),2);
  }

  public double getAverage(){
    if(totalSamples == 0) return Double.NaN; 
    return cumSumOfSamples/totalSamples;
  }
  
  public double getVariance(){
    if(totalSamples == 0) return Double.NaN;
    double average = getAverage();
    // Variance = 
    // (1/totalSamples)*(cumSumOfSampleSquares - 2*average*cumSumOfSamples + totalSamples*average^2)
    double vNumeratorTerm1 = cumSumOfSampleSquares;
    double vNumeratorTerm2 = 2*average*cumSumOfSamples;
    double vNumeratorTerm3 = totalSamples*Math.pow(average,2);
    double numeratorOfVariance = vNumeratorTerm1 - vNumeratorTerm2 + vNumeratorTerm3;
    double variance = numeratorOfVariance/totalSamples;
    return variance;
  }

  public double getStandardDeviation(){
    if(totalSamples == 0) return Double.NaN;
    return Math.sqrt(getVariance());
  }

  public int gettotalSamples(){
    return totalSamples;
  }

  public double getCumSumOfSamples(){
    return cumSumOfSamples;
  }

  public double getCumSumOfSampleSquares(){
    return cumSumOfSampleSquares;
  }

}