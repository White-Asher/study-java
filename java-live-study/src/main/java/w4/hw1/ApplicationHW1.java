package w4.hw1;

import org.kohsuke.github.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ApplicationHW1 {
    public static final String gitToken = "";
    public static final String REPOSITORY = "whiteship/live-study";
    public static final String NO_ISSUE_MESSAGE = "No issue";
    private GitHub gitHub;

    public static void main(String[] args) throws IOException{
        ApplicationHW1 applicationHW1 = new ApplicationHW1();
        try {
            applicationHW1.run();
        } catch (Exception e) {
            throw new IOException("Check your github token");
        }
    }

    public void run() throws IOException{
        gitHub = new GitHubBuilder().withOAuthToken(gitToken).build();
        gitHub.checkApiUrlValidity();

        // 레지 이슈 불러옴
        List<GHIssue> issues = getIssue();

        // 이름 저장 (중복되지 않은 이름)
        List<String> usersName = getUsers(issues);

        // 이름과 참여 수 저장
        HashMap<String, Integer> userParticipant = checkParticipant(usersName);

        showPercent(issues, userParticipant);
    }

    public void showPercent(List<GHIssue> issues, HashMap<String, Integer> userParticipant){
        for(Map.Entry<String, Integer> entry : userParticipant.entrySet()){
            double percent = Math.round(entry.getValue() / (double)issues.size()*100.0*100.0)/100.0;
            System.out.println("User : '"+ entry.getKey() +"' issueProgress : '" + percent +"%'");
        }
    }

    public HashMap<String, Integer> checkParticipant(List<String> usersName){
        HashMap<String, Integer> userParticipant = new HashMap<>();
        for (String name : usersName) {
            if (userParticipant.containsKey(name)) {
                userParticipant.put(name, userParticipant.get(name) + 1);
            } else {
                userParticipant.put(name, 1);
            }
        }
        return userParticipant;
    }

    public List<String> getUsers(List<GHIssue> issues) throws IOException {
        List<String> usersName = new ArrayList<>();
        for(GHIssue issue : issues){
            for(GHIssueComment comment : issue.getComments()){
                usersName.add(comment.getUser().getLogin());
            }
        }
        return usersName;
    }

    public List<GHIssue> getIssue() throws IOException {
        List<GHIssue> issues = gitHub.getRepository(REPOSITORY).getIssues(GHIssueState.ALL);
        nullcheckIssue(issues);
        return issues;
    }

    public void nullcheckIssue(List<GHIssue> issues){
        if(issues.size() == 0){
            throw new IndexOutOfBoundsException(NO_ISSUE_MESSAGE);
        }
    }

}
