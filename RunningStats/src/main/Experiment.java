package src.main;

import java.io.*;

public class Experiment{
	public static void main(String[] args){
		Experiment e = new Experiment();
		e.run();
	}

	public void run(){
		CumulativeDataSet meteorMassData = new CumulativeDataSet();
		try{
			File myFile = new File("./src/main/meteorMass.txt");
			FileReader fileReader = new FileReader(myFile);

			BufferedReader reader = new BufferedReader(fileReader);

			String line = null;
			while((line = reader.readLine()) != null){
				double mass;
				try{
					mass = new Double(line);
					if(mass > 0){
						meteorMassData.addSampleToSet(mass);
						System.out.println(meteorMassData.getStandardDeviation());
					}
				} catch (NumberFormatException nEx){
					//do nothing, should be first line of file;
				}
			}
			System.out.println(meteorMassData.getAverage());
			System.out.println(meteorMassData.getVariance());
			System.out.println(meteorMassData.getStandardDeviation());
			reader.close();
		} catch (Exception ex){
			ex.printStackTrace();
		}
	}
}