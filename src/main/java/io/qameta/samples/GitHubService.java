package io.qameta.samples;

import feign.Param;
import feign.RequestLine;

import java.util.List;

public interface GitHubService {

    @RequestLine("GET /repos/{owner}/{repo}/contributors")
    List<User> contributors(@Param("owner") String owner, @Param("repo") String repo);

}
