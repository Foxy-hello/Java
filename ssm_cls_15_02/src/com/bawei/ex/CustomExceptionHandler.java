package com.bawei.ex;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

@Component
public class CustomExceptionHandler implements HandlerExceptionResolver {

	@Override
	public ModelAndView resolveException(
			HttpServletRequest request, 
			HttpServletResponse response,
			Object handler,
			Exception ex) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("ex", ex);
		if(ex instanceof ArrayIndexOutOfBoundsException){  
			mav.setViewName("error");
		}else if(ex instanceof Throwable){  
			mav.setViewName("unknownError");
		}  
		return mav; 	
	}

}
