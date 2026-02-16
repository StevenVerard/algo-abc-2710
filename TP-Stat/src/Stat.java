

import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author SVerard
 * @version 1.0
 * @created 16-f�vr.-2026 10:10:17
 */
public class Stat {

	private ArrayList<Double> salaires;
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
	public void stat(float quartiles, float moyenne, float mediane, float ecartType, double[] salaires){
		this.quartiles = quartiles;
		this.moyenne = moyenne;
		this.mediane = mediane;
		this.ecartType = ecartType;
		this.salaires = new ArrayList<>(Arrays.asList(2100.0, 2150.0, 2200.0, 2250.0, 2300.0, 2350.0, 2400.0, 2450.0, 2500.0, 2550.0, 2600.0, 2650.0, 2700.0, 2750.0, 2800.0, 2900.0, 2950.0, 2950.0, 3000.0, 3000.0,
3000.0, 3000.0, 3100.0, 3100.0, 3150.0, 3150.0, 3200.0, 3200.0, 3250.0, 3250.0, 3300.0, 3300.0, 3350.0, 3350.0, 3400.0, 3400.0, 3450.0, 3500.0, 3550.0, 3600.0, 3650.0, 3700.0,
3750.0, 3800.0, 3850.0, 3900.0, 3900.0, 3950.0, 3950.0, 4000.0, 4100.0, 4150.0, 4200.0, 4250.0, 4300.0, 4350.0, 4400.0, 4450.0, 4500.0, 4550.0, 4600.0, 4650.0, 4700.0, 4750.0, 4800.0, 4850.0, 4900.0, 4950.0, 5000.0, 5050.0,
5100.0, 5150.0, 5200.0, 5250.0, 5300.0, 5350.0, 5400.0, 5450.0, 5500.0, 5500.0, 5600.0, 5700.0, 5800.0, 5900.0, 6000.0, 6100.0, 6200.0, 6300.0, 6400.0, 6500.0, 6700.0, 6900.0, 7100.0, 7400.0, 7700.0, 8000.0, 8300.0, 8700.0, 9100.0, 9500.0));
	}

	public Stat(){

	}

	public void finalize() throws Throwable {

	}

	public double ecartType(double[] salaires){
		return 0;
	}

	public float mediane(double[] salaires){
		return mediane;
	}

	public float quartiles(double[] salaires){
		return quartiles;
	}

	public double moyenne(double[] salaires){
		float sum = 0;
		for (double salary : salaires){
			sum += salary;
		} 
		this.moyenne = sum / salaires.length;
		return this.moyenne;
	}

	public void stat(){

	}

}