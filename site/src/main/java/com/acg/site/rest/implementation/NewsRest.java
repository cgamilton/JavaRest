package com.acg.site.rest.implementation;

import com.acg.site.model.News;
import com.acg.site.rest.INewsRest;

public class NewsRest implements INewsRest {

	public News getNews() {
		return new News("T�tulo da not�cia", "descri��o da not�cia");
	}

}
