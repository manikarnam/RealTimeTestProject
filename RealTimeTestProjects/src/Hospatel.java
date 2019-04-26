
public class Hospatel {
	int pid;
	String pname;
	String pprob;
	
	Hospatel(int id,String name,String prob){
		
		pid=id;
		pname=name;
		pprob=prob;
		}
	void display() {
		
System.out.println("Patient Details:"+pid+" "+pname+" "+pprob);
		
		}
	public static void main(String[] args) {
		
		 Hospatel h=new  Hospatel(10,"ramki","low bp");
		 Hospatel h1=new  Hospatel(11,"siva","cough");
		 Hospatel h2=new  Hospatel(12,"santosh","mentally stressd");
		 Hospatel h3=new  Hospatel(13,"kumar","thyroid");
		 
		 
		 h.display();
		 h1.display();
		 h2.display();
		 h3.display();
		
		
	}
		
		
	}
	


