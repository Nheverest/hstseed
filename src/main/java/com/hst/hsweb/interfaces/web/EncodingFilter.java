package com.hst.hsweb.interfaces.web;

import org.seedstack.seed.Logging;
import org.slf4j.Logger;

import javax.annotation.Priority;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.core.HttpHeaders;
import java.io.IOException;

@WebFilter("/*")
@Priority(1)
public class EncodingFilter implements Filter {

    @Logging
    private Logger log;

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) response;
        log.info("Adding content-type header");
        resp.addHeader(HttpHeaders.CONTENT_TYPE, "text/html; charset=utf-8");
        // Set expiration
        resp.setDateHeader(HttpHeaders.EXPIRES, 0);

        // Set standard HTTP/1.1 no-cache header.
        resp.setHeader(HttpHeaders.CACHE_CONTROL, "no-cache, no store");

        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        // nothing to do
    }

    @Override
    public void destroy() {
        // nothing to do
    }
}
