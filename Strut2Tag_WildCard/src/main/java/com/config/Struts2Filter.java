package com.config;

import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

import org.apache.struts2.dispatcher.filter.StrutsPrepareAndExecuteFilter;

@WebFilter(filterName = "struts2", urlPatterns = { "/*" }, initParams = {
	@WebInitParam(name = "struts.enable.SlashesInActionNames", value = "true"),
	@WebInitParam(name = "struts.mapper.alwaysSelectFullNamespace", value = "false"),
	@WebInitParam(name = "struts.patternMatcher", value = "regex") })
public class Struts2Filter extends StrutsPrepareAndExecuteFilter {

}
