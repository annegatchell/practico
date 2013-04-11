package src.main;

public class CumulativeDataSet{
  private int totalSamples;
  private int cumulativeSumOfSamples; 
  private long cumulativeSumOfSampleSquares; //eg. a^2 + b^2 + c^2

  public CumulativeDataSet(){
    totalSamples = 0;
    cumulativeSumOfSamples = 0;
    cumulativeSumOfSampleSquares = 0;
  }

  public void addSampleToSet(int sampleToAdd){
    totalSamples++;
    cumulativeSumOfSamples += sampleToAdd;
    cumulativeSumOfSampleSquares += sampleToAdd*sampleToAdd;
  }

  public double getAverage(){
    if(totalSamples == 0) return Double.NaN; 
    return cumulativeSumOfSamples/totalSamples;
  }
  
  public double getVariance(){
    if(totalSamples == 0) return Double.NaN;
    double average = getAverage();
    double variance =  (1/totalSamples)*
                        (cumulativeSumOfSampleSquares 
                          - 2* average* cumulativeSumOfSamples 
                          + totalSamples* Math.pow(average, 2));
    return variance;
  }

  public double getStandardDeviation(){
    if(totalSamples == 0) return Double.NaN;
    return Math.sqrt(getVariance());
  }

  public int gettotalSamples(){
    return totalSamples;
  }

  public int getCumulativeSumOfSamples(){
    return cumulativeSumOfSamples;
  }

  public long getCumulativeSumOfSampleSquares(){
    return cumulativeSumOfSampleSquares;
  }

}