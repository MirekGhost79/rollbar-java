package com.rollbar.spring.webmvc;

import com.rollbar.web.listener.RollbarRequestListener;
import javax.servlet.ServletContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.bind.annotation.ControllerAdvice;

public class RollbarWebApplicationInitializer implements WebApplicationInitializer {

  @Override
  public void onStartup(ServletContext container) {
    container.addListener(RollbarRequestListener.class);
  }

}