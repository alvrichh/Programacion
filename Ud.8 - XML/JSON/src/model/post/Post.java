package model.post;

public class Post {

	private Integer userId;
	private Integer id;
	private String title;
	private String body;

	public Post() {
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body.replaceAll("\n", " ");
	}

	public void setBody(String body) {
		this.body = body;
	}

	@Override
	public String toString() {
		return "Post [UserId=" + getUserId() + ", Id=" + getId() + ", Title=" + getTitle() + ", Body=" + getBody() + "]";
	}

}