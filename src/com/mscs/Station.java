package com.mscs;

import com.mscs.swipemachine.SwipeMachine;
import com.mscs.swipemachine.SwipeMachineFactory;
import com.mscs.swipemachine.SwipeMachineType;

public class Station 
{
	private final String stationName;
	
	private final SwipeMachine inSwipeMachine;
	private final SwipeMachine outSwipeMachine;
	
	public Station( String stationName)
	{
		this.stationName = stationName;
		inSwipeMachine = SwipeMachineFactory.getSwipeMachine(SwipeMachineType.IN);
		outSwipeMachine = SwipeMachineFactory.getSwipeMachine(SwipeMachineType.OUT);;
	}
}
