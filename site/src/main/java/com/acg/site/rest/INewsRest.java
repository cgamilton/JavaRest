package com.acg.site.rest;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.acg.site.model.News;

@Path("/news")
public interface INewsRest {

	@GET
	@Path("/v1")
	@Produces(MediaType.APPLICATION_JSON)
	public News getNews();

}
