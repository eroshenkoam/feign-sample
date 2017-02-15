package io.qameta.samples;

import org.junit.Test;

import java.util.List;

public class FeignSample {

    private final String organisation = "allure-framework";

    private final String repository = "allure1";

    private GitHubService gitHub = ServiceFactory.createGitHubService();

    @Test
    public void feignShouldConvertJsonResponseToObjectByDefault() {
        List<User> contributors = gitHub.contributors(organisation, repository);

        for (User contributor : contributors) {
            System.out.println(contributor.getName() + " (" + contributor.getContributions() + ")");
        }
    }

}
