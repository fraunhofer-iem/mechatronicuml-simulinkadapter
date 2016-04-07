package de.uni_paderborn.fujaba.simulink.model;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.muml.simulink.Bus;
import org.muml.simulink.BusCreator;
import org.muml.simulink.Line;
import org.muml.simulink.SimulinkFactory;

import de.uni_paderborn.fujaba.simulink.model.test.TestBase;

public class BusCreatorTest extends TestBase 
{
	@Test
	public void busReference()
	{
		Bus bus = SimulinkFactory.eINSTANCE.createBus();
		
		BusCreator busCreator = SimulinkFactory.eINSTANCE.createBusCreator();		
		busCreator.getOutPorts().add(SimulinkFactory.eINSTANCE.createOutPortBlock());
		
		Line line = SimulinkFactory.eINSTANCE.createLine();
		line.setSourceBlock(busCreator);
		line.setSourcePort(busCreator.getOutPorts().get(0));
		line.setBus(bus);
		
		assertModelIsValid(busCreator);
		
		assertEquals(bus, busCreator.getBus());
		
	}

}
