package com.tradenity.sdk.spring;

import com.tradenity.sdk.client.SessionTokenStore;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

public class SpringMvcSessionProvider implements SessionTokenStore {
    public static final String AUTH_TOKEN_ATTRIBUTE_NAME = "auth_token_attribute";

    protected HttpSession getHttpSession() {
        ServletRequestAttributes attr = (ServletRequestAttributes) RequestContextHolder.currentRequestAttributes();
        return attr.getRequest().getSession(true);
    }

    public Object getAttribute(String attributeName) {
        return getHttpSession().getAttribute(attributeName);
    }

    public void setAttribute(String attributeName, Object o) {
        getHttpSession().setAttribute(attributeName, o);
    }

    @Override
    public String getAuthToken() {
        Object o = getAttribute(AUTH_TOKEN_ATTRIBUTE_NAME);
        if(o != null) {
            return ((String) o);
        }
        return null;
    }

    @Override
    public void setAuthToken(String authToken) {
        setAttribute(AUTH_TOKEN_ATTRIBUTE_NAME, authToken);
    }

    @Override
    public void resetToken() {
        getHttpSession().removeAttribute(AUTH_TOKEN_ATTRIBUTE_NAME);
    }

    @Override
    public boolean hasToken() {
        return getHttpSession().getAttribute(AUTH_TOKEN_ATTRIBUTE_NAME) != null;
    }
}