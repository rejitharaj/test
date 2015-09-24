package com.mycompany.myproject;

import com.adobe.cq.sightly.WCMUse;

public class SightlyComponent extends WCMUse {

	private String myTitle;
	private String title;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getMyTitle() {
		return myTitle;
	}

	@Override
	public void activate() {
	//	System.out.println("hello");
		myTitle = "My Project is " + getCurrentPage().getTitle()+" "+getResource().getPath();
	}

}
