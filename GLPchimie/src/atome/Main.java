package atome;

public class Main{
	
	public static void main(String[] args) {
	
		for (TableAtome TableElements : TableAtome.values()){
			System.out.printf("%s %s %s %s %s\n",TableElements.getNom(),TableElements.getSymbole(),TableElements.getA(),TableElements.getZ(),TableElements.getMasse());
		}
		
		
	}
	

}
