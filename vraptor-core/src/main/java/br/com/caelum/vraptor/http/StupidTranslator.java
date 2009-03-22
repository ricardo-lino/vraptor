package br.com.caelum.vraptor.http;

import javax.servlet.http.HttpServletRequest;

import br.com.caelum.vraptor.resource.ResourceMethod;
import br.com.caelum.vraptor.resource.ResourceRegistry;

public class StupidTranslator implements UrlToResourceTranslator {
	
	private final ResourceRegistry registry;

	public StupidTranslator(ResourceRegistry registry) {
		this.registry = registry;
	}

	public ResourceMethod translate(HttpServletRequest request) {
		String resourceName = request.getRequestURI();
		String methodName = request.getMethod();
		ResourceMethod resource = registry.gimmeThis(resourceName, methodName);
		return resource;
	}

}
