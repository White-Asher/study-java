package w4.hw1;

import org.junit.jupiter.api.Test;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

class ConnectTest {

    @Test
    public void connectGithub() throws IOException {
        try {
            String gitToken = "";
            GitHub gitHub = new GitHubBuilder().withOAuthToken(gitToken).build();
            gitHub.checkApiUrlValidity();
        } catch (Exception e) {
            throw new IOException("Check your github token");
        }
    }

}
