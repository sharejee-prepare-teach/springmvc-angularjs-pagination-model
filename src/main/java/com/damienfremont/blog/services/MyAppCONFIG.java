package com.damienfremont.blog.services;

import com.damienfremont.blog.controller.ServiceJAXRS;

import java.util.HashSet;
import java.util.Set;
import javax.ws.rs.core.Application;

public class MyAppCONFIG extends Application {

  @Override
  public Set<Class<?>> getClasses() {
    Set<Class<?>> s = new HashSet<Class<?>>();
    s.add(ServiceJAXRS.class);
    return s;
  }
}