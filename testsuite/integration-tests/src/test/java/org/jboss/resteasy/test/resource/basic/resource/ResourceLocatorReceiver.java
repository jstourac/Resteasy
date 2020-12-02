package org.jboss.resteasy.test.resource.basic.resource;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

public class ResourceLocatorReceiver {

   @Path("/head")
   @GET
   public String get() {
      return this.getClass().getName();
   }
}
