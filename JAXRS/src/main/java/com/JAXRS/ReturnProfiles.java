package com.JAXRS;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.model.ProfileModel;

@Path("/profiles")
public class ReturnProfiles {
	
		public ProfileService profileService= new ProfileService();

	
	@GET
	@Produces(MediaType.APPLICATION_JSON)

	public List<ProfileModel> listProfile(@QueryParam("name")String name)
	{

		if(name.isEmpty()!=true)
		{
			return profileService.queryProfile(name);
		}
		return profileService.returnProfiles();
		
	}
	@GET
	@Path("/{name}")
	@Produces(MediaType.APPLICATION_JSON)

	
	public ProfileModel getProfile(@PathParam("name")String name)

	{
		System.out.println(profileService.returnProfile(name).getName());
		return profileService.returnProfile(name);
	}
	
	 @PUT
	  @Produces(MediaType.APPLICATION_JSON)
	  @Consumes(MediaType.APPLICATION_JSON)
	  public ProfileModel updateRecord(ProfileModel profileModel)
	  {
		 return profileService.updateProfile(profileModel);
	  }

}
