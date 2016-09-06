package com.tradenity.sdk.spring.web;

import com.tradenity.sdk.model.PageRequest;

import org.springframework.data.domain.Pageable;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by joseph
 * on 9/2/16.
 */
public class Utils {
    public static PageRequest pageRequest(Pageable p){
        return new PageRequest(p.getPageNumber(), p.getPageSize(), p.getOffset());
    }

    public static PageRequest pageRequest(HttpServletRequest request){
        return new PageRequest(
                Integer.getInteger(request.getParameter("page")),
                Integer.getInteger(request.getParameter("size")),
                Integer.getInteger(request.getParameter("offset")));
    }
}
