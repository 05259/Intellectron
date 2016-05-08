/***********************************************************
* Developer: Minhas Kamal (minhaskamal024@gmail.com)       *
* Website: https://github.com/MinhasKamal/Intellectron     *
* License:  GNU General Public License version-3           *
***********************************************************/

package com.minhaskamal.intellectron.neuralnetwork.neuron;

import java.util.Random;

public class Dendrite {
	private double weight;
	
	public Dendrite(double weight) {
		this.weight = weight;
	}
	
	public Dendrite() {
		this(new Random().nextDouble()-0.5);	//ranges between -0.5 to 0.5
	}
	
	public double catchSignal(double signal){
		return signal*this.weight;
	}
	
	public void updateWeight(double corectionRate){
		this.weight += corectionRate;
	}
	
	public double getWeight(){
		return this.weight;
	}
	
	public String toString(){
		return "<weight>"+this.weight+"</weight>";
	}
}