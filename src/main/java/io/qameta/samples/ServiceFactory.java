package io.qameta.samples;

import feign.Feign;
import feign.gson.GsonDecoder;

public class ServiceFactory {

    private ServiceFactory() {
    }

    public static GitHubService createGitHubService () {
        return createService("https://api.github.com", GitHubService.class);
    }

    public static <T> T createService(String url, Class<T> service) {
        return Feign.builder()
                .decoder(new GsonDecoder())
                .target(service, url);
    }
}
