//package com.JAXRS;
//
//import javax.ws.rs.core.Response;
//import javax.ws.rs.core.Response.Status;
//import javax.ws.rs.ext.ExceptionMapper;
//import javax.ws.rs.ext.Provider;
//
//import com.exception.DataNotFound;
//import com.model.ErrorModel;
//@Provider
//public class DataNotFoundExceptionMapper implements ExceptionMapper<NullPointerException>{
//
//
//	@Override
//	public Response toResponse(NullPointerException arg0) {
//		// TODO Auto-generated method stub
//		ErrorModel errorModel= new ErrorModel("101", "Custom error Message");
//		return Response.status(Status.BAD_GATEWAY).entity(errorModel).build();
//	}
//
//}
