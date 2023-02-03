package edu.unl.raikes.git;

public class GitLab {

    public static void main(String args[]) {
        String[] persons = { "Roy Dumblauskas", "Landry Geiger" };
        GitLabHelper helper = new GitLabHelper(persons);
        helper.PrintWelcomeMessage();
    }
    
}
