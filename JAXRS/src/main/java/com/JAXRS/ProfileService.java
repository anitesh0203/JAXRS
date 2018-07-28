package com.JAXRS;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.model.ProfileModel;

public class ProfileService {

	private Map<String,ProfileModel> profiles= new DatabasePlug().getProfiles();
	
	public ProfileService()
	{
		profiles.put("Anitesh", new ProfileModel("Anitesh", (long) 10001, "India"));
		profiles.put("Sandhya", new ProfileModel("Sandhya", (long) 10002, "America"));
		
	}
	
	public List<ProfileModel> returnProfiles()
	{
		return new ArrayList<ProfileModel>(profiles.values());
	}
	
	public ProfileModel returnProfile(String name)
	{
		return profiles.get(name);
	}
	
	public List<ProfileModel> queryProfile(String name)
	{
		if(profiles.get(name)!=null)
		{
			List<ProfileModel> profiler= new ArrayList<ProfileModel>();
			profiler.add(profiles.get(name));
			return profiler;
		}
		return null;
	}
	
	public ProfileModel updateProfile(ProfileModel profileModel)
	{
		return profiles.put(profileModel.getName(), profileModel);
	}
	
	public ProfileModel deleteProfile(String name){
		return profiles.remove(name);
	}
	
}
