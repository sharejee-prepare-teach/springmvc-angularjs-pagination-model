package com.damienfremont.blog.services;


import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.damienfremont.blog.repository.DatasRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

@Path("/person")
public class ServiceJAXRS {

  DatasRepository datas = new DatasRepository();

  @Path("/page")
  @GET
  @Produces(MediaType.APPLICATION_JSON)
  public Page<com.damienfremont.blog.model.Person> getAll( //
                                                           @QueryParam("sort") String sort, //
                                                           @QueryParam("page") Integer page, //
                                                           @QueryParam("size") Integer size) {
    Pageable pageRequest = new PageRequest( //
        ((page == null) ? 0 : (page - 1)), //
        ((size == null) ? 10 : size));
    return datas.findAll(pageRequest);
  }
}