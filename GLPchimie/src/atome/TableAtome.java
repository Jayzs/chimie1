package atome;
//import java.util.Enumeration;

public enum TableAtome {
	/////1er ligne/////////////
	Hydrogene("Hydrogene","H","1","1","1.0"),
	Helium("Helium","He","4","2","4.0"),
	 ////3eme ligne////////////
	Sodium("Sodium","Na","23","11","23.0"),
	Magnesium("Magnesium","Mg","24","12","24.3"),
	Aluminium("Aluminium","Al","27","13","27.0"),
	Silicium("Silicium","Si","28","14","28.1"),
	Phosphore("Phosphore","P","31","15","31.0"),
	Soufre("Soufre","S","32","16","32.1"),
	Chlore("Chlore","Cl","35","17","35.5"),
	Argon("Argon","Ar","39","18","39.9"),
	////7eme ligne////////////
	Francium("Francium","Fr","223","87","223.0"),
	Radium("Radium","Ra","226","88","226.0"),
	Kurchatovium("kurchatovium","Ku","261","104","261.0"),
	Hahnium("hahnium","Ha","262","105", "262.0"),
	Seaborgium("seaborgium","Sg","--","106"," "),
	Bohrium("bohrium","Bh","--","107"," "),
	Hassium("hassium","Hs","--","108"," "),
	Meitnerium("meitn�rium","Mt","--","109"," "),
	Darmstadtium("--","X","--","110"," "),
	Roentgenium("--","X","--","111"," "),
	Copernicium("--","X","--","112"," "),
	Flerovium("--","X","--","114"," ")	,
	Livermorium("--","X","--","116"," "),
	Ununoctium("--","X","--","118"," "),
	////Externe///////////////
	Actinides("Actinides","Ac","227","89","227.0"),
	Thorium("thorium","Th","232","90","232.0"),
	Protactinium("protactinium","Pa","231","91","231.0"),
	Uranium("uranium","U","238","92","238.0"),
	Neptunium("neptunium","Np","237","93","237.0"),
	Plutonium("plutonium","Pu","239","94","242.0"),
	Americium("americium","Am","243","95","243.0"),
	Curium("curium","Cm","247","96","247.0"),
	Berkelium("berkelium","Bk","247","97","247.0"),
	Californium("californium","Cf","251","98","251.0"),
	Einsteinium("einsteinium","Es","254","99","254.0"),
	Fermium("F�rmium","Fm","257","100","253.0"),
	Mendelevium("Mend�levium","Md","258","101","256.0"),
	Nobelium("Nob�lium","No","259","102","254.0"),
	Lawrencium("lawrencium","Lr","260","103","257.0");
	
private final String z; // num�ro atomique
private final String a; // nombre de masse
private final String nom;
private final String symbole;
private final String masse; // masse molaire en g/mol

TableAtome(String nom,String symbole,String a,String z,String masse){
	this.nom=nom;
	this.symbole=symbole;
	this.a=a;
	this.z=z;
	this.masse=masse;	
}

public String getZ() {
	return z;
}
public String getA() {
	return a;
}
public String getNom() {
	return nom;
}
public String getSymbole() {
	return symbole;
}
public String getMasse() {
	return masse;
}
}