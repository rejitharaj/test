package com.mycompany.myproject;

import javax.inject.Inject;
import javax.annotation.PostConstruct;
import org.apache.sling.models.annotations.Model;
import org.apache.sling.api.SlingHttpServletRequest;
import org.apache.sling.api.resource.Resource;

	@Model(adaptables=SlingHttpServletRequest.class)
	public class SlingModelsComp {
		
		@Inject
		private SlingHttpServletRequest request;
		private Resource resource;


	  private String value;

	  @PostConstruct
	  public void activate() {
	    System.out.println(request);
		  resource = request.getResource();
		  System.out.println( resource.getPath());
		  value = resource.getPath();
	  }

	  public String getValue() {
	    return value;
	  }
	}

