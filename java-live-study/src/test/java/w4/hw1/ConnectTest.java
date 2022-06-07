package w4.hw1;

import org.junit.jupiter.api.Test;

import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

import java.io.IOException;

class ConnectTest {
    private GitHub gitHub;

    @Test
    public GitHub connectGithub() throws IOException {
        try {
            String gitToken = "";
            getToken(gitToken);
        } catch (Exception e) {
            throw new IOException("Check your github token");
        }
        return this.gitHub;
    }

    public void getToken(String gitToken) throws IOException{
        gitHub = new GitHubBuilder().withOAuthToken(gitToken).build();
        gitHub.checkApiUrlValidity();
    }

}
