package com.hahaeasy.easyjaxrs;

import org.junit.Assert;

/**
 * Created by tonyxue on 11/13/16.
 */
public class GithubServiceTest {
	@org.junit.Test
	public void getGithubResponse() throws Exception {

		GithubWhateverResponse response = GithubService.getGithubResponse();

		Assert.assertTrue(response.getId() > 0);
	}

}