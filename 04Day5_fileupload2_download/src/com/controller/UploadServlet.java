package com.controller;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

@WebServlet("/UploadServlet")
public class UploadServlet extends HttpServlet {
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		boolean isMultipart = ServletFileUpload.isMultipartContent(request);
		if (isMultipart) {
			System.out.println("");

			// Create a factory for disk-based file items
			DiskFileItemFactory factory = new DiskFileItemFactory();

			// Configure a repository (to ensure a secure temp location is used)
			ServletContext servletContext = this.getServletConfig().getServletContext();
			File repository = (File) servletContext.getAttribute("javax.servlet.context.tempdir");
			factory.setRepository(repository);

			// Create a new file upload handler
			ServletFileUpload upload = new ServletFileUpload(factory);
			// 
			// 1kb== 1024byte
			upload.setFileSizeMax(1024 * 1024 * 5);// 5M
			upload.setSizeMax(1024 * 1024 * 10);// 10M
			String fieldName = null;
			String fileName = null;
			String contentType = null;
			boolean isInMemory= false;
			long sizeInBytes = 0;
			// Parse the request
			try {
				List<FileItem> items = upload.parseRequest(request);

				// Process the uploaded items
				Iterator<FileItem> iter = items.iterator();
				
				while (iter.hasNext()) {
					FileItem item = iter.next();

					if (item.isFormField()) {
						// type="file"
						String name = item.getFieldName();
						//
						String value = item.getString("utf-8");
	System.out.println(name+"\t"+value);
					} else {
						// type="file" 
						 fieldName = item.getFieldName();
					     fileName = item.getName();
					     contentType = item.getContentType();
					     isInMemory = item.isInMemory();
					     sizeInBytes = item.getSize();
System.out.println("fieldName:"+ fieldName);					    
System.out.println("fileName:"+ fileName);					    
System.out.println("contentType:"+ contentType);					    
System.out.println("isInMemory:"+ isInMemory);					    
System.out.println("sizeInBytes:"+ sizeInBytes);					    
					    
				     // :   c:\\upload
			File f = new File("c:\\upload", fileName);
			try {
				item.write(f);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


					} // end if
				} // end while

			} catch (FileUploadException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			//응답처리
			response.setContentType("text/html;charset=utf-8");
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("파일명:<a href='서블릿?fileName="+fileName+"'>"+ fileName+"</a>");
			out.print("파일크기:"+ sizeInBytes);
			out.print("파일타입:"+ contentType);
			out.print("</body></html>");
			
		} else {
			System.out.println("파일요청 아님");
		}

	}// end doPost
}// end class
