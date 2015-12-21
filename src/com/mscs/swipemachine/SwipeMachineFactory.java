package com.mscs.swipemachine;

public class SwipeMachineFactory 
{

	public static SwipeMachine getSwipeMachine(SwipeMachineType machineType)
	{
		SwipeMachine swipeMachine = null;
		
		switch(machineType)
		{
			case IN : 
				swipeMachine = new InSwipeMachine();
				break;
				
			case OUT:
				swipeMachine = new OutSwipeMachine();
				break;				
				
		}
		
		return swipeMachine;
	}
}
