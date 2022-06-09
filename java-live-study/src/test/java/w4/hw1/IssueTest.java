package w4.hw1;

import org.junit.jupiter.api.Test;
import org.kohsuke.github.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class IssueTest {

    public static final String gitToken = "";
    @Test
    public void getIssue() throws IOException {
        GitHub gitHub = new GitHubBuilder().withOAuthToken(gitToken).build();
        List<GHIssue> issues = gitHub.getRepository("whiteship/live-study").getIssues(GHIssueState.ALL);
        assertEquals(18, issues.size());
    }

    @Test
    public void getComment() throws IOException{
        GitHub gitHub = new GitHubBuilder().withOAuthToken(gitToken).build();
        List<GHIssue> issues = gitHub.getRepository("whiteship/live-study").getIssues(GHIssueState.ALL);
        List<String> users = new ArrayList<>();

        for(GHIssue issue : issues){
            for(GHIssueComment comment : issue.getComments()){
                users.add(comment.getUser().getLogin());
            }
        }
        System.out.println(users);
        System.out.println(users.size());
    }

    @Test
    public void checkDuplicate() throws IOException{
        GitHub gitHub = new GitHubBuilder().withOAuthToken(gitToken).build();
        List<GHIssue> issues = gitHub.getRepository("whiteship/live-study").getIssues(GHIssueState.ALL);
        List<String> usersName = new ArrayList<>();

        for(GHIssue issue : issues){
            for(GHIssueComment comment : issue.getComments()){
                usersName.add(comment.getUser().getLogin());
            }
        }
        System.out.println(usersName);
        System.out.println(usersName.size());

        HashMap<String, Integer> userParticipant = new HashMap<>();

        for (String name : usersName) {
            if (userParticipant.containsKey(name)) { // if there is duplicate name
                userParticipant.put(name, userParticipant.get(name) + 1);
            } else {
                userParticipant.put(name, 1);
            }
        }
        System.out.println(userParticipant);
    }
}
