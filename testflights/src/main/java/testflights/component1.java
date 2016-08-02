package testflights;

import org.mule.api.MuleEventContext;

public class component1 {
	public Object onCall(MuleEventContext eventContext) throws Exception {
		  eventContext.getMessage().setPayload("Dit is een Mule Mail App ");
		  return eventContext.getMessage();
		 }
}
