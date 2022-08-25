package Center1;

public class Cercle {
	
	
		private static int count;  
		float center,radius;
		public Cercle(float center,float radius) {
			this.center=center;
			this.radius=radius;
			count++;
		}
		Cercle(float center, int radius){
			this.center=center;
			this.radius=radius;
			count++;
		}
		Cercle(int center, int radius){
			this.center=center;
			this.radius=radius;
			count++;
		}
		void display() {
		System.out.println("Center: "+center+" "+"Radius: "+radius);
	}
		public static void main(String[] args) {
			Cercle c1=new Cercle(17.3f,34.2f);
			Cercle c2=new Cercle(13.4f,21.6f);
			Cercle c3 = new Cercle(11.6f,16);
			Cercle c4 = new Cercle(24,29);
			c1.display();
			c2.display();
			c3.display();
			c4.display();
			System.out.print("Total Number of Instance: " + Cercle.count); 

		}

	}