public class Id {

    private String userId;
    private String name;
    private String githubId;

    public Id(String userId, String name, String githubId) {
        this.userId = userId;
        this.name = name;
        this.githubId = githubId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGithubId() {
        return githubId;
    }

    public void setGithubId(String githubId) {
        this.githubId = githubId;
    }
}
