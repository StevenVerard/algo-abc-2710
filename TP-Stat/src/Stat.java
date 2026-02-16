

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * @author SVerard
 * @version 1.0
 * @created 16-f�vr.-2026 10:10:17
 */
public class Stat {

	private ArrayList<Float> salaires;
	private float quartiles;
	private float moyenne;
	private float mediane;
	private float ecartType;

		/**
	 * 
	 * @param quartiles
	 * @param moyenne
	 * @param mediane
	 * @param ecartType
	 */
	public Stat(ArrayList<Float> _liste){
		this.salaires = _liste;
	}
	public Stat(){
		this.salaires = new ArrayList<Float>(Arrays.asList(2100.0f, 2150.0f, 2200.0f, 2250.0f, 2300.0f, 2350.0f, 2400.0f, 2450.0f, 2500.0f, 2550.0f, 2600.0f, 2650.0f, 2700.0f, 2750.0f, 2800.0f, 2900.0f, 2950.0f, 2950.0f, 3000.0f, 3000.0f,
3000.0f, 3000.0f, 3100.0f, 3100.0f, 3150.0f, 3150.0f, 3200.0f, 3200.0f, 3250.0f, 3250.0f, 3300.0f, 3300.0f, 3350.0f, 3350.0f, 3400.0f, 3400.0f, 3450.0f, 3500.0f, 3550.0f, 3600.0f, 3650.0f, 3700.0f,
3750.0f, 3800.0f, 3850.0f, 3900.0f, 3900.0f, 3950.0f, 3950.0f, 4000.0f, 4100.0f, 4150.0f, 4200.0f, 4250.0f, 4300.0f, 4350.0f, 4400.0f, 4450.0f, 4500.0f, 4550.0f, 4600.0f, 4650.0f, 4700.0f, 4750.0f, 4800.0f, 4850.0f, 4900.0f, 4950.0f, 5000.0f, 5050.0f,
5100.0f, 5150.0f, 5200.0f, 5250.0f, 5300.0f, 5350.0f, 5400.0f, 5450.0f, 5500.0f, 5500.0f, 5600.0f, 5700.0f, 5800.0f, 5900.0f, 6000.0f, 6100.0f, 6200.0f, 6300.0f, 6400.0f, 6500.0f, 6700.0f, 6900.0f, 7100.0f, 7400.0f, 7700.0f, 8000.0f, 8300.0f, 8700.0f, 9100.0f, 9500.0f));
	}
	

	public void finalize() throws Throwable {

	}

	public Float ecartType(Float[] salaires){
		return 0.0f;
	}

	public float mediane() { 
			Collections.sort(salaires);
			int n = salaires.size(); 
			if (n % 2 == 1) {
				return salaires.get(n / 2);
			} else {
				return (salaires.get(n / 2 - 1) + salaires.get(n / 2)) / 2;
			}
	}

	public float quartiles(){
			Collections.sort(salaires);
			int n = salaires.size();
			float q1 = salaires.get(n / 4);
			float q3 = salaires.get(3 * n / 4);
			this.quartiles = q3 - q1;
		return quartiles;
	}

	public Float moyenne(){
		float sum = 0;
		for (Float salary : salaires){
			sum += salary;
		} 
		this.moyenne = sum / salaires.size();
		return this.moyenne;
	}

	@Override
	public String toString() {
		
		return "liste salaires: "+this.
		salaires+"\nMedian: "+this.mediane()+"\nMoyenne :"+moyenne+"\nQuartiles :"+quartiles;
	}

}