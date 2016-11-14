package com.hahaeasy.easyjaxrs;

import com.google.gson.Gson;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;

/**
 * Created by tonyxue on 11/13/16.
 */
public class GithubService {
	static final String GithubUrl = "https://api.github.com/users/whatever";

	private static final Gson gson = new Gson();

	public static GithubWhateverResponse getGithubResponse() {
		Client client = ClientBuilder.newClient();
		WebTarget target = client.target(GithubUrl);
		String jsonResult = target
						.request(MediaType.APPLICATION_JSON_TYPE)
						.header("content-type", MediaType.APPLICATION_JSON)
						.get(String.class);

		return gson.fromJson(jsonResult, GithubWhateverResponse.class);
	}
}
