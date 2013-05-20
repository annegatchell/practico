public class Ball implements BounceBehavior{
	private enum Unit{mm,cm,dm,m,km,Mm}
	Unit units;
	double radius;
	Material material;
	double velocity; //m/s
	double bounciness;

	//Meters/second
	public void setVelocity(double velocity){
		this.velocity = velocity;
	}	

	public void dropBallFromHeight(int height){
		System.out.println("Bouncing!");

	}
}

interface BounceBehavior{
	//Height in meters
	void dropBallFromHeight(int height);

}

class Material{

}