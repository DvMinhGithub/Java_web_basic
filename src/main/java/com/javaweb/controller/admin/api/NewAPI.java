package com.javaweb.controller.admin.api;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.javaweb.service.INewService;

@WebServlet(urlPatterns = { "/api-admin-new" })
public class NewAPI extends HttpServlet {
	private static final long serialVersionUID = -8051751262078913158L;

	@Inject
	private INewService categoryService;
	@Inject
	private INewService newService;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
				Long categoryId = 1L;
		request.setCharacterEncoding("UTF-8");
		response.setContentType("application/json");
			request.setAttribute("news", newService.findByCategoryId(categoryId));
			request.setAttribute("categories", categoryService.findByCategoryId(categoryId));
		// NewModel newModel = HttpUtil.of(request.getReader()).toModel(NewModel.class);
		// NewModel newModels = newService.save(newModel);
		// System.out.println(newModels.getTitle());
	}

	protected void doPut(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

	protected void doDelete(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
