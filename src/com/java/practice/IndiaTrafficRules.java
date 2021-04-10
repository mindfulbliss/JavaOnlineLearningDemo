package com.java.practice;;

public class IndiaTrafficRules implements CommonTrafficRules,AsiaTrafficRules 
{
	//boolean isManned=false;
	
	
	public static void main(String[] args)
	{
		IndiaTrafficRules itr = new IndiaTrafficRules();
		itr.junctionCrossing();
		System.out.println(itr.railwayCrossing());
		itr.PedestrianCrossing();
		
		CommonTrafficRules  ctr = new IndiaTrafficRules();
		
		ctr.junctionCrossing();
		System.out.println(ctr.railwayCrossing());
		
		AsiaTrafficRules atr = new IndiaTrafficRules();
		atr.PedestrianCrossing();
		


		
	}

	@Override
	public String railwayCrossing() {
		if(isManned) {
			return "Crossing is manned please follow the rules";
		}
		return "get down from yout vehicle Look to your left and right and then proceed.";
	}

	@Override
	public void junctionCrossing() {
		System.out.println("Proceed with caution");
		
	}

	@Override
	public void PedestrianCrossing() {
		System.out.println("Always give way to pedestrians to cross the road at designated crossing");
		
	}

}
